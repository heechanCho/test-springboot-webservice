package com.test.admin.dto;

import com.test.admin.web.dto.PersonDto;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PersonDtoTest {

    @Test
    public void PersonDto_Test() {

        String name = "chan";
        int age = 23;

        PersonDto personDto = new PersonDto(name, age);

        assertThat(personDto.getName()).isEqualTo(name);
        assertThat(personDto.getAge()).isEqualTo(age);

    }
}
