package edu.jspider.SpringBasics.JavaConfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(ApplicationConfiguration.class);
		context.refresh();
		TeluguSong song=context.getBean(TeluguSong.class);
		System.out.println(song);
		
		Music music=context.getBean(Music.class);
		System.out.println(music);
		
		context.getBean(ScopeClass.class);
		context.getBean(ScopeClass.class);
		context.getBean(ScopeClass.class);
		context.getBean(ScopeClass.class);
		context.getBean(ScopeClass.class);
		
		
		
		
		
		
	}
}
