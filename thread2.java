
package newpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

//writes your surname for 20 seconds
public class thread2 extends Thread {
    
    @Override
    public void run() {
            
        for (int i = 0; i < 20; i++) {
            System.out.println("Last Name");
               try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(thread1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

