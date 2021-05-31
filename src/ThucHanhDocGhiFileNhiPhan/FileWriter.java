package ThucHanhDocGhiFileNhiPhan;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileWriter {
    public static void writeToFile(String path, List<Student> students){
        try{
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<Student> readDataFile(String path){
        List<Student> students = new ArrayList<Student>();
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<Student>) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return students;
    }
}
