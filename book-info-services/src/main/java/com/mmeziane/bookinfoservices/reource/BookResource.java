package com.mmeziane.bookinfoservices.reource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.mmeziane.bookinfoservices.model.Book;
import com.mmeziane.bookinfoservices.model.BookSummary;

@RestController
@RequestMapping("/books")
public class BookResource {
	
	/*
	 * @RequestMapping("{bookId}") public Book getBookInfo(@PathVariable("bookId")
	 * String bookId) { return new Book("1", "Anna Woltz","De pizza spion"); }
	 */
	
	@Value("${api.key}")
    private String apiKey;

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/{bookId}")
    public Book getBookInfo(@PathVariable("bookId") String bookId) {
        BookSummary bookSummary = restTemplate.getForObject("http://localhost:8083/ratingsdata/bookId" + bookId + "?api_key=" +  apiKey, BookSummary.class);
        return new Book(bookId, bookSummary.getTitle(), bookSummary.getOverview());

    }

}
