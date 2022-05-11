import java.io.File;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author almiscovich
 */
public class CoffeeDecorator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        File data = new File("/Users/almiscovich/Documents/CoffeeDecorator/src/data.txt"); 
        if (data.delete()) { 
            System.out.println("File deleted");
        }
        
        CustomerGUI cg = new CustomerGUI();
        cg.setVisible(true);
        
        
        FelineFightersCoffeeGUI wg = new FelineFightersCoffeeGUI();
        wg.setVisible(true);
        }

}
