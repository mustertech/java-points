package org.mustertech.javapoints.classvsiface;

interface Authenticator {
	boolean authenticate(final String secret);
	String hashedSecret(final String secret);
}
