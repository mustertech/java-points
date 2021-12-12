package org.mustertech.javapoints.classvsiface;

public interface Authenticator {
	boolean authenticate(final String secret);

	String identifier();
}
