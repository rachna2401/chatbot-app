package com.chatbot.service;

import java.util.List;

import com.chatbot.model.Chatbot;
import com.chatbot.model.ChatbotResponse;
import com.chatbot.model.UserChatbotConversation;

public interface ChatbotService {

	List<Chatbot>getAllChatbots();
	ChatbotResponse saveUserChatbotConversation(UserChatbotConversation ucc);
}
