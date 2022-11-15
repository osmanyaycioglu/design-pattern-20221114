package org.training.design.patterns.temp.creational;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;

@Builder(setterPrefix = "with")
@Getter
public class CustomerIm3 {

    private String    name;
    private String    surname;
    private String    username;
    private String    password;
    private LocalDate birthdate;

}
