/**
 * @(#)Student.java
 *
 *
 * @author 
 * @version 1.00 2022/4/6
 */

import java.time.LocalDate;
public class FitnessAssessment 
{

    private String idNum;
    private String studentName;
    private String studentSurname;
    private int startYear;
    private double tuition;
    private static double standardTuition = 80000;
    public static final double YEARLY_DISCOUNT = 0.05;
    public static final String UNI_NAME = "Bilkent University";
    private static int sequentialStudentCounter = 100000;
    
    public FitnessAssessment(String studentName, String studentSurname,
    				int startYear, double tuition)
    {
    	this.studentName = studentName;
    	this.studentSurname = studentSurname;
    	setStartYear( startYear );
    	setTuition( tuition );
    	setIdNum();
    }
    public FitnessAssessment( String idNum, String studentName, String studentSurname,
    				int startYear, double tuition)
    {
    	this.idNum = idNum;
    	this.studentName = studentName;
    	this.studentSurname = studentSurname;
    	setStartYear( startYear );
    	setTuition( tuition );
    	
    }
    public String getIdNum(){
    	return this.idNum;
    }
    private void setIdNum(){
    	String id = startYear +"-"+sequentialStudentCounter;
    	idNum = id;
    	sequentialStudentCounter++;
    }
    public void setStudentName( String studentName ){
    	this.studentName = studentName;
    }
    public String getStudentName(){
    	return this.studentName;
    }
    public void setStudentSurname( String studentSurname ){
    	this.studentSurname = studentSurname;
    }
    public String getStudentSurname(){
    	return this.studentSurname;
    }
    public int getStartYear(){
    	return this.startYear;
    }
    public void setStartYear( int year ){
    	if( year >= 1986 && year <= getCurrentYear() ){
    		this.startYear = year;
    	}
    	else{
    		this.startYear = getCurrentYear();
    	}
    }
    public double getTuition(){
    	return this.tuition;
    }
    public void setTuition( double tuition ){
    	if( tuition <= standardTuition ){
    		this.tuition = tuition;
    	}
    	else {
    		this.tuition = standardTuition;
    	}
    }
    public double calculateDiscountedTuition(){
    	int yearsAttended = getCurrentYear() - startYear;
    	double discount = YEARLY_DISCOUNT * yearsAttended;
    	return tuition * (1 - discount);
    	
    }
    public static double calculateDiscountedTuition( int yearsAttended ){
    	double discount = YEARLY_DISCOUNT * yearsAttended;
    	return standardTuition * (1 - discount); 
    }
    public static int getCurrentYear(){
    	LocalDate today = LocalDate.now();
    	int year = today.getYear();
    	return year;
    }
    private String formatName(){
    	String formatted;
    	formatted = studentSurname + ", " + studentName;
    	return formatted;
    }
    public String toString(){
    	String output;
    	
    	output = "Student Name: " + formatName() +"("+idNum+")\n";
    	output += "Start Year: " + startYear + " Tuition: " + tuition;
    	return output;
    }
    public boolean equals( FitnessAssessment other ){
    	return this.idNum.equals( other.idNum );
    }
}