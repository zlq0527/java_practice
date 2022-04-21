package cn.zlq.proxy;

public class Test {
	public static void main(String[] args) {
		SendMessage sendMessage = new SendMessageImpl();
		sendproxy sendproxy = new sendproxy(sendMessage);
		sendproxy.send("123");
	}
}
