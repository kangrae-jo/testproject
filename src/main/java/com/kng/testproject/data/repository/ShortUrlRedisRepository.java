package com.kng.testproject.data.repository;

import com.kng.testproject.data.dto.ShortUrlResponseDto;

import org.springframework.data.repository.CrudRepository;

public interface ShortUrlRedisRepository extends CrudRepository<ShortUrlResponseDto, String> {
}
