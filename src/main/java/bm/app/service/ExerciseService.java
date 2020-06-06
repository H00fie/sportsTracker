package bm.app.service;

import bm.app.config.Connector;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;

import static bm.app.config.Constants.*;

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
}
