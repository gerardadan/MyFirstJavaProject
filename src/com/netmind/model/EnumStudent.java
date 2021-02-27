package com.netmind.model;

public enum EnumStudent {

	ADD_STUDIENT(1),
	OLDEST_STUDENT(2),
	EXIT(3);
	
	private int value;
	
	private EnumStudent(int value) {
		this.value = value;
	}
	
	public static EnumStudent fromValue(int value)
	{
		for (EnumStudent enumStudent : EnumStudent.values()) {
			if(enumStudent.value == value)
			{
				return enumStudent;
			}
		}
		return null;
	}
	
	public int getValue() {
		return value;
	}
}
