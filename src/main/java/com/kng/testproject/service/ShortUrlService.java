package com.kng.testproject.service;

import com.kng.testproject.data.dto.ShortUrlResponseDto;

public interface ShortUrlService {

    ShortUrlResponseDto getShortUrl(String clientId, String clientSecret,String originalUrl);

    ShortUrlResponseDto generateShortUrl(String clientId, String clientSecret,String originalUrl);

    ShortUrlResponseDto updateShortUrl(String clientId, String clientSecret,String originalUrl);

    void deleteByShortUrl(String shortUrl);
}
