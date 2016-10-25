package encapsulation;

public class Student {
	private String first_name;
	private String last_name;
	private String name;
	private int student_id;
	private int credits;
	private double gpa;

	
	public Student(String first_name, String last_name, int student_id)
	{
		this.first_name = first_name;
		this.last_name = last_name;
		this.student_id = student_id;
		this.name = first_name + " " + last_name;
	}
	
	public String getFirstName()
	{
		return this.first_name;
	}
	
	public String getLastName()
	{
		return this.last_name;
	}
	
	public String getName()
	{
		return this.name;	
	}
	
	public int getStudentID()
	{
		return this.student_id;
	}
	
	public double getCredits()
	{
		return this.credits;
	}
	public double getGPA()
	{
		return this.gpa;
	}
	
	public String getClassStanding()
	{
		String status = "";
		if (this.credits <= 29)
		{	
			status = "Freshman";
		}		
		else if(this.credits >= 30 && this.credits <=59)
		{
			status = "Sophomore";
		}
		else if(this.credits >= 60 && this.credits <=89)
		{
			status = "Junior";
		}
		else if(this.credits >= 90)
		{
			status = "Senior";
		}
		return status;
	}
	
	public void submitGrade(double grade, int credit)
	{
		//Gets the quality score for this course
		//then gets the total quality score 
		//then updates the student (object) credits total
		double quality_score = credit * grade;
		double total_quality_score = this.gpa * this.credits;
		this.credits = this.credits + credit;
		
		total_quality_score = total_quality_score + quality_score;
		
		this.gpa = total_quality_score/this.credits;
		this.gpa = Math.round(this.gpa *1000d)/ 1000d;
		
	}
	
	public double computeTuition()
	{
		double semisters = this.credits/15;
		double remainderHours = this.credits%15;
		
		
		//double tuition = 20000;
		double tuition = (semisters * 20000) + (remainderHours * 1333.33);
		
		return  tuition;
	}
	
		
	public Student createLegacy(Student studentOne, Student studentTwo)
	{
		Student legacy = new Student(first_name, last_name, student_id);
		legacy.first_name = studentOne.getName();
		legacy.last_name = studentTwo.getName();
		legacy.student_id = studentOne.student_id + studentTwo.student_id;
		legacy.gpa = (studentOne.gpa + studentTwo.gpa) / 2;
		legacy.credits = Math.max(studentOne.credits, studentTwo.credits);
		
		return legacy;
	}
	
	public String toString()
	{
		return this.first_name + " " + this.last_name + " " + this.student_id;
	}
	
	
}



