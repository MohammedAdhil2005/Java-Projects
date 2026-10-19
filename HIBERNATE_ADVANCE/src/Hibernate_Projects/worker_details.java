package Hibernate_Projects;

import javax.persistence.*;

@Entity
@Table
public class worker_details {

	@Id
	@Column
	private int id;
	
	@Column
	private String email;
	
	@Column
	private String address;
	
	@Column
	private int phoneno;
	
	public worker_details(int id, String email, String address, int phoneno) {
		super();
		this.id = id;
		this.email = email;
		this.address = address;
		this.phoneno = phoneno;
	}

	@Override
	public String toString() {
		return "\nworker_details [id=" + id + ", email=" + email + ", address=" + address + ", phoneno=" + phoneno + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(int phoneno) {
		this.phoneno = phoneno;
	}

	public worker_details() {
		super();
	}
	
	
	@OneToOne(mappedBy = "worker_details", cascade = CascadeType.ALL)
	
	private worker worker;

	public worker getWorker() {
		return worker;
	}

	public void setWorker(worker worker) {
		this.worker = worker;
	}
	
	
}
