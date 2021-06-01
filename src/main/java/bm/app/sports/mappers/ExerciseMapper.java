package bm.app.sports.mappers;

import bm.app.sports.dto.ExerciseDto;
import bm.app.sports.entity.Exercise;

public interface ExerciseMapper {

    Exercise exerciseDtoToExercise(ExerciseDto exerciseDto);

    ExerciseDto exerciseToExerciseDto(Exercise exercise);
}
