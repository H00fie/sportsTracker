package bm.app.model;

import lombok.*;

import java.sql.Date;
import java.util.Optional;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ExerciseModel {

    private int id;
    private Date day;
    private String exercisetype;
    private int series;
    private int repetitions;





}
