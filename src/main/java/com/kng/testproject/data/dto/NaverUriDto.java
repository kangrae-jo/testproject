package com.kng.testproject.data.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class NaverUriDto {
    private String messages;
    private String code;
    private String result;

    @Getter
    @Setter
    public static class Result{
        private String hash;
        private String url;
        private String original;
    }
}
