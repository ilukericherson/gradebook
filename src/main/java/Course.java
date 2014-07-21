/* Course */


public class Course {


	//course info
	private final String name;
	private final String courseNum;
	private final String subject;
	
	private ArrayList<String> prereqs;

	public Course(String courseName, String courseNumber, 
		String courseSubject, ArrayList<String> coursePrereqs) {

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