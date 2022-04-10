/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javatask1;

/**
 *
 * @author Rizky Fajar
 */
public class JavaTask1 {

String FulName = "Rizky Fajar Ramadhan";


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here


        Biodata biodata = new Biodata();
        
        System.out.println(biodata.getFullName());
        System.out.println(biodata.getPlaceBirth());
        System.out.println(biodata.getDateBirth());
        System.out.println(biodata.getHobby());
        System.out.println(biodata.getZodiac());
        System.out.println(biodata.getFavFood());
        System.out.println(biodata.getDreams());
    }
    
}
