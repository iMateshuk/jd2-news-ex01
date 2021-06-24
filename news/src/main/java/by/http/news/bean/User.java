package by.http.news.bean;

import java.util.Objects;

public class User {

	private String name;
	private String login;
	private String password;

	public User() {
	}

	public User(String login, String password) {
		super();
		this.login = login;
		this.password = password;
		this.name = "noName";
	}

	public User(String name, String login, String password) {
		super();
		this.name = name;
		this.login = login;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public int hashCode() {
		return Objects.hash(login, name, password);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(login, other.login) && Objects.equals(name, other.name)
				&& Objects.equals(password, other.password);
	}

	@Override
	public String toString() {
		return this.getClass().getName() + " [name=" + name + ", login=" + login + ", password=" + password + "]";
	}

}
