import java.io.*;

public class Qr {

    private static final Object Imagetype = ;

    public static void main(String[] args) throws IOException {

        String details = "Darshana Senevirathna - Channel name: Achi codings";

        ByteArrayOutputStream out = QRCode.from(details).to(Imagetype.JPG).stream();

        File f = new File("D:\\Qr\\mychannel.jpg");

        FileOutputStream fos = new FileOutputStream(f);

        fos.write(out.toByteArray());

        fos.flush();
    }
}
