package com.netmind.dao;

import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

import com.netmind.model.Student;

public class StudentDao {

	private static ArrayList<Student> studentList = null;
	Properties properties= new Properties();
	
	static {
		studentList = new ArrayList<Student>();
	}

	public boolean add(Student student) {
		studentList.add(student);
		return true;
	}

	public boolean addStudentToFile(Student student) throws IOException {
		String fileName = properties.getProperty("");
		createFile(fileName);
		
		try (FileWriter fileWriter = new FileWriter(fileName,true);
				BufferedWriter bufferWriter = new BufferedWriter(fileWriter))
		{
			bufferWriter.write(student.toString());
			bufferWriter.write(System.lineSeparator());
		}
		catch (Exception e){
			//Logger.error(e.getMessage());
			throw e;
		}
		return getLastStudentByID(student.getIdStudent());
	}

	private boolean getLastStudentByID(Integer idStudent) {
		// TODO Auto-generated method stub
		return false;
	}

	private void createFile(String fileName) {
		// TODO Auto-generated method stub
		
	}
}
