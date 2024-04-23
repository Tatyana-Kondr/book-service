package ait.cohort34.book.service;

import ait.cohort34.book.dao.BookRepository;
import ait.cohort34.book.dto.AuthorDto;
import ait.cohort34.book.dto.BookDto;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService{

    final BookRepository bookRepository;
    final ModelMapper modelMapper;

    @Override
    public Boolean addBook(BookDto bookDto) {
        return null;
    }

    @Override
    public BookDto findBookById(Integer id) {
        return null;
    }

    @Override
    public BookDto removeBookById(Integer id) {
        return null;
    }

    @Override
    public BookDto updateBookTitle(Integer id, String title) {
        return null;
    }

    @Override
    public BookDto[] findBooksByAuthor(String author) {
        return new BookDto[0];
    }

    @Override
    public BookDto[] findBooksByPublisher(String publisher) {
        return new BookDto[0];
    }

    @Override
    public AuthorDto[] findBookAuthorsById(Integer id) {
        return new AuthorDto[0];
    }

    @Override
    public String[] findPublishersByAuthor(String author) {
        return new String[0];
    }

    @Override
    public AuthorDto removeAuthor(String author) {
        return null;
    }
}
