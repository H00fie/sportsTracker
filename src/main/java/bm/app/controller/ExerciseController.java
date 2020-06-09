package bm.app.controller;

import bm.app.model.ExerciseModel;
import bm.app.service.ExerciseService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.Date;
import java.util.List;

@Controller
public class ExerciseController {

    private ExerciseService exerciseService;

    public ExerciseController(ExerciseService exerciseService){
        this.exerciseService = exerciseService;
    }


    @GetMapping("home")
    public String getHome(){
        return "home";
    }

    @PostMapping("home")
    public String addResult(@RequestParam Date day,
                            @RequestParam String exercisetype,
                            @RequestParam int series,
                            @RequestParam int repetitions,
                            Model model){
        ExerciseModel exerciseModel = new ExerciseModel();
        exerciseModel.setDay(day);
        exerciseModel.setExercisetype(exercisetype);
        exerciseModel.setSeries(series);
        exerciseModel.setRepetitions(repetitions);
        exerciseService.insertRecord(exerciseModel);
        model.addAttribute("day", day);
        model.addAttribute("exercisetype", exercisetype);
        model.addAttribute("series", series);
        model.addAttribute("repetitions", repetitions);

        return "result";
    }

    @PostMapping("allrecords")
    public String displayAllRecords(Model model){
        List<ExerciseModel> listOfRecords = exerciseService.selectAllRecords();
        model.addAttribute("listOfRecords", listOfRecords);
        return "allrecords";
    }

    @PostMapping("allpushups")
    public String displayAllPushups(Model model){
        List<ExerciseModel> listOfPushups = exerciseService.selectAllPushUps();
        model.addAttribute("listOfPushups", listOfPushups);
        return "allpushups";
    }
}
