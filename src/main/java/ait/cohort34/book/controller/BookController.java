package ait.cohort34.book.controller;

import ait.cohort34.book.dto.AuthorDto;
import ait.cohort34.book.dto.BookDto;
import ait.cohort34.book.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class BookController {
    final BookService bookService;

    @PostMapping("/book")
    public Boolean addBook(@RequestBody BookDto bookDto) {
        return bookService.addBook(bookDto);
    }

    @GetMapping("/book/{id}")
    public BookDto findBookById(@PathVariable Integer id) {
        return bookService.findBookById(id);
    }

    @DeleteMapping("/book/{id}")
    public BookDto removeBookById(@PathVariable Integer id) {
        return bookService.removeBookById(id);
    }

    @PutMapping("/book/{id}/title/{title}")
    public BookDto updateBookTitle(@PathVariable Integer id, @PathVariable String title) {
        return bookService.updateBookTitle(id, title);
    }

    @GetMapping("/books/author/{author}")
    public BookDto[] findBooksByAuthor(@PathVariable String author) {
        return bookService.findBooksByAuthor(author);
    }

    @GetMapping("/books/publisher/{publisher}")
    public BookDto[] findBooksByPublisher(@PathVariable String publisher) {
        return bookService.findBooksByPublisher(publisher);
    }

    @GetMapping("/authors/book/{id}")
    public AuthorDto[] findBookAuthorsById(@PathVariable Integer id) {
        return bookService.findBookAuthorsById(id);
    }

    @GetMapping("/publishers/author/{author}")
    public String[] findPublishersByAuthor(@PathVariable String author) {
        return bookService.findPublishersByAuthor(author);
    }

    @DeleteMapping("/author/{author}")
    public AuthorDto removeAuthor(@PathVariable String author) {
        return bookService.removeAuthor(author);
    }
}
