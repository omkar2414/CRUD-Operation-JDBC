package Crud;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java. text. SimpleDateFormat;

import StudentManage.StudentClass;
import StudentManage.StudentDB;


public class StudentDetails {
	
	public static void main(String[] args)throws IOException {
		System.out.println("Welcome");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("press 1 to add student");
			System.out.println("press 2 to add student");
			System.out.println("press 3 to add student");
			System.out.println("press 4 to exit app");
			int c=Integer.parseInt(br.readLine());
			
			if(c==1) {
				System.out.println("Enter user number");
				int number =Integer.parseInt(br.readLine());
				
				System.out.println("Enter user name");
				String name = br.readLine();
				
				System.out.println("Enter user birthdate");
				String dob =br.readLine();
				
				System.out.println("Enter user joining");
				String doj =br.readLine();
				
				//
				StudentClass st = new StudentClass(number,name,dob,doj);
				boolean answer = StudentDB.insertStudentToDB(st);
				if(answer) {
					System.out.println("studentb is added successfully");
				}else {
					System.out.println("something went wrong");
				}
				System.out.println(st);
				
				}else if(c==2) {
					System.out.println("Enter student id to delete: ");
					int userId = Integer.parseInt(br.readLine());
					boolean f =StudentDB.deleteStudent(userId);
					
					if(f) {
						System.out.println("Student deleted successfully");
					}else {
						System.out.println("somethinf went wrong");
					}
				}else if(c==3) {
					
					StudentDB.showAllstudent();
				
				}else if(c==4) {
				
				}else {
					
				}
			
			}

		}

	}
