import { ChatMessageDto } from "./../model/chatMessageDto";
import { WebSocketService } from "./../service/web-socket.service";
import { Component, OnDestroy, OnInit } from "@angular/core";
import { NgForm } from "@angular/forms";

@Component({
  selector: "cf-chat",
  templateUrl: "./chat.component.html",
  styleUrls: ["./chat.component.scss"],
})
export class ChatComponent implements OnInit, OnDestroy {
  constructor(public webSocketService: WebSocketService) {}

  ngOnInit(): void {
    this.webSocketService.openWebSocket();
  }

  ngOnDestroy(): void {
    this.webSocketService.closeWebSocket();
  }

  sendMessage(sendForm: NgForm) {
    const chatMessageDto = new ChatMessageDto(
      sendForm.value.user,
      sendForm.value.message
    );
    this.webSocketService.sendMessage(chatMessageDto);
    sendForm.controls.message.reset();
  }
}
