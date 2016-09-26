/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tidrapport;

import java.util.ArrayList;

/**
 *
 * @author daniel
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
    
    public static int startMin(int x, int y){
        // int "x" är för minuter som man har jobbat.
        //int "y" är för tids tilllägg 
        
        // skapar ett objekt för att använda array för att se hur om värdena
        // stämmer
        Tid t = new Tid();
        ArrayList<Integer> arrlist = new ArrayList<Integer>(12);
        
        // Skapar array listan & får dom vädena som y går på 60 min
        arrlist = t.arr(y);
        
        // loopa igenom array o ser om någon av värdena i den är likamed 
        // "x"
        for (Integer num : arrlist){
            
            //om värdet finns så retunerar dett värdet
            if (num == x){
                
                return x;
            }
        }

        // y ska vara en variabel som man variera beroende på hur mycket övertid
        // till lägg i mitt fall så har "y" värdet "6"
        // 60 är antal minuter det är på en timma
        
        
        x =  (x / y);
        System.out.println(x);
        x = x * y; 
        
           
        return x;
        
    }
    
    public static int slutMin(int x, int y){
        // int "x" är för minuter som man har jobbat.
        //int "y" är för tids tilllägg 
        
        // skapar ett objekt för att använda array för att se hur om värdena
        // stämmer
        Tid t = new Tid();
        ArrayList<Integer> arrlist = new ArrayList<Integer>(12);
        
        // Skapar array listan & får dom vädena som y går på 60 min
        arrlist = t.arr(y);
        
        // loopa igenom array o ser om någon av värdena i den är likamed 
        // "x"
        for (Integer num : arrlist){
            
            //om värdet finns så retunerar dett värdet
            if (num == x){
                
                return x;
            }
        }

        // y ska vara en variabel som man variera beroende på hur mycket övertid
        // till lägg i mitt fall så har "y" värdet "6"
        // 60 är antal minuter det är på en timma
        
        
        x = 1 + (x / y);
        System.out.println(x);
        
        x = x * y; 
        
        
           
        return x;
        
    }
    
    public ArrayList<Integer> arr(int y){
        
        // en array som får sinna värden genom att "y" delas med 60min
        // & sen ger väden till arrayn
        int x = 0, min = 60, total = 0;
    
        ArrayList<Integer> arrlist = new ArrayList<Integer>(12);
        
        // dela 60 min med 6 = 10 värden på "total"
        total = min / y;
        
        // loopa igenom for loopen så man får ut väden till array
        for (int i = 0; i <total; i++){
            x = x + y;
            arrlist.add(x);
        }
        
        return (arrlist);
    }


    


}
