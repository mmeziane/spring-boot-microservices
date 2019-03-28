package com.mmeziane.bookcatalogservices.resource;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClient.Builder;

import com.mmeziane.bookcatalogservices.model.Book;
import com.mmeziane.bookcatalogservices.model.CatalogItem;
import com.mmeziane.bookcatalogservices.model.UserBookRating;

@RestController
@RequestMapping("/catalog")
public class BookCatalogResource {
	
	@Autowired
    private RestTemplate restTemplate;

    @Autowired
    Builder webClientBuilder;

	@RequestMapping("/{visitorId}")
    public List<CatalogItem> getCatalog(@PathVariable("visitorId") String visitorId) {
		UserBookRating userRating = restTemplate.getForObject("http://ratings-data-service/ratingsdata/user/" + visitorId, UserBookRating.class);

        return userRating.getRatings().stream()
                .map(rating -> {
                    //Book book = restTemplate.getForObject("http://book-info-service/books/" + rating.getBookId(), Book.class);
                    return new CatalogItem("Jushua Bloch", "Effective Java", 4);
                })
                .collect(Collectors.toList());


    }
}