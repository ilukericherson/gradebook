/* Class */


public class Class {


	//class info
	private final String courseNum;
	private final String semester;
	private final int year;

	private ArrayList<Section> sections;
	


	public Class(String courseNumber, 
		String semester, int year, 
		ArrayList<Section> sectionsOfClass){

		this.courseNum = courseNumber;
		this.sections = sectionsOfClass;
		this.semester = semester;
		this.year = year;
	}

	
	public static void addSection(Section newSection){
		sections.add(newSection);
	}

	public static void removeSection(Section oldSection){
		sections.remove(oldSection);
	}

	public double getAverageScore(){

		double avgSum;
		for (Section section : sections){
			avgSum = avgSum + section.getAverageScore();
		}

		return avgSum/sections.size();
	}

	public String getAverageLetterGrade(GradingScheme scheme){

		double averageScore = getAverageScore();

		if (averageScore>=scheme.getAcutoff){
			return 'A';
		} else if (averageScore>=scheme.getBcutoff){
			return 'B';
		} else if (averageScore>=scheme.getCcutoff){
			return 'C';
		} else if (averageScore>=scheme.getDcutoff){
			return 'D';
		} else {
			return 'F';
		}
	}

}