package ThucHanhDocGhiFileNhiPhan;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class FileReader {
    public static void readFile() throws Exception {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("D:\\Demo\\FileCopy.txt"));
            Student students = (Student) ois.readObject();
            System.out.println(students);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            ois.close();
        }
    }
}
