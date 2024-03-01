package dio.kakfaguide.kafkaguide.application.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

/**
 * OrderController
 */
@RestController
public class OrderController {

  public ResponseEntity<String> createOrder() {
    return ResponseEntity.ok("Order created");
  }

}
