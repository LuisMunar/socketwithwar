package springboot.socketwithwar.dto;

public class RequestDto {
  Long requestId;
  String action;

  public RequestDto(Long requestId, String action) {
    this.requestId = requestId;
    this.action = action;
  }

  public Long getRequestId() {
    return requestId;
  }

  public void setRequestId(Long requestId) {
    this.requestId = requestId;
  }

  public String getAction() {
    return action;
  }
  
  public void setAction(String action) {
    this.action = action;
  }
}
