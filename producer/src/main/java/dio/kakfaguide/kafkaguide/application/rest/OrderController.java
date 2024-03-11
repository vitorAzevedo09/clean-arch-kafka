package dio.kakfaguide.kafkaguide.application.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dio.kakfaguide.kafkaguide.application.dto.OrderData;
import dio.kakfaguide.kafkaguide.domain.service.EventRegisterService;

/**
 * OrderController
 */
@RestController
@RequestMapping("/api")
public class OrderController {

  @Autowired
  private EventRegisterService eventRegisterService;

  @PostMapping("/save-order")
  public ResponseEntity<String> createOrder(@RequestBody OrderData orderData) {
    eventRegisterService.registerEvent("save-order", orderData);
    return ResponseEntity.ok("success");
  }

}
