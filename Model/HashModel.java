package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Controller.iGetModel;

public class HashModel implements iGetModel{
    private HashMap<Integer, Student> hashMapStudents = new HashMap<Integer, Student>(); 

    public HashModel(List<Student> students) {
        for (Student student : students) {
            hashMapStudents.put(student.getId(), student);
        }
        
    }

    public List<Student> getAllStudents()
    {
        List<Student> studentList = new ArrayList<Student>();
        for (Student student : hashMapStudents.values()) {
            studentList.add(student);
        }
        return studentList;
    }

    @Override
    public void removeStudent(int id) {
        hashMapStudents.remove(id);
    }
}
