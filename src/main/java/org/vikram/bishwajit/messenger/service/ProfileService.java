package org.vikram.bishwajit.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.vikram.bishwajit.messenger.database.DatabaseClass;
import org.vikram.bishwajit.messenger.model.Profile;

/**
 * @author Bishwajit.
 *
 */
public class ProfileService {
	private Map<String, Profile> profiles = DatabaseClass.getProfiles();

	public ProfileService() {
		profiles.put("1", new Profile("1", "ABC", "A"));
		profiles.put("2", new Profile("2", "DEF", "B"));
	}

	public List<Profile> getListProfile() {
		return new ArrayList<Profile>(profiles.values());
	}

	public Profile getProfile(Long id) {
		return profiles.get(id);
	}

	public Profile addProfile(Profile profile) {
		int mapSize = profiles.size();
		profile.setId(Integer.toString(mapSize));
		profile.setName("Chhotu");
		profile.setGrade("Good");
		return profile;
	}

	public Profile updateProfile(Profile profile) {
		if (Integer.parseInt(profile.getId()) <= 0) {
			return null;
		}
		int mapSize = profiles.size();
		profiles.put(String.valueOf(mapSize), profile);
		return profile;
	}

	public Profile removeProfile(long id) {
		return profiles.remove(id);
	}
}
