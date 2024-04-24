package ait.cohort34.book.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
public class BookDto {
    String isbn;
    @Setter
    String title;
    Set<AuthorDto> authors;
    String publisher;
}
