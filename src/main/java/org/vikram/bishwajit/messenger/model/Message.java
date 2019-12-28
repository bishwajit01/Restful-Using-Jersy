package org.vikram.bishwajit.messenger.model;

/**
 * @author Bishwajit.
 *
 */
public class Message {
	private String id;
	private String name;
	private String grade;
	
	//Default Constructor.
	public Message() {
		// TODO Auto-generated constructor stub
	}

	// Parameterized Constructor.
	public Message(String id, String name, String grade) {
		this.id = id;
		this.name = name;
		this.grade = grade;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the grade
	 */
	public String getGrade() {
		return grade;
	}

	/**
	 * @param grade the grade to set
	 */
	public void setGrade(String grade) {
		this.grade = grade;
	}

}
