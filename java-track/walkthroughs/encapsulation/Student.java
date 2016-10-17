package encapsulation;

import java.text.DecimalFormat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Student {
	private String first_name;
	private String last_name;
	private int student_id;
	private double credits;
	private double gpa;

	
	public Student(String first_name, String last_name, int student_id)
	{
		this.first_name = first_name;
		this.last_name = last_name;
		this.student_id = student_id;
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
		return (this.first_name + " " + this.last_name);	
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
			status = "Sophmore";
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
	
	public void submitGrade(double credit, int grade)
	{
		//Gets the quality score for this course
		//then gets the total quality score 
		//then updates the student (object) credits total
		double quality_score = credit * grade;
		double total_quality_score = this.gpa * this.credits;
		this.credits = this.credits + credit;
		
		total_quality_score = total_quality_score + quality_score;
		
		this.gpa = total_quality_score/this.credits;
		DecimalFormat df = new DecimalFormat("#.###");
		df.format(this.gpa);
	}
	
	
	
	public void testSubmitGrade() {
		Student s = new Student("D", "S", 1);
		int credits = 0;
		double gpatotal = 0;
		for (int i = 0; i < 100; i++) {
			int c = (int)(Math.random() * 3 + 1);//1 to 3 credits
			double g = Math.random() * 4;//0 to 4
			credits += c;
			gpatotal += g * c;
			s.submitGrade(g, c);
			assertEquals("GPA computed incorrectly", gpatotal / credits, s.getGPA(), 0.01);
			assertTrue("GPA not rounded", (s.getGPA() + "").length() < 6);
		}
	}
	
}


