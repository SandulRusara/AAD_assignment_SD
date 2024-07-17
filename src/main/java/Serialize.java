import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialize {
    public static void main(String[] args) {
        Sandul sandul = new Sandul("sandulrusara", 22,"maggona");
        try (FileOutputStream fileOut = new FileOutputStream("sandul.ser");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(sandul);
            System.out.println("Serialized data is saved in sandul.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}

