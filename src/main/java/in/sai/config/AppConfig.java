package in.sai.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages ="in.sai")
public class AppConfig {
	public AppConfig() {
	System.out.println("AppConfig :: Constructor");

}
}