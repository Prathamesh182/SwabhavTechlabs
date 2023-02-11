package com.aurionpro.test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.aurionpro.model.Student;

public class SerializationTest {

	public static void main(String[] args) {
		Student student = new Student(101, "Rocky", 97.2);

		try {
			FileOutputStream file = new FileOutputStream("E:\\Assignment\\test.txt");
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(student);
			file.close();
			System.out.println("Data has been Serialized\n" + student);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}	
