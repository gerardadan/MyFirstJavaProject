package com.netmind.presentation;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import com.netmind.business.StudentBl;
import com.netmind.model.Student;
import com.netmind.model.EnumStudent;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StudentConsole {

	
	public static void selectOperation() {
		Scanner scanner = new Scanner(System.in);
		StudentBl studentBl = new StudentBl();
		
		int option;

		do {
			showPrincipalMenu();
			// The nextInt() method does not deal with the EOL token,
			// while nextLine() does.
			option = Integer.parseInt(scanner.nextLine());
			
			EnumStudent enumStudent = EnumStudent.fromValue(option);
			
			switch (enumStudent) {			
			case ADD_STUDIENT:
				Student student = new Student();
				addNewStudent(student, scanner);
				studentBl.add(student);
				break;
			default:
				break;				
			}
		} while (option != EnumStudent.EXIT.getValue());
		scanner.close();
	}

	private static void showPrincipalMenu() {
		System.out.println("¿Qué opción quiere seleccionar?");
		System.out.println(EnumStudent.ADD_STUDIENT.getValue() + ".Agregar un nuevo estudiante");
		System.out.println(EnumStudent.OLDEST_STUDENT.getValue() + ".Calcular el estudiante con mayor edad");
		System.out.println(EnumStudent.EXIT.getValue() + ".Salir del programa");
	}

	private static void addNewStudent(Student student, Scanner scanner) {
		System.out.println("1.Agregar un nuevo estudiante");
		System.out.println("Introduce nombre: ");
		student.setName(scanner.nextLine());

		System.out.println("Introduce apellidos: ");
		student.setSurname(scanner.nextLine());

		System.out.println("Introduce Fecha de nacimiento: ");
		try {
			DateTimeFormatter formatDateBirth = DateTimeFormatter.ofPattern("dd/MM/yyyy");	
			LocalDate dateOfBirth = LocalDate.parse(scanner.nextLine(), formatDateBirth);
			
			student.setDateOfBirth(dateOfBirth);
		} catch (Exception  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}