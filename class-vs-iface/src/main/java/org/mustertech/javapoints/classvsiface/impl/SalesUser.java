package org.mustertech.javapoints.classvsiface.impl;

import java.util.AbstractMap;
import java.util.Map;

import org.mustertech.javapoints.classvsiface.User;

public class SalesUser extends User {
	private int targetedConversions = 100;

	public SalesUser(String userId, String plainPassCode) {
		super();
	}

	@Override
	public Map<String, String> userDetails(String userId) {
		if (!userId.equals(this.email) || !userId.equals(this.phone)) {
			return null;
		}

		Map<String, String> result = Map.ofEntries(
				new AbstractMap.SimpleEntry<String, String>("name", this.name),
				new AbstractMap.SimpleEntry<String, String>("intro", this.intro),
				new AbstractMap.SimpleEntry<String, String>("email", this.email),
				new AbstractMap.SimpleEntry<String, String>("phone", this.phone),
				new AbstractMap.SimpleEntry<String, String>("targetConversions", String.valueOf(targetedConversions)));

		return result;
	}
}
