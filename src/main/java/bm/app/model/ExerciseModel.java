package bm.app.model;

import lombok.*;
import org.springframework.stereotype.Component;

import java.sql.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component
public class ExerciseModel {

    private int id;
    private Date day;
    private String exercisetype;
    private int series;
    private int repetitions;





}
