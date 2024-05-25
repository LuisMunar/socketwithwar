package springboot.socketwithwar.controllers;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.stereotype.Controller;

import springboot.socketwithwar.dto.MessageDto;

@Controller
public class SocketController {

  @MessageMapping("/chat/{roomId}")
  @SendTo("/topic/{roomId}")
  public MessageDto chat(@DestinationVariable String roomId, MessageDto message) {
    return new MessageDto(message.getMessage(), message.getUser());
  }
}
