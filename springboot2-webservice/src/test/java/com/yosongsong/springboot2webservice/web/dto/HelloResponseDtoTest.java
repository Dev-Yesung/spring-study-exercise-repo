package com.yosongsong.springboot2webservice.web.dto;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class HelloResponseDtoTest {
	@Test
	public void lombokTest() {
		String name = "test";
		int amount = 1000;

		HelloResponseDto dto = new HelloResponseDto(name, amount);

		Assertions.assertThat(dto.getName()).isEqualTo(name);
		Assertions.assertThat(dto.getAmount()).isEqualTo(amount);
	}
}
