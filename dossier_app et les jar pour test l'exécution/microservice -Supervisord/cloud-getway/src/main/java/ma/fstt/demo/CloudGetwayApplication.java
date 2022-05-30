package ma.fstt.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class CloudGetwayApplication {

	@GetMapping("/")
	public String allAccess() {
	 return "hello";
	}
	public static void main(String[] args) {
		SpringApplication.run(CloudGetwayApplication.class, args);
	}

}
