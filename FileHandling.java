import java.io.*;

public class FileHandling {

    public static void main(String[] args) throws IOException {


        FileOutputStream fos = new FileOutputStream("demo.txt");
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeUTF("Darshana senevirathna");


        FileInputStream fis = new FileInputStream("demo.txt");
        DataInputStream dis = new DataInputStream(fis);
        String str = dis.readUTF();
        System.out.println(str);
    }
}
