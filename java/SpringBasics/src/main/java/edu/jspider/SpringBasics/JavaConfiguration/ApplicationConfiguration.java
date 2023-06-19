package edu.jspider.SpringBasics.JavaConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("edu.jspider.SpringBasics")
public class ApplicationConfiguration {

	@Bean
	public HindiSong getTeluguSongObject()
	{
		return new HindiSong();
	}
}
