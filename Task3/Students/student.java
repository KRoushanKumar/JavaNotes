package Task3.Students;

public class student {
     private int rollNumber;
     private String name;
     private String course;
     private int  marks1, marks2, marks3;

     public student(){};
     
     public student(int rollNumber, String name, String course, int marks1, int marks2, int marks3) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.course = course;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

     public int calculateTotal(){
        return (marks1+marks2+marks3);
    }
     public int calculateAverage(){
        return (marks1+marks2+marks3)/3;
     }
     public void calculateGrade(){

     }
    @Override
    public String toString() {
        return "Student [rollNumber=" + rollNumber + ", name=" + name + ", course=" + course + "]";
    }
    public int getRollNumber() {
        return rollNumber;
    }
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }
    public int getMarks1() {
        return marks1;
    }
    public void setMarks1(int marks1) {
        this.marks1 = marks1;
    }
    public int getMarks2() {
        return marks2;
    }
    public void setMarks2(int marks2) {
        this.marks2 = marks2;
    }
    public int getMarks3() {
        return marks3;
    }
    public void setMarks3(int marks3) {
        this.marks3 = marks3;
    }
}