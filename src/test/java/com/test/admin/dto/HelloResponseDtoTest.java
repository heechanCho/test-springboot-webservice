package com.test.admin.dto;

import com.test.admin.web.dto.HelloResponseDto;
import org.junit.Test;
import org.springframework.web.bind.annotation.RestController;

import static org.assertj.core.api.Assertions.assertThat;

@RestController
public class HelloResponseDtoTest {

    @Test
    public void lombok_function_test() {

        String name = "test";
        int amount = 1000;

        HelloResponseDto responseDto = new HelloResponseDto(name, amount);

        assertThat(responseDto.getName()).isEqualTo(name);
        assertThat(responseDto.getAmount()).isEqualTo(amount);
    }


}
