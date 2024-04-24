package ait.cohort34.book.dao;

import ait.cohort34.book.model.Author;
import ait.cohort34.book.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.stream.Stream;

public interface AuthorRepository extends JpaRepository<Author, String> {

}
