package dio.kakfaguide.kafkaguide.infra.messaging;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

import dio.kakfaguide.kafkaguide.domain.service.EventRegisterService;

/**
 * KafkaEventRegisterService
 */
public class KafkaEventRegisterService implements EventRegisterService {

  @Autowired
  private final KafkaTemplate<Object, Object> kafkaTemplate = null;

  public <T> void registerEvent(String topic, T data) {
    kafkaTemplate.send(topic, data);
  }
}
