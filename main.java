
package newpackage;

public class main {
    
    public static void main(String[] args) {
        
           thread1 t1 = new thread1();
           thread2 t2 = new thread2();
           
           t1.start();
           t2.start();
        
    }
}
