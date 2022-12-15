package com.study.ex09_validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class ContentValidator implements Validator {

	@Override public boolean supports(Class<?> clazz) {
		// 검증할 객체의 클래스 타입 정보
		return ContentDto.class.isAssignableFrom(clazz);
	}

	@Override public void validate(Object target, Errors errors) {
		ContentDto dto = (ContentDto) target;

		String sWriter = dto.getWriter();
		if (sWriter == null || sWriter.trim().isEmpty()) {
			System.out.println("Content is null or empty");
			errors.rejectValue("content", "trouble");
		}
	}
}
