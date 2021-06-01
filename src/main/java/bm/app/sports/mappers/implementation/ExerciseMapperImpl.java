package bm.app.sports.mappers.implementation;

import bm.app.sports.dto.ExerciseDto;
import bm.app.sports.entity.Exercise;
import bm.app.sports.mappers.ExerciseMapper;
import org.springframework.stereotype.Component;

@Component
public class ExerciseMapperImpl implements ExerciseMapper {

    @Override
    public Exercise exerciseDtoToExercise(ExerciseDto exerciseDto) {
        return Exercise.builder()
                .day(exerciseDto.getDay())
                .exerciseType(exerciseDto.getExerciseType())
                .series(exerciseDto.getSeries())
                .repetitions(exerciseDto.getRepetitions())
                .build();
    }

    @Override
    public ExerciseDto exerciseToExerciseDto(Exercise exercise) {
        return ExerciseDto.builder()
                .day(exercise.getDay())
                .exerciseType(exercise.getExerciseType())
                .series(exercise.getSeries())
                .repetitions(exercise.getRepetitions())
                .build();
    }
}
