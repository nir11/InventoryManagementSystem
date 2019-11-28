package OpenLegacy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class OpenLegacy {

	public static void main(String[] args) {

		// Create a spring boot application 
		SpringApplication.run(OpenLegacy.class, args);
			
	}

}
