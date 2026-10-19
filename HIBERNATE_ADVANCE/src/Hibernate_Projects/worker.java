package Hibernate_Projects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class worker {

	@Id
	@Column
	private int id;
	
	@Column
	private String name;
	
	public worker(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	public worker() {
	}
	
	@Override
	public String toString() {
		return "\nworker [id=" + id + ", name=" + name + "]";
	}
		
	@JoinColumn(name="Worker_Details_ID")
	@OneToOne(cascade = CascadeType.ALL)
	
	private worker_details worker_details;

	public worker_details getWorker_details() {
		return worker_details;
	}

	public void setWorker_details(worker_details worker_details) {
		this.worker_details = worker_details;
	}
	
}
