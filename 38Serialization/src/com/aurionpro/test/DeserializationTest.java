package com.aurionpro.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.aurionpro.model.Student;

public class DeserializationTest {

	public static void main(String[] args) {
		// Student student = new Student(102,"raj",95.4);
		Student student = null;
		try {
			FileInputStream file = new FileInputStream("E:\\Assignment\\test.txt");
			ObjectInputStream in = new ObjectInputStream(file);
			// System.out.println(student);
			student = (Student) in.readObject();
			in.close();
			file.close();
			System.out.println("Data has been Deserialized\n" + student);

		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
