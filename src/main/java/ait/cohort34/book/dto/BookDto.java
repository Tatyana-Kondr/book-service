package ait.cohort34.book.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
public class BookDto {
    Integer isbn;
    @Setter
    String title;
    AuthorDto[] authors;
    String publisher;
}
