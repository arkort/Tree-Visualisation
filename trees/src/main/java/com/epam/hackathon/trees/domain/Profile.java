package com.epam.hackathon.trees.domain;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Profile {
	
	@Id
	private Object _id;
	
	private long id;
	private String firstName;
	private String lastName;
	private List<Long> treesId;
	
	public Profile() {
	}
	
	public Profile(String firstName, String lastName, Long id){
		set_id(new ObjectId());
		setFirstName(firstName);
		setLastName(lastName);
		setId(id); // i'm not sure
	}
	
	public Object get_id() {
		return _id;
	}

	public void set_id(Object _id) {
		this._id = _id;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
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
	public List<Long> getTreesId() {
		return treesId;
	}
	public void setTreesId(List<Long> treesId) {
		this.treesId = treesId;
	}

	@Override
	public String toString() {
		return "Profile [_id=" + _id + ", id=" + id + ", firstName="
				+ firstName + ", lastName=" + lastName + ", treesId=" + treesId
				+ "]";
	}
}
