package in.ravihara.javapoints.classvsiface.impl;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.AbstractMap;
import java.util.Map;

import in.ravihara.javapoints.classvsiface.User;
import at.favre.lib.crypto.bcrypt.BCrypt;

public class LeadUser extends User {
	private String createdAt;

	public LeadUser(String email, String phone, String plainPassCode) {
		super();

		this.name = "Unknown";
		this.intro = "Lead user";
		this.email = email;
		this.phone = phone;
		this.passCode = BCrypt.withDefaults().hashToString(12, plainPassCode.toCharArray());

		Instant nowUtc = Instant.now();
		ZoneId utcZone = ZoneId.of("UTC");

		this.createdAt = ZonedDateTime.ofInstant(nowUtc, utcZone).toString();
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
				new AbstractMap.SimpleEntry<String, String>("createdAt", this.createdAt));

		return result;
	}

	@Override
	public String identifier() {
		return this.phone;
	}
}
