package com.kng.testproject.controller;

import com.kng.testproject.data.dto.ShortUrlResponseDto;
import com.kng.testproject.service.ShortUrlService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/short-url")
public class ShortUrlController {

    private final Logger LOGGER = LoggerFactory.getLogger(ShortUrlController.class);

    @Value("${kng.short.url.id}")
    private String CLIENT_ID;

    @Value("${kng.short.url.secret}")
    private String CLIENT_SECRET;

    ShortUrlService shortUrlService;

    @Autowired
    public ShortUrlController(ShortUrlService shortUrlService) {
        this.shortUrlService = shortUrlService;
    }

    @PostMapping("/")
    public ShortUrlResponseDto generateShortUrl(String originalUrl){
        LOGGER.info("[generateShortUrl] perform API. CLIENT_ID : {}, CLIENT_SECRET : {}", CLIENT_ID, CLIENT_SECRET);

        return shortUrlService.generateShortUrl(CLIENT_ID, CLIENT_SECRET, originalUrl);
    }

    @GetMapping("/")
    public ShortUrlResponseDto getShortUrl(String originalUrl){
        ShortUrlResponseDto shortUrlResponseDto = new ShortUrlResponseDto("ss","ss");

        return shortUrlService.getShortUrl(CLIENT_ID, CLIENT_SECRET, originalUrl);
    }

    @PutMapping("/")
    public ShortUrlResponseDto updateShortUrl(String originalUrl){
        return null;
    }

    @DeleteMapping("/")
    public ShortUrlResponseDto deleteShortUrl(String originalUrl){
        return null;
    }

}
