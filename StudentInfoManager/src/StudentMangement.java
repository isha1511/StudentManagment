import java.util.*;

interface StudentInfo {
    void addStudent(int id, String name, int age, String grade);
    void updateStudent(int id, String name, int age, String grade);
    void removeStudent(int id);
    void listStudents();
}

class Student {
    private int id;
    private String name;
    private int age;
    private String grade;

    public Student(int id, String name, int age, String grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', age=" + age + ", grade='" + grade + "'}";
    }
}

class StudentMangement implements StudentInfo {
    private List<Student> info = new ArrayList<>();

    @Override
    public void addStudent(int id, String name, int age, String grade) {
        Student student = new Student(id, name, age, grade);
        info.add(student);
        System.out.println("Student added successfully: " + student);
    }

    @Override
    public void updateStudent(int id, String name, int age, String grade) {
        for (Student student : info) {
            if (student.getId() == id) {
                student.setName(name);
                student.setAge(age);
                student.setGrade(grade);
                System.out.println("Student info updated: " + student);
                return;
            }
        }
        System.out.println("Student with Id= " + id + " is not found");
    }

    @Override
    public void removeStudent(int id){

        for(Student student:info){

            if(student.getId()==id){
                info.remove(student);
                System.out.println("Student removed :"+student);
                return;
            }
        }
        System.out.println("Student with Id= "+id+ " is not found");
    }

    @Override
    public void listStudents() {
        if (info.isEmpty()) {
            System.out.println("No student available");
        } else {
            for (Student s : info) {
                System.out.println(s);
            }
        }
    }

    public static void main(String[] args) {
        StudentMangement sm = new StudentMangement();
        Scanner sc = new Scanner(System.in);

        boolean exit = false;

        while (!exit) {
            System.out.println("Student Management System");
            System.out.println("1. Add student");
            System.out.println("2. Update student");
            System.out.println("3. Remove student");
            System.out.println("4. List students");
            System.out.println("5. Exit");
            System.out.println("Choose an option:");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter Id");
                    int id = sc.nextInt();
                    sc.nextLine(); 

                    System.out.println("Enter name");
                    String name = sc.nextLine();

                    System.out.println("Enter age");
                    int age = sc.nextInt();
                    sc.nextLine(); 

                    System.out.println("Enter grade");
                    String grade = sc.nextLine();

                    sm.addStudent(id, name, age, grade);
                    break;
                case 2:
                    System.out.println("Enter student Id for update");
                    int id1 = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter new name");
                    String newName = sc.nextLine();

                    System.out.println("Enter new age");
                    int newAge = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter new grade");
                    String newGrade = sc.nextLine();

                    sm.updateStudent(id1, newName, newAge, newGrade);
                    break;
                case 3:
                    System.out.println("Enter student id to remove");
                    int idRemove = sc.nextInt();
                    sm.removeStudent(idRemove);
                    break;
                case 4:
                    sm.listStudents();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Enter a valid choice");
            }
        }
        sc.close();
    }
}
