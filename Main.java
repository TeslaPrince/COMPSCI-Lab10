class Main {
  public static void main(String[] args) {
    //Students
    Student student1 = new Student("Jenna Lambert", 1987880, 2.873, "Sophomore", "Computer Science and Information Technology", "Media Arts and Game Design and Cybersecurity");
    Student student2 = new student("Victoria Jenkins", 1964983, 3.987, "Freshmen", "Civil Engineering", "Art");
    Student student3 = new student("Jacob Reilly", 1893467, 2.345, "Senior", "Psycology", "Sociology");
    Student student4 = new student("Brian Welsh", 2783947, 4.000, "Junior", "Ecology", "Music");
    Student student5 = new student("Ryan Summer", 7389492, 1.453,"Freshman", "Video Production", "Sound Design");
    //Instructors
    Instructor instructor1 = new instructor("Dr. Jacob Marks", 2834783, "Math");
    Instructor instructor2 = new instructor("Prof. Veronica Ross", 3940573, "Elementary Education");
    //Courses
    Course course1 = new course("College Algebra", "MATH", 141, 02, instructor1, course1Enrollment);
    Course course2 = new course("Information Technology Infrastructure", "ITSCM", 221, 05, instructor1, course2Enrollment);
    Course course3 = new course("Introduction to Sketching", "ARTSTD", 153, instructor2, course3Enrollement);
    //enrollment arrays
    Student course1Enrollment = new student[]{student1, student2, student3, student4, student5};
    Student course2Enrollment = new student[]{student1, Student5};
    Student course3Enrollment = new student[]{student2, student3, student4};
    //Print Statements
    System.out.println("Students:\n");
    System.out.println(student1);
    System.out.println(student2);
    System.out.println(student3);
    System.out.println(student4);
    System.out.println(student5);
    System.out.println("Instructors:\n");
    System.out.println(instructor1);
    System.out.println(instructor2);
    System.out.println("Courses:\n");
    System.out.println(course1);
    System.out.println(course2);
    System.out.println(course3);
  }
}