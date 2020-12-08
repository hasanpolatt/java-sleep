
package newpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

//writes your name for 10 seconds
public class thread1 extends Thread{
    
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Name");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(thread1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}

