package cn.zlq.proxy;

public class SendMessageImpl implements SendMessage {

	@Override
	public String send(String message) {
		System.out.println(message);
		return message;
	}
}
