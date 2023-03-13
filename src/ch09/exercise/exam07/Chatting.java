package ch09.exercise.exam07;

public class Chatting {
	class Chat{
		void start() {}
		void sendMessage(String message) {}
	}
	
	void startChat(String chatId) {
		final String nickName = chatId; // effectively final 변수를 사용하지 않아서 오류가 발생했었음
		
		Chat chat = new Chat() {
			@Override
			void start() {
				while(true) {
					String inputData = "안녕하세요";
					String message = "[" + nickName + "]" + inputData;
					sendMessage(message);
				}
			}
		};
		
		chat.start();
	}
}
