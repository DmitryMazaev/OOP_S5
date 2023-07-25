package Model;

public class Student extends Person implements Comparable<Student> {

    private int id;
    private String engName;

    public Student(String name, String engName, int age, int id) {
        super(name, age);
        this.engName = engName;
        this.id = id;
        
    }


    public int getId() {
        return id;
    }



    public void setId(int id) {
        this.id = id;
    }

    public String getEngName() {
        return engName;
    }

    @Override
    public String toString() {
        return "Студент: " + super.getName() + ", возраст: " + super.getAge() + ", номер студенческого билета: " + id;
    }


    public String toStringEng() {
        return "Student: " + getEngName() + ", age: " + super.getAge() + ", id: " + id;
    }

    @Override
    public int compareTo(Student o) {

        System.out.println(super.getName()+" - "+o.getName());
        if(super.getAge()==o.getAge())
        {
            if(id==o.id)return 0 ;
            if(id>o.id)return 1;
            else return -1;
            //return 0;
        }

        if(super.getAge()>o.getAge())
        return 1;
        else
        return -1;        
    }


    


    
    
    
}


