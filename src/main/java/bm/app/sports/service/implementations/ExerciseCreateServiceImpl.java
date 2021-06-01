package bm.app.sports.service.implementations;

import bm.app.sports.dto.ExerciseDto;
import bm.app.sports.entity.Exercise;
import bm.app.sports.mappers.ExerciseMapper;
import bm.app.sports.repository.ExerciseRepository;
import bm.app.sports.service.ExerciseCreateService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Date;

@RequiredArgsConstructor
@AllArgsConstructor
@Service
public class ExerciseCreateServiceImpl implements ExerciseCreateService {

    private static final Logger logger = LoggerFactory.getLogger(ExerciseCreateServiceImpl.class);
    private ExerciseRepository exerciseRepository;
    private ExerciseMapper exerciseMapper;

    @Override
    public void createExercise(ExerciseDto exerciseDto) {
        exerciseDto.setDay(new Date());
        Exercise savedExercise = exerciseRepository.save(exerciseMapper.exerciseDtoToExercise(exerciseDto));
        logger.info("New record added: " + savedExercise);
    }
}
