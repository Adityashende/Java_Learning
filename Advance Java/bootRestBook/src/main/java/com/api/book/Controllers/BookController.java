package com.api.book.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import entities.Books;
import services.BookService;

//import com.api.book.Controllers.BookService;
@RestController
public class BookController {

	@Autowired
	private BookService bookService;

	@GetMapping("/books")
	public ResponseEntity<List<Books>> getBooks() {
		List<Books> list = bookService.getAllBooks();
		if (list.size() <= 0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

		}
		return ResponseEntity.of(Optional.of(list));
	}

	@PostMapping("/books")
	public Books addBook(@RequestBody Books book) {
		Books b2 = this.bookService.addBook(book);
		return b2;
	}

	@DeleteMapping("/books/{booksId}")
	public void deleteBook(@PathVariable("BookId") int bookId) {
		this.bookService.deleteBook(bookId);
	}

	@PutMapping("/books/{bookId}")
	public Books updateBook(@RequestBody Books book, @PathVariable("bookId") int BookId) {

		this.bookService.updateBook(book, BookId);
		return book;
	}

}
