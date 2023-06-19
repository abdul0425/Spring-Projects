package edu.jspider.SpringBasics;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.jspider.SpringBasics.JavaConfiguration.ApplicationConfiguration;
import edu.jspider.SpringBasics.JavaConfiguration.Music;
import edu.jspider.SpringBasics.XMLConfiguration.BookTicket;
import edu.jspider.SpringBasics.XMLConfiguration.Car;
import edu.jspider.SpringBasics.XMLConfiguration.Song;

/**
 * Hello world!
 *
 */
public class App {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("new-spring-web.xml");
		BookTicket ticket = context.getBean(BookTicket.class);
		ticket.bookingConfirmation();
		System.out.println(ticket);

		Car car = (Car) context.getBean("car");
		System.out.println(car);

		Song song = context.getBean(Song.class);
		System.out.println(song);

	}
}
