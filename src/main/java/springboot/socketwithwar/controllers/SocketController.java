package springboot.socketwithwar.controllers;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.stereotype.Controller;

import springboot.socketwithwar.dto.MessageDto;
import springboot.socketwithwar.dto.RequestDto;

@Controller
public class SocketController {

  @MessageMapping("/chat/{roomId}")
  @SendTo("/topic/{roomId}")
  public MessageDto chat(@DestinationVariable String roomId, MessageDto message) {
    return new MessageDto(message.getMessage(), message.getUser());
  }

  @MessageMapping("/notifications/requests")
  @SendTo("/topic/requests")
  public RequestDto requestsNotifications(RequestDto params) {
    return new RequestDto(params.getRequestId(), params.getAction());
  }

  @MessageMapping("/notifications/request")
  @SendTo("/topic/request")
  public RequestDto requestNotifications(RequestDto params) {
    return new RequestDto(params.getRequestId(), params.getAction());
  }
}
