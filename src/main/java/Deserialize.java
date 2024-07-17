import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialize {
    public static void main(String[] args) {
        Sandul sandul = null;

        try (FileInputStream fileIn = new FileInputStream("sandul.ser");
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            sandul = (Sandul) in.readObject();
            System.out.println("Deserialized sandul");
            System.out.println(sandul);
        } catch (IOException | ClassNotFoundException i) {
            i.printStackTrace();
        }
    }
}

