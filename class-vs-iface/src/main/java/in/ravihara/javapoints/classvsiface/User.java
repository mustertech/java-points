package in.ravihara.javapoints.classvsiface;

import java.util.Map;
import at.favre.lib.crypto.bcrypt.BCrypt;

public abstract class User implements Authenticator {
	protected String name;
	protected String intro;
	protected String email;
	protected String phone;
	protected String passCode;

	abstract public Map<String, String> userDetails(String userId);

	@Override
	public boolean authenticate(final String plainPassword) {
		BCrypt.Result result = BCrypt.verifyer().verify(plainPassword.toCharArray(), this.passCode);
		return result.verified;
	}

	@Override
	public String identifier() {
		return this.email;
	}
}
