package Model.Service;

import Model.Repository.BookRepository;
import dto.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{

    BookRepository bookRepository;

    @Autowired
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public BookRepository getBookRepository() {
        return bookRepository;
    }

    @Override
    public int insert(Book book) {
        return 0;
    }

    @Override
    public int update(Book book) {
        return 0;
    }

    @Override
    public int delete(String isbn) {
        return 0;
    }

    @Override
    public Book select(String isbn) {
        return null;
    }

    @Override
    public List<Book> search() {
        return null;
    }
}
