
//Class is a blueprint of Object which includes a constructor, instance variables, and methods.

//constructor overloading conditions 
//1. Number of Arguments different
//2. Type of Arguments different
//3. order of Arguments may different

//Method overloading
//1. Number of Arguments different
//2. Type of Arguments different
//3. order of Arguments may different

// use of this Keyword

public class Student {
 
 String studentName;
 String studentRollNo;
 String studentCity;

 public Student(){
	 this("23", "test", "Mumbai");
	 System.out.println("This is Non Parameterised Constructor");
 }
 
 public Student(String st){
	 System.out.println("This is Parameterised Constructor " + st);
 }

public Student(String i, String studentName, String studentCity){
	 this.studentRollNo = i;
	 this.studentName = studentName;
	 this.studentCity = studentCity;
 }
 public void study(){
 System.out.println(studentName +" is Studing");
 
 }
 
    // Overloaded study method
    public void study(int hours) {
        System.out.println(studentName + " studied for " + hours + " hours.");
    }
 
 public void showFullDetails(){
 System.out.println("My name is "+studentName);
  System.out.println("My Roll no is "+studentName);
   System.out.println("I live in "+studentCity);
 
 }
 
 public static void main (String[] args){
 
  Student st1;
  st1 = new Student();
   st1.studentName = "Prathamesh";
 st1.studentRollNo= "324101907";
 st1.studentCity="Mumbai";
  st1.study();
  st1.showFullDetails();
  
  Student st2;
  st2 = new Student("Vicky");
   st2.studentName = "Vicky";
 st2.studentRollNo= "324101907";
 st2.studentCity="Mumbai";
  st2.study();
  st1.study(5);
  st2.showFullDetails();
 }
}