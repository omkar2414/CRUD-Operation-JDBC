package StudentManage;

public class StudentClass {
	private int STUDENT_NO;
	private String STUDENT_NAME;
	private String STUDENT_DOB;
	private String STUDENT_DOJ;

	public StudentClass(int sTUDENT_NO, String sTUDENT_NAME, String dob, String doj) {
		super();
		this.STUDENT_NO = sTUDENT_NO;
		this.STUDENT_NAME = sTUDENT_NAME;
		this.STUDENT_DOB = dob;
		this.STUDENT_DOJ = doj;
	}
	
//	public StudentClass1(int sTUDENT_NO, String sTUDENT_NAME, int sTUDENT_DOB, int sTUDENT_DOJ) {
//		super();
//		this.STUDENT_NO = sTUDENT_NO;
//		this.STUDENT_NAME = sTUDENT_NAME;
//		this.STUDENT_DOB = sTUDENT_DOB;
//		this.STUDENT_DOJ = sTUDENT_DOJ;
//	}
	
	

	public int getSTUDENT_NO() {
		return STUDENT_NO;
	}

	public void setSTUDENT_NO(int sTUDENT_NO) {
		STUDENT_NO = sTUDENT_NO;
	}

	public String getSTUDENT_NAME() {
		return STUDENT_NAME;
	}

	public void setSTUDENT_NAME(String sTUDENT_NAME) {
		STUDENT_NAME = sTUDENT_NAME;
	}

	public String getSTUDENT_DOB() {
		return STUDENT_DOB;
	}

	public void setSTUDENT_DOB(String sTUDENT_DOB) {
		STUDENT_DOB = sTUDENT_DOB;
	}

	public String getSTUDENT_DOJ() {
		return STUDENT_DOJ;
	}

	public void setSTUDENT_DOJ(String sTUDENT_DOJ) {
		STUDENT_DOJ = sTUDENT_DOJ;
	}

	public StudentClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "StudentClass [STUDENT_NO=" + STUDENT_NO + ", STUDENT_NAME=" + STUDENT_NAME + ", STUDENT_DOB="
				+ STUDENT_DOB + ", STUDENT_DOJ=" + STUDENT_DOJ + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
