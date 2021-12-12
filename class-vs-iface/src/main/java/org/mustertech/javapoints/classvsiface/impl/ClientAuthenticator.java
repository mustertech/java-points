package org.mustertech.javapoints.classvsiface.impl;

import org.mustertech.javapoints.classvsiface.Authenticator;

public class ClientAuthenticator implements Authenticator {
	private String clientId;
	private String clientSecret;

	ClientAuthenticator(String clientId, String clientSecret) {
		this.clientId = clientId;
		this.clientSecret = clientSecret;
	}

	@Override
	public boolean authenticate(final String clientSecret) {
		return clientSecret.equals(this.clientSecret);
	}

	@Override
	public String identifier() {
		return this.clientId;
	}
}
