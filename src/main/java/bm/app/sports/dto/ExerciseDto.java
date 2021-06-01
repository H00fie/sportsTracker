package bm.app.sports.dto;

import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class ExerciseDto {

    private Long id;
    private Date day;
    private String exerciseType;
    private int series;
    private int repetitions;
}
