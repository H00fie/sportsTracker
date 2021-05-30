package bm.app.sports.controller;

import bm.app.sports.service.ExerciseService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/v1")
@org.springframework.web.bind.annotation.RestController
@CrossOrigin
public class RestController {

    private ExerciseService exerciseService;

    public RestController(ExerciseService exerciseService){
        this.exerciseService = exerciseService;
    }

//    @GetMapping("/records")

}
