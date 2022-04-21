package cn.zlq.proxy;

public class sendproxy implements SendMessage {
	private final SendMessage sendMessage;

	public sendproxy(SendMessage sendMessage) {
		this.sendMessage = sendMessage;
	}


	@Override
	public String send(String message) {
		System.out.println("发送消息之前!!!耶耶耶");
		sendMessage.send(message);
		System.out.println("发送消息之后!!耶耶耶");
		return null;
	}
}
