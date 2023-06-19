package edu.mehmed.book.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import edu.mehmed.book.dto.BookDto;

@Component
@RequestMapping("/")
public class BookController {

	public BookController() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println(this.getClass().getSimpleName()+" : Object Created !");
	}

	@RequestMapping("/register")
	public ModelAndView saveBook(BookDto dto) {
		System.out.println(dto);
		return new ModelAndView("display.jsp");
	}
	
}
