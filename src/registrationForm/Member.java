package registrationForm;

public class Member {
	public String uname,password,email,contact;
	
	public Member() {
		super();
	}

	public Member(String uname, String password, String email, String contact) {
		super();
		this.uname = uname;
		this.password = password;
		this.email = email;
		this.contact = contact;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	
	
	}

