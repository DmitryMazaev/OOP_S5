import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Controller.Controller;
import Controller.iGetModel;
import Controller.iGetView;
import Model.HashModel;
import Model.ModelFile;
import Model.ModelList;
import Model.Student;
import View.View;
import View.ViewEng;

public class App {
    public static void main(String[] args) throws Exception {

        List<Student> students = new ArrayList<Student>();
        Student s1 = new Student("Сергей", "Sergey", 21, 101);
        Student s2 = new Student("Андрей", "Andrey", 22, 111);
        Student s3 = new Student("Иван", "Ivan", 22, 121);
        Student s4 = new Student("Игорь", "Igor", 23, 301);
        Student s5 = new Student("Дарья", "Daria", 25, 171);
        Student s6 = new Student("Елена", "Elena", 23, 104);
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);

        Student s7 = new Student("Николай", "Nicolay", 24, 716);
        Student s8 = new Student("Альберт", "Albert", 20, 717);
        Student s9 = new Student("Дмитрий", "Dmitry", 25, 718);
        Student s10 = new Student("Олег", "Oleg", 27, 719);
        Student s11 = new Student("Зинаида", "Zinaida", 19, 720);
        Student s12 = new Student("Альбина", "Albina", 21, 721);

        List<Student> hashMapStudent = new ArrayList<Student>();
        hashMapStudent.add(s7);
        hashMapStudent.add(s8);
        hashMapStudent.add(s9);
        hashMapStudent.add(s10);
        hashMapStudent.add(s11);
        hashMapStudent.add(s12);

        ModelFile fModel = new ModelFile("StudentDB.txt");
        fModel.saveAllStudentToFile(hashMapStudent);

        iGetModel modelFile = fModel;
        iGetModel model = new ModelList(students);
        iGetView view = new View();
        iGetView viewEng = new ViewEng();

        iGetModel hashModel = new HashModel(hashMapStudent);

        while (true) {
            System.out.println("Выберите язык: 1 - русский, 2 - english:");
            Scanner in = new Scanner(System.in);
            int a = in.nextInt();
            if (a == 1) {
                Controller control = new Controller(hashModel, view);
                control.run();
                fModel.saveAllStudentToFile(hashMapStudent);
            }

            if (a == 2) {
                Controller control = new Controller(modelFile, viewEng);
                control.run();
                fModel.saveAllStudentToFile(students);
            }
        }
    }
}
