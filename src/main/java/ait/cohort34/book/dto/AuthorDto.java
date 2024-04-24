package ait.cohort34.book.dto;

import lombok.Getter;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;

@EqualsAndHashCode
@Getter
public class AuthorDto {
    String name;
    LocalDate birthDate;
}
