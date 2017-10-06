package com.cosmiccandi.projectvote.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {
	
	//Instance Variables
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="users_id_seq")
	@SequenceGenerator(name="users_id_seq", sequenceName="users_id_seq")
	private Long id;
	
	private String firstName;
	private String lastName;
	
//	private Project first_pref,
//					second_pref,
//					third_pref;
	
	//Constructor
	public User () {};
	public User (String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
//		this.first_pref = first_pref;
//		this.second_pref = second_pref;
//		this.third_pref = third_pref;
	}
	
	//Getters and Setters
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
	
//	public Project getFirst_pref() {
//		return first_pref;
//	}
//	
//	public void setFirst_pref(Project first_pref) {
//		this.first_pref = first_pref;
//	}
//	
//	public Project getSecond_pref() {
//		return second_pref;
//	}
//	
//	public void setSecond_pref(Project second_pref) {
//		this.second_pref = second_pref;
//	}
//	
//	public Project getThird_pref() {
//		return third_pref;
//	}
//	
//	public void setThird_pref(Project third_pref) {
//		this.third_pref = third_pref;
//	}
	
}
