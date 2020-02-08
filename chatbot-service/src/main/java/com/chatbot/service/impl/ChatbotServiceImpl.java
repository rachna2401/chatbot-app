package com.chatbot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.chatbot.dao.ChatbotDao;
import com.chatbot.model.Chatbot;
import com.chatbot.model.ChatbotResponse;
import com.chatbot.model.UserChatbotConversation;
import com.chatbot.service.ChatbotService;

public class ChatbotServiceImpl implements ChatbotService {
	
	@Autowired
	ChatbotDao chatbotDao;

	@Override
	public List<Chatbot> getAllChatbots() {
		// TODO Auto-generated method stub
		return chatbotDao.getAllChatbots();
	}

	@Override
	public ChatbotResponse saveUserChatbotConversation(UserChatbotConversation ucc) {
		// TODO Auto-generated method stub
		chatbotDao.saveUserChatbotConversation(ucc);
		//business logic to talk to chatbot and get response
		return new ChatbotResponse();
	}

}
