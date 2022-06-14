    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uklonline4;

/**
 *
 * @author ASUS
 */
public class Uklonline4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Adrian pramana wijaya-XRPL2
    int nilaisukupertama = 5;
        int selisih = 3;   
        int sisimatriks = 5;
        int deret = nilaisukupertama;
        int total = 0;
        
        for(int i=0;i<sisimatriks;i++){//baris
            for(int j=0; j<5-i; j++){//kolom
                System.out.print(deret+"\t");
                
                deret += selisih;
            }
            System.out.println("");
    }
        for(int i=0;i<sisimatriks;i++){//baris
            for(int j=0; j<=i; j++){//kolom
                System.out.print(deret+"\t");
                deret += selisih;
    }      
                System.out.println("");
        }    
    }
}

    
    

