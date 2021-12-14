package in.ravihara.javapoints.classvsiface.impl;

import in.ravihara.javapoints.classvsiface.Authenticator;

public class AppClient implements Authenticator {
	private String clientId;
	private String clientSecret;

	AppClient(String clientId, String clientSecret) {
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
