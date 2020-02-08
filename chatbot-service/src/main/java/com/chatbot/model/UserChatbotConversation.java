package com.chatbot.model;

public class UserChatbotConversation {
	private int id;
	private int userId;
	private int chatbotId;
	private String question;
	private String answer;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getChatbotId() {
		return chatbotId;
	}
	public void setChatbotId(int chatbotId) {
		this.chatbotId = chatbotId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	

}
