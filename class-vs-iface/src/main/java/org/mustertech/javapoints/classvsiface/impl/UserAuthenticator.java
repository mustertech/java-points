package org.mustertech.javapoints.classvsiface.impl;

import at.favre.lib.crypto.bcrypt.BCrypt;
import org.mustertech.javapoints.classvsiface.Authenticator;

public class UserAuthenticator implements Authenticator {
	private String userId;
	private String passCode;

	UserAuthenticator(String userId, String plainPassword) {
		this.userId = userId;
		this.passCode = BCrypt.withDefaults().hashToString(12, passCode.toCharArray());
	}

	@Override
	public boolean authenticate(final String plainPassword) {
		BCrypt.Result result = BCrypt.verifyer().verify(plainPassword.toCharArray(), this.passCode);
		return result.verified;
	}

	@Override
	public String identifier() {
		return this.userId;
	}
}
