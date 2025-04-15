// Name: Talal Al Zuhair, Student ID: 991658377
package ca.sheridan.alzuhait.a4_webservices.repository;

import ca.sheridan.alzuhait.a4_webservices.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByTitleContaining(String title);
}