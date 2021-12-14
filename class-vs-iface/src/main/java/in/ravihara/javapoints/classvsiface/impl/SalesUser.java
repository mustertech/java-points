package in.ravihara.javapoints.classvsiface.impl;

import java.util.AbstractMap;
import java.util.Map;

import in.ravihara.javapoints.classvsiface.User;
import at.favre.lib.crypto.bcrypt.BCrypt;

public class SalesUser extends User {
	private int targetedConversions = 100;

	public SalesUser(String email, String phone, String plainPassCode) {
		super();

		this.name = "Sales User";
		this.intro = "Sales user of Acme company";
		this.email = email;
		this.phone = phone;
		this.passCode = BCrypt.withDefaults().hashToString(12, plainPassCode.toCharArray());
	}

	@Override
	public Map<String, String> userDetails(String email) {
		if (!email.equals(this.email)) {
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
