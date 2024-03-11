package dio.kafkaguide.kafkaguidemicroservice.infra;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import dio.kafkaguide.kafkaguidemicroservice.domain.SaveOrderService;

/**
 * KafkaService
 */
@Service
public class KafkaService implements SaveOrderService {

  private static final Logger log = LogManager.getLogger(KafkaService.class);

  @KafkaListener(topics = "save-order", groupId = "microservice-save-order")
  public void exec(ConsumerRecord<String, String> record) {
    log.info("Key = ", record.key());
    log.info("Headers = ", record.headers());
    log.info("Value = ", record.value());

  }

}
