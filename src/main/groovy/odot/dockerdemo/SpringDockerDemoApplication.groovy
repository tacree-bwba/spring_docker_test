package odot.dockerdemo

import groovy.util.logging.Slf4j
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@Slf4j
@RestController
@SpringBootApplication
class SpringDockerDemoApplication {
	@GetMapping("/")
	public String home() {
		return "Hello From Spring Boot Application"
	}

	static void main(String[] args) {
		SpringApplication.run(SpringDockerDemoApplication, args)
	}

}
