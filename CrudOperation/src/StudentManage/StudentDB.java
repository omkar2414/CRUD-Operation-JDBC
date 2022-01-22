package StudentManage;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDB {
	
	

	public static boolean insertStudentToDB(StudentClass st) {
		boolean f=false;
		try {
			
			Connection con= ConnectionProvider.createC();
			String q ="insert into STUDENT(STUDENT_NO,STUDENT_NAME,STUDENT_DOB,STUDENT_DOJ) values(?,?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(q);
			
			pstmt.setInt(1, st.getSTUDENT_NO());
			pstmt.setString(2, st.getSTUDENT_NAME());
			pstmt.setString(3, st.getSTUDENT_DOB());
			pstmt.setString(4, st.getSTUDENT_DOJ());
			
			pstmt.executeUpdate();
			f=true;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	public static boolean deleteStudent(int userId) {
		
		boolean f=false;
		try {
			
			Connection con= ConnectionProvider.createC();
			String q ="delete from student where STUDENT_NO=?";
			PreparedStatement pstmt = con.prepareStatement(q);
			
			
			pstmt.setInt(1,userId);
			
			
			pstmt.executeUpdate();
			f=true;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return f;
		
	}

	public static void showAllstudent() {
		
		try {
			
			Connection con= ConnectionProvider.createC();
			String q ="select * from student;";
			Statement stmt=con.createStatement();
			
			ResultSet set =stmt.executeQuery(q);
			
			while(set.next())
			{
				int no=set.getInt(1);
				String name=set.getString(2);
				String dob=set.getString(3);
				String doj=set.getString(4);
				
				System.out.println("NO:"+ no);
				System.out.println("Name:"+ name);
				System.out.println("Dob:"+ dob);
				System.out.println("Doj:"+ doj);
				System.out.println("----------------------");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	

}
