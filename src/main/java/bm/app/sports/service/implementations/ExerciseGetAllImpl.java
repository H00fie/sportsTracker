package bm.app.sports.service.implementations;

import bm.app.sports.dto.ExerciseDto;
import bm.app.sports.entity.Exercise;
import bm.app.sports.mappers.ExerciseMapper;
import bm.app.sports.mappers.implementation.ExerciseMapperImpl;
import bm.app.sports.service.ExerciseGetAll;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@AllArgsConstructor
@Service
public class ExerciseGetAllImpl implements ExerciseGetAll {

    private ExerciseMapperImpl exerciseMapper;

    @Override
    public List<ExerciseDto> listOfExercises(List<Exercise> list) {
        List<ExerciseDto> resultList = new ArrayList<>();
        for(int i = 0; i < list.size(); i++) {
            resultList.add(exerciseMapper.exerciseToExerciseDto(list.get(i)));
        }
        return resultList;
    }
}
