package com.kng.testproject.data.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class ShortUrlResponseDto {

    private String originalUrl;

    private String shortUrl;
}
