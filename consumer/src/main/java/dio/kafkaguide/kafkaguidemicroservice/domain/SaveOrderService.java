package dio.kafkaguide.kafkaguidemicroservice.domain;

import org.apache.kafka.clients.consumer.ConsumerRecord;

/**
 * SaveOrderService
 */
public interface SaveOrderService {

  public void exec(ConsumerRecord<String, String> record);
}
