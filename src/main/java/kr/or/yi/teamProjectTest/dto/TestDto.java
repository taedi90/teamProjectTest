package kr.or.yi.teamProjectTest.dto;

import lombok.*;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TestDto {
    @NonNull
    private long no;
    @NonNull
    private String data;
}
