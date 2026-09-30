// Class that represents one student
public class Student {
   private String name;
   private int grade;// declare instance variables here
 
   public Student(String name, int grade) {
   this.name = name;
   this.grade = grade;
   } // write the constructor here
 
   public void printInfo() {
      System.out.println(name + " — Grade " + grade);
   }
}
