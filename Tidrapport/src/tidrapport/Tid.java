/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tidrapport;

/**
 *
 * @author danie
 */
public class Tid {
    
    public static int Start(int tim, int min){
        
        
        int startTid = min + (tim * 60);
        
        return startTid;
    }
    
    public static int Slutar (int tim, int min){
        
        int stoppTid = min +( tim * 60);
        return stoppTid;
    }

    public static int JobbTid (int startTid, int stoppTid){
        
        int jobbTid = stoppTid - startTid;
        
        return jobbTid;
    }
    
    public static int min(int x, int y){
        // kollar om det är så att "x" som är minuter är någon av domma
        
        // denna måste göras om & förbättras så den går att ändra med "y" variaben mer 
        if (x == 6 || x == 12 || x == 18 || x == 24 || x == 30 || x == 36 ||
                x == 42 || x == 48|| x == 54){
            
            return x;
        }
        // y ska vara en variabel som man variera beroende på hur mycket övertid
        // till lägg i mitt fall så har "y" värdet "6"
        // 60 är antal minuter det är på en timma
        
        
        x =  (x / y);
        System.out.println(x);
        
        // "a" ska vara noll om man vill lägga till +6 i mitt fall
        // "a" ska vara 60 om man vill dra bort -6 i mitt fall
        
        int a = 60;
        for (int i = 0; x > i || x == i ; ++i)
            // ska vara plus om man vill lägga till +6 
            // ska vara minus om man vill dra bort -6
            a = a - 6;
        
                   
        return a;
        
    }
}

/*
public static int Tid(int x, int y){
        // om 
        if (x == 6 || x == 12 || x == 18 || x == 24 || x == 30 || x == 36 ||
                x == 42 || x == 48|| x == 54){
            
            return x;
        }
        // y ska vara en variabel som man variera beroende på hur mycket övertid
        // till lägg i mitt fall så har "y" värdet "6"
        // 60 är antal minuter det är på en timma
        int k = 60 / y;
        
        x = x / y;
                
        int j = 1;
        int a = 0;
        for (int i = 0; x > i || x == i ; ++i)
            a = a + 6;
        
        if (a >=60){
           return j;              
           }
            
        return a;
        
    }
*/