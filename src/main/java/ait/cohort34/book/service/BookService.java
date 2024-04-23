package ait.cohort34.book.service;

import ait.cohort34.book.dto.AuthorDto;
import ait.cohort34.book.dto.BookDto;

import java.awt.print.Book;

public interface BookService {
    Boolean addBook(BookDto bookDto);
    BookDto findBookById(Integer id);
    BookDto removeBookById(Integer id);
    BookDto updateBookTitle(Integer id, String title);
    BookDto[] findBooksByAuthor(String author);
    BookDto[] findBooksByPublisher(String publisher);
    AuthorDto[] findBookAuthorsById(Integer id);
    String[] findPublishersByAuthor(String author);
    AuthorDto removeAuthor(String author);
}
