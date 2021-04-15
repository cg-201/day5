package day5;

public class Student {
	// security
	private int id;
	private int age;
	private String name;
	private String email;
	private String mobile;
	
	
	// guard
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	// age guard
	public int getAge() {
		return age;
	}
	public void setAge(int age) throws Exception{
		// protecting the age from wrong value
		if(age < 0) {
			throw new Exception("Invalid Age");
		}
		this.age = age;
	}
	
	// name guard
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
	
	
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
}
