package com.chatbot.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.chatbot.model.Chatbot;
import com.chatbot.model.UserChatbotConversation;

public interface ChatbotDao {
	
	@Select("select id, name, description from chatbot")
	List<Chatbot> getAllChatbots();
	
	@Insert("insert into user_chatbot_conversations (user_id, chatbot_id, question, answer)values (#{userId}, #{chatbotId}, #{question}, #{answer})")
	void saveUserChatbotConversation(UserChatbotConversation con);
}
