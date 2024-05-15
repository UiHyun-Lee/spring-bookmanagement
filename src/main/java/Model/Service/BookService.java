package Model.Service;

import dto.Book;

import java.util.List;

public interface BookService {

    int insert(Book book);
    int update(Book book);
    int delete(String isbn);
    Book select(String isbn);
    List<Book> search();
}