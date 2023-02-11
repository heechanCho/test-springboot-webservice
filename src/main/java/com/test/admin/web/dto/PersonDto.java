package com.test.admin.web.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class PersonDto {

    private final String name;
    private final int age;
}
