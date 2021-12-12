package org.mustertech.javapoints.classvsiface;

import java.util.Map;

public abstract class User {
	protected String name;
	protected String intro;
	protected String email;
	protected String phone;
	protected String passCode;

	abstract public Map<String, String> userDetails(String userId);
}
