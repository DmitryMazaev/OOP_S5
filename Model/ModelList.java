package Model;
import java.util.List;

import Controller.iGetModel;

public class ModelList implements iGetModel {
    private List<Student> students;
    private Student student;

    public ModelList(List<Student> students) {
        this.students = students;
    }

    public List<Student> getAllStudents()
    {
        return students;
    }

    @Override
    public void removeStudent(int id) {
        students.remove(id);
    }
}
