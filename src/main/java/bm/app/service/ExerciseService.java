package bm.app.service;

import bm.app.config.Connector;
import bm.app.model.ExerciseModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static bm.app.config.Constants.*;

@Service
public class ExerciseService {

    private static final Logger logger = LoggerFactory.getLogger(ExerciseService.class);

    private Connection getConnection(){
        Connection connection = Connector.createConnection(DEFAULT_DRIVER, DEFAULT_URL, DEFAULT_USERNAME, DEFAULT_PASSWORD);
        if (connection == null){
            logger.error("Cannot get connection.");
            return null;

        }
        return connection;
    }

    public boolean insertRecord(ExerciseModel exerciseModel){
        String sql ="insert into tracker (day, exercisetype, series, repetitions) values (?, ?, ?, ?)";
        try (final PreparedStatement preparedStatement = getConnection().prepareStatement(sql)){
                preparedStatement.setInt(1, exerciseModel.getDay());
                preparedStatement.setString(2, exerciseModel.getExercisetype());
                preparedStatement.setInt(3, exerciseModel.getSeries());
                preparedStatement.setInt(4, exerciseModel.getRepetitions());
                preparedStatement.executeUpdate();
        }catch (SQLException e){
            logger.error("Cannot insert a record.");
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public List<ExerciseModel> selectAllRecords(){
        List<ExerciseModel> list = new ArrayList();
        String sql = "select * from tracker";
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try{
            preparedStatement = getConnection().prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
        }catch (SQLException e){
            logger.error("Can't extract records.");
            e.printStackTrace();
        }

        try {
            while (resultSet.next()){
                ExerciseModel exerciseModel = new ExerciseModel();
                exerciseModel.setId(resultSet.getInt("id"));
                exerciseModel.setDay(resultSet.getInt("day"));
                exerciseModel.setExercisetype(resultSet.getString("exercisetype"));
                exerciseModel.setSeries(resultSet.getInt("series"));
                exerciseModel.setRepetitions(resultSet.getInt("repetitions"));
                list.add(exerciseModel);
            }

        }catch (SQLException e){
            logger.error("Can't construct a list of records.");
            e.printStackTrace();
        }
        return list;


    }

}
