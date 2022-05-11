
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class TestingSave {

    public static void main(String[] args) {
        File data = new File("D:\\footb\\Documents\\Classes\\Software Engineering\\coffee\\coffee\\src\\data.txt");
        System.out.println("Saving file ");
        save(data);

        System.out.println("Checking if " + data.getName() + " exists. Should be True: " + data.exists());
        System.out.println("Testing Load...");
        System.out.println("Loading " + data.getName() + " Should display: ");
        System.out.println("Coffe Total price: $1.28 Ice tea Total price: $1.38 Cookies Total price: $0.28");

        System.out.println("___________________________________________________");
        load(data);

    }

    public static void save(File data) {
        try {
            if (!data.exists()) {
                data.createNewFile();
            }
            FileWriter fw;
            fw = new FileWriter(data, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            pw.print("Coffe Total price: $1.28 Ice tea Total price: $1.38 Cookies Total price: $0.28 ");
            pw.println();
            pw.println();

            pw.println("Order Finished");
            //Closing the connections to the file.
            pw.close();
            bw.close();
            fw.close();

        } catch (IOException ex) {
            Logger.getLogger(CustomerGUI.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void load(File data) {
        String currentLine;
        String order = " ";
        Scanner myReader = null;
        try {
            myReader = new Scanner(data);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TestingSave.class.getName()).log(Level.SEVERE, null, ex);
        }
        while (myReader.hasNextLine()) {
            currentLine = myReader.nextLine();
            if (!currentLine.equals("Order Finished")) {
                order = order + " " + currentLine;
            }
            if (currentLine.equals("Order Finished")) {
                System.out.println(order + "\n");

            }
        }
        myReader.close();
    

    }
}
