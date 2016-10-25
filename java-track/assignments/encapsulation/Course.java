package encapsulation;

import java.util.ArrayList;


public class Course {
	private String name;
	private int credits;
	private int numSeats;
	private ArrayList<Student> studentArrayList;



public Course(String name, int credits, int numSeats)
{
	this.name = name;
	this.credits = credits;
	this.numSeats = numSeats;
	studentArrayList = new ArrayList<Student>();

}

public String getName()
{
	return this.name;
	
}

public int getCredits()
{
	return this.credits;
}

public int getRemainingSeats()
{
	return this.numSeats;
}

public ArrayList<Student> getStudents()
{
	return this.studentArrayList;
}

public boolean addStudent(Student student)
{		
	if(this.numSeats > 0){
		studentArrayList.add(student);
		this.numSeats = this.numSeats -1;
		return true;
	}else{
		return false;
	}
}


public String generateRoster(){
	String Roster = "";
	for (){
		Roster = student.getName() + " ";
	}return Roster;
	
}

public double averageGPA(){	
	double totalGPA;
	for (Student student : studentArray){
		totalGPA += student.getGPA()
	}
		
}















}





