package com.kodilla.rest.controller;

import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

class BookControllerTest {

    @Test
    public void shouldFetchBooks() {
        //given
        BookService bookServiceMock = Mockito.mock(BookService.class);
        BookController bookController = new BookController(bookServiceMock);
        List<BookDto> booksList = new ArrayList<>();
        booksList.add(new BookDto("Title 1", "Author 1"));
        booksList.add(new BookDto("Title 2", "Author 2"));
        Mockito.when(bookServiceMock.getBooks()).thenReturn(booksList);

        //when
        List<BookDto> result = bookController.getBooks();

        //then
        assertThat(result).hasSize(2);
    }

    @Test
    public void shouldAddBooks() {
        BookService bookService = Mockito.mock(BookService.class);
        BookController bookController = new BookController(bookService);
        BookDto firstBook = new BookDto("Title 1", "Author 1");
        bookController.addBook(firstBook);
        Mockito.verify(bookService, Mockito.times(1)).addBook(firstBook);
    }

    @Test
    public void shouldAddConcreteBook() {
        BookService bookService = Mockito.mock(BookService.class);
        BookController bookController = new BookController(bookService);
        List<BookDto> bookList = new ArrayList<>();
        bookList.add(new BookDto("Title 1", "Author 1"));
        bookList.add(new BookDto("Title 2", "Author 2"));
        Mockito.when(bookService.getBooks()).thenReturn(bookList);
        List<BookDto> result = bookController.getBooks();

        assertThat(result.containsAll(bookList));
    }
}