package com.mdash.alloter;

public class Court {

	private long id;
	private String type;
	private String name;
	
	public Court(long id, String type, String name) {
		super();
		this.id = id;
		this.type = type;
		this.name = name;
	}
	
	public long getId() {
		return id;
	}
	public String getType() {
		return type;
	}
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Court [id=" + id + ", type=" + type + ", name=" + name + "]";
	}
	
	
}
