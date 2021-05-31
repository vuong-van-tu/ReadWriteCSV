package ThucHanhDocGhiFileNhiPhan;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Student> students = new ArrayList<Student>();
        FileWriter file = new FileWriter();
        file.writeToFile("D:\\Demo\\FileCopy.txt",students);
        List<Student> studentDataFromFile = file.readDataFile("D:\\Demo\\FileCopy.txt");
        for (Student student:studentDataFromFile) {
            System.out.println(student);
        }
    }
}
