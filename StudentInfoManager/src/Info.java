public class Info extends Student{

    public void setId(int id){

        this.id=id;
    }

    public int getId(){
        return id;
    }
    
    public void setName(String name){

        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){

        this.age=age;
    }

    public int getAge(){
        
        return age;
    }

    public void setGrade(String grade){

        this.grade=grade;
    }

    public String getGrade(){

        return grade;
    }

    @override
    public String toString(){

        return "{ Info : Id = "+id+"Name = "+name+"Age ="+age+" Grade ="+grade+" }";
    
    }
}