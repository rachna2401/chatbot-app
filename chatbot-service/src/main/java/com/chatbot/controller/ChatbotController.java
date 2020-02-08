package com.chatbot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.chatbot.dao.ChatbotDao;
import com.chatbot.model.Chatbot;
import com.chatbot.model.ChatbotResponse;
import com.chatbot.model.UserChatbotConversation;
import com.chatbot.service.ChatbotService;

public class ChatbotController {
	
	@Autowired
	ChatbotService chatbotService;

	@GetMapping("/chatbot/all")
	List<Chatbot> getAllChatbots(){
		return chatbotService.getAllChatbots();
	}
	
	@PostMapping("/chatbot/ask")
	ChatbotResponse askChatbot(@RequestBody UserChatbotConversation ucc) {
		ChatbotResponse resp = chatbotService.saveUserChatbotConversation(ucc);
		return resp;
	}
}
