package View;
import java.util.List;
import java.util.Scanner;
import Controller.iGetView;
import Model.Student;

public class View implements iGetView{

    public void printAllStudents(List<Student> students)
    {
        System.out.println("------список студентов--------");
        for(Student stud: students)
        {
            System.out.println(stud);
        }
        System.out.println("===============================");
    }

    @Override
    public String prompt(String msg) {
        Scanner in = new Scanner(System.in);
        System.out.println(msg);
        return in.nextLine();
    }
}
