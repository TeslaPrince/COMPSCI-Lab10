class Course{
  private static String COURSE_NAME;
  private static String SUBJECT;
  private static int COURSE_NUMBER;
  private static final int MAX_COURSE_NUMNER = 999;
  private static final int MIN_COURSE_NUMNER = 100;
  private static int SECTION;
  private static Instructor INSTRUCTOR;
  private static Student ENROLLED_STUDENTS[];
  public course(String courseName, String subject, int courseNumber, int section, Instructor instructor, Student enrolledStudents[]){
    this.courseName = COURSE_NAME;
    this.subject = SUBJECT;
    this.courseNumber = COURSE_NUMBER;
    this.section = SECTION;
    this.instructor = INSTRUCTOR;
    for(int i = 0; i < ENROLLED_STUDENTS.length; i++){
      this.enrolledStudents[i] = ENROLLED_STUDENTS[i];
    }
  }
  @Override
	public String toString(){
		return String.format("Name: %s, Subject: %s, Class Number: (%d), Section: (%d), Instructor: %s , Student %s", courseName, subject, courseNumber, section, Instructor, enrolledStudents);
	}
  public String getCourseName(){
    return courseName;
  }
  public void setCourseName(){
  }
  public String getSubject(){
    return subject;
  }
  public void setSubject(){
  }
  public int getCourseNumber(){
    return courseNumber;
  }
  public void setCourseNumber(){
    if(courseNumber > MAX_COURSE_NUMBER){
      courseNumber = MAX_COURSE_NUMBER;
    }
    else if(courseNumber < MIN_COURSE_NUMBER){
      courseNumber = MIN_COURSE_NUMBER;
    }
    this.courseNumber = COURSE_NUMBER;
  }
  public int getSection(){
    return section;
  }
  public void setSection(){
  }
  public Instructor getInstructor(){
    return instructor;
  }
  public void setInstructor(){
  }
}