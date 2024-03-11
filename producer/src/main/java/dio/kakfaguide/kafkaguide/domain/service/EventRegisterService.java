package dio.kakfaguide.kafkaguide.domain.service;

/**
 * EventRegisterService
 */
public interface EventRegisterService {

  public <T> void registerEvent(String event, T data);
}
