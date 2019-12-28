package org.vikram.bishwajit.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.vikram.bishwajit.messenger.database.DatabaseClass;
import org.vikram.bishwajit.messenger.exception.DataNotFoundException;
import org.vikram.bishwajit.messenger.model.Message;

/**
 * @author Bishwajit.
 *
 */
public class MessageService {

	private Map<Long, Message> messages = DatabaseClass.getMessages();

	public MessageService() {
		messages.put(1L, new Message("1", "ABC", "A"));
		messages.put(2L, new Message("2", "DEF", "B"));
	}

	public List<Message> getListMessage() {
		return new ArrayList<Message>(messages.values());
	}

	public Message getMessage(Long id) {
		
		if (null == messages.get(id)) {
			throw new DataNotFoundException("Message Not Found. Message id : " + id);
		}
		return messages.get(id);
	}

	public Message addMessage(Message message) {
		int mapSize = messages.size();
		message.setId(Integer.toString(mapSize));
		message.setName("Chhotu");
		message.setGrade("Good");
		return message;
	}

	public Message updateMessage(Message message) {
		if (Integer.parseInt(message.getId()) <= 0) {
			return null;
		}
		int mapSize = messages.size();
		messages.put(Long.valueOf(Integer.toString(mapSize)), message);
		return message;
	}

	public Message removeMessage(long id) {
		return messages.remove(id);
	}
}
