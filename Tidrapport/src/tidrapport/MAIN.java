/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tidrapport;

/**
 *
 * @author daniel
 */
public class MAIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int min = 49;
        int x = 6;
        Tid rg = new Tid();
            int tid = rg.slutMin(min, x);
    
            System.out.println(tid);
            
    }
    
    
}
