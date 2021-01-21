import java.util.function.DoubleToLongFunction;

class Student{
  private static String STUDENT_NAME;
  private static int STUDENT_ID_NUMNBER;
  private static final int MAX_STUDENT_ID_NUMBER = 9999999;
  private static final int MIN_STUDENT_ID_NUMBER = 1000000;
  private static double GPA;
  private static final double MAX_GPA = 4.000;
  private static final double MIN_GPA = 0.000;
  private static String YEAR;
  private static String MAJOR;
  private static String MINOR;
  public student(String studentName, int studentIDNumber, int gpa, String year, String major, String minor){
    this.studentName = STUDENT_NAME;
    this.studentIDNumber = STUDENT_ID_NUMBER;
    this.gpa = GPA;
    this.major = MAJOR;
    this.minor = MINOR;
  }
  @Override
	public String toString(){
		return String.format("Name: %s , ID Number: (%d) , GPA: (%.1f), Standing:  %s , Major: %s , Minor: %s ", studentName, studentIDNumber, gpa, year, major, minor);
	}
  public String getStudentName(){
    return studentName;
  }
  public void setStudentName(String studentName){
  }
  public int getStudentIDNumber(){
    return studentIDNumber;
  }
  public void setStudentIDNumber(int studentIDNumber){
     if(studentIDNumber > MAX_STUDENT_ID_NUMBER){
      studentIDNumber = MAX_STUDENT_ID_NUMBER;
    }
    else if(studentIDNumber < MIN_STUDENT_ID_NUMBER){
      studentIDNumber = MIN_STUDENT_ID_NUMBER;
    }
    this.studentIDNumber = STUDENT_ID_NUMBER;
  }
  public double getGPA(){
    return gpa;
  }
  public void setGPA(){
    if(gpa > MAX_GPA){
      gpa = MAX_GPA;
    }
    else if(gpa < MIN_GPA){
      gpa = MIN_GPA;
    }
    this.gpa = GPA;
  }
  public String getYear(){
    return year;
  }
  public void setYear(){
  }
  public String getMajor(){
    return major;
  }
  public void setMajor(){
  }
  public String getMinor(){
    return minor;
  }
  public void setMinor(){
  }
}