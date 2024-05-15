package Model.Repository;

import dto.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;


public interface BookRepository extends JpaRepository<Book, Long> {
    Optional<Book> findBookByAuthor (String author);
}