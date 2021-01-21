class Instructor{
  private static String INSTRUCTOR_NAME;
  private static int INSTRUCTOR_ID_NUMBER;
  private static final int MAX_INSTRUCTOR_ID_NUMBER = 9999999;
  private static final int MIN_INSTRUCTOR_ID_NUMBER = 1000000;
  private static String DEPARTMENT;
  public instructor(String instructorName, int instructorIDNumber, String department){
    this.instructorName = INSTRUCTOR_NAME;
    this.instructorIDNumber = INSTRUCTOR_ID_NUMBER;
    this.department = DEPARTMENT;
  }
  @Override
	public String toString() {
		return String.format(" Name: %s , ID Number: (%d) , Department: %s ", instructorName, Instru, Department);
	}
  public String getInstructorName(){
    return instructorName;
  }
  public void setInstructorName(){
  }
  public int getInstructorIDNumber(){
    return instructorIDNumber;
  }
  public void setInstructorIDNumber(){
    if(instructorIDNumber > MAX_INSTRUCTOR_ID_NUMBER){
      instructorIDNumber = MAX_INSTRUCTOR_ID_NUMBER;
    }
    else if(instructorIDNumber < MIN_INSTRUCTOR_ID_NUMBER){
      instructorIDNumber = MIN_INSTRUCTOR_ID_NUMBER;
    }
    this.instructorIDNumber = INSTRUCTOR_ID_NUMBER;
  }
  public String getDepartment(){
    return department;
  }
  public void setDepartment(){
  }
}