package org.vikram.bishwajit.messenger.database;

import java.util.HashMap;
import java.util.Map;

import org.vikram.bishwajit.messenger.model.Message;
import org.vikram.bishwajit.messenger.model.Profile;

/**
 * @author Bishwajit.
 *
 */
public class DatabaseClass {
	private static Map<Long, Message> messages = new HashMap<>();
	private static Map<String, Profile> profiles = new HashMap<>();

	/**
	 * @return the messages
	 */
	public static Map<Long, Message> getMessages() {
		return messages;
	}

	/**
	 * @return the profiles
	 */
	public static Map<String, Profile> getProfiles() {
		return profiles;
	}

}
