package in.sai.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.sai.config.AppConfig;

public class App {

	public static void main(String[] args) {

		
ApplicationContext ctx =
	new AnnotationConfigApplicationContext(AppConfig.class);
		
		
	}

}
