package in.com.projects1851;

import java.util.Date;

public class Person3 {

	private String name;
	// private Date dob;
	private String address;
	private Date dob;

	public Person3() {

		System.out.println("this is default constructor");
	}

	public Person3(String name, String add,Date dob) {
		this.name = name;
		this.address = add;
         this.dob =dob;
	}

	public String getname() {
		return name;
	}

	public String getaddress() {
		return address;
	}
	 public Date getdob() {
	 return dob;
}
}