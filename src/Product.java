import java.io.*;

public class Product implements Serializable {
    private static final long serialVersionUID = -266706354210367639L;
    private int id;
    private String name;
    private double price;
    private String description;

    public Product(int id, String name, double price, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    @Override
    public String toString() {
        return "TestInputStream{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
class ObjectOutputStreamExemple{
    public static void main(String[] args) throws Exception{
        ObjectOutputStream oss = null;
        try {
            oss = new ObjectOutputStream(new FileOutputStream("D:\\ReadFile\\readfile.txt"));
            Product product = new Product(1, "IPhone 12", 2800000, "New");
            oss.writeObject(product);
            oss.flush();
        }catch (Exception e ){
            e.printStackTrace();
        }finally{
            oss.close();
        }
        System.out.println("Success!");
    }
}
class ObjectInputStreamExemple{
    public static void main(String[] args) throws Exception{
        ObjectInputStream in = null;
        try {
            in = new ObjectInputStream(new FileInputStream("D:\\ReadFile\\readfile.txt"));
            Product product = (Product) in.readObject();
            System.out.println(product);
        }catch (Exception e){
            e.printStackTrace();
        }finally{
            in.close();
        }
    }
}
