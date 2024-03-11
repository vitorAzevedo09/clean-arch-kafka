package dio.kakfaguide.kafkaguide;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class KafkaguideApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaguideApplication.class, args);
	}

}
