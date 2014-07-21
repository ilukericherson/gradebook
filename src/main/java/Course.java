/* Course */

public class Course {


	//course info
	private String name;
	private String courseNum;
	private String subject;
	private String[] prereqs;

	public Course(String courseName, String courseNumber, 
		String courseSubject, String[] coursePrereqs) {

		this.name = courseName;
		this.courseNum = courseNumber;
		this.subject = courseSubject;
		this.prereqs = coursePrereqs;	
	}

	public String getName(){
		return name;
	}

	public String getCourseNum(){
		return courseNum;
	}

	public String getSubject(){
		return subject;
	}

	public String[] getPrereqs(){
		return prereqs;
	}

}