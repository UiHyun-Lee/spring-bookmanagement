package Controller;

import Model.Repository.BookRepository;
import dto.Book;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@SpringBootApplication
public class BookmanagemntApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BookmanagemntApplication.class, args);
	}


	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/Book";


	static final String USER = "root";
	static final String PASS = "q2w0e8dml2!";

	Connection conn;

	{
		try {
			conn = DriverManager.getConnection(DB_URL,USER,PASS);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void run(String... args) throws Exception {
		Book book = Book.builder()
				.price(123)
				.title("abc")
				.isbn(1)
				.content("comedy")
				.author("lee")
				.build();
		BookRepository bookRepository = new BookRepository() {
			@Override
			public Optional<Book> findBookByAuthor(String author) {
				return Optional.empty();
			}

			@Override
			public void flush() {

			}

			@Override
			public <S extends Book> S saveAndFlush(S entity) {
				return null;
			}

			@Override
			public <S extends Book> List<S> saveAllAndFlush(Iterable<S> entities) {
				return null;
			}

			@Override
			public void deleteAllInBatch(Iterable<Book> entities) {

			}

			@Override
			public void deleteAllByIdInBatch(Iterable<Long> longs) {

			}

			@Override
			public void deleteAllInBatch() {

			}

			@Override
			public Book getOne(Long aLong) {
				return null;
			}

			@Override
			public Book getById(Long aLong) {
				return null;
			}

			@Override
			public Book getReferenceById(Long aLong) {
				return null;
			}

			@Override
			public <S extends Book> List<S> findAll(Example<S> example) {
				return null;
			}

			@Override
			public <S extends Book> List<S> findAll(Example<S> example, Sort sort) {
				return null;
			}

			@Override
			public <S extends Book> List<S> saveAll(Iterable<S> entities) {
				return null;
			}

			@Override
			public List<Book> findAll() {
				return null;
			}

			@Override
			public List<Book> findAllById(Iterable<Long> longs) {
				return null;
			}

			@Override
			public <S extends Book> S save(S entity) {
				return entity;
			}

			@Override
			public Optional<Book> findById(Long aLong) {
				return Optional.empty();
			}

			@Override
			public boolean existsById(Long aLong) {
				return false;
			}

			@Override
			public long count() {
				return 0;
			}

			@Override
			public void deleteById(Long aLong) {

			}

			@Override
			public void delete(Book entity) {

			}

			@Override
			public void deleteAllById(Iterable<? extends Long> longs) {

			}

			@Override
			public void deleteAll(Iterable<? extends Book> entities) {

			}

			@Override
			public void deleteAll() {

			}

			@Override
			public List<Book> findAll(Sort sort) {
				return null;
			}

			@Override
			public Page<Book> findAll(Pageable pageable) {
				return null;
			}

			@Override
			public <S extends Book> Optional<S> findOne(Example<S> example) {
				return Optional.empty();
			}

			@Override
			public <S extends Book> Page<S> findAll(Example<S> example, Pageable pageable) {
				return null;
			}

			@Override
			public <S extends Book> long count(Example<S> example) {
				return 0;
			}

			@Override
			public <S extends Book> boolean exists(Example<S> example) {
				return false;
			}

			@Override
			public <S extends Book, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
				return null;
			}
		};

		bookRepository.save(book);
	}
}