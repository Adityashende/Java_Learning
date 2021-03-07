package services;

import java.util.ArrayList;
import java.util.List;
//import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Service;

import entities.Books;

@Component
public class BookService {
	
	private static List<Books> list = new ArrayList<>();
	
	static {
		list.add(new Books(2345,"Java","YZX"));
		list.add(new Books(5252,"C","KJH"));
		list.add(new Books(321,"C++","JHG"));
	}
	
	public List<Books> getAllBooks(){
		return list;
	}
	
	public Books getBookById(int id) {
		Books book=list.stream().filter(e->e.getId()==id).findFirst().get();
		return book;
	}
	
	public Books addBook(Books b) {
		list.add(b);
		return b;
	}
	
	public void deleteBook(int id) {
		list.stream().filter(book->{
			if(book.getId()!=id) {
				return true;
			}
			else {
				return false;
			}
		}).collect(Collectors.toList());
	}

	public void updateBook(Books book,int bookId) {
		
		list.stream().map(b->{
			if (b.getId()==bookId) {
				b.setTitle(book.getTitle());
				b.setAuthor(book.getAuthor());
			}
			
			return b;
		}).collect(Collectors.toList());
	}
	
	
}
