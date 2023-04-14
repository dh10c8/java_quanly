package model;

public class SinhVienModel {
	int id;
	String name;
	String email;
	
	public SinhVienModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public SinhVienModel( String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	public SinhVienModel(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "SinhVienModel [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	
	
}
