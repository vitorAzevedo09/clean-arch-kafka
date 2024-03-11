package dio.kafkaguide.kafkaguidemicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class KafkaguideMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaguideMicroserviceApplication.class, args);
	}

}
