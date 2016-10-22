package fi.haagahelia.course.domain;

public class Customer {
	private long id;
	private String firstName, lastName, email, address, postcode, phone;
	
	public Customer (long id, String firstName, String lastName, String email, 
			String address, String postcode, String phone) {
		this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.postcode = postcode;
        this.phone = phone;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Override
    public String toString() {
		return String.format(
                "Customer[id=%d, firstName='%s', lastName='%s', email='%s', address='%s', postcode='%s', phone='%s']",
                id, firstName, lastName, email, address, postcode, phone);
	}

}
