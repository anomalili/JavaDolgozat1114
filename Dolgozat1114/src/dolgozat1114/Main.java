
package dolgozat1114;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author makra.zs.lili
 */
public class Main {

    private JFrame frame;
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        init();
        
        
      
    }

 
    
    private void init() {
        alap();
        ujra();

    }

    private void alap() {
        frame = new JFrame("Dolgozat");
        frame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        frame.setSize(410, 350);
        
        

        

    }

    private void ujra() {
   
    }
    
}
