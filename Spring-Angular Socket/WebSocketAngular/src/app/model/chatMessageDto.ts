export class ChatMessageDto {
  user: String;
  message: String;

  constructor(user: String, message: String) {
    this.user = user;
    this.message = message;
  }
}
