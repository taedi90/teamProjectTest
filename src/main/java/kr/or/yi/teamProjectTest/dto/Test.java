package kr.or.yi.teamProjectTest.dto;

import lombok.*;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Test {
    @NonNull
    private long no;
    @NonNull
    private String dataTest;
}
