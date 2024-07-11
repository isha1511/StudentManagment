/*Design a system for student management using object-oriented programming principles. Implement 
functionalities to add, update and remove student records while ensuring data integrity and encapsulation. */

public class Student{

    final int id;
    private String name;
    private int age;
    private String grade;

    public Student(int id,String name,int age,String grade){
        
        this.id=id;
        this.name=name;
        this.age=age;
        this.grade=grade;
    }
}