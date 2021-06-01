package bm.app.sports.service;

import bm.app.sports.dto.ExerciseDto;
import bm.app.sports.entity.Exercise;

import java.util.List;

public interface ExerciseGetAll {

    List<ExerciseDto> listOfExercises(List<Exercise> list);
}
