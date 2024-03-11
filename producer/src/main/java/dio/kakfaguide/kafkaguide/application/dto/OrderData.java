package dio.kakfaguide.kafkaguide.application.dto;

import java.math.BigDecimal;

/**
 * OrderData
 */
public record OrderData(
    String code,
    String productName,
    BigDecimal value) {
}
