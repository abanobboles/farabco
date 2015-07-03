/* ################ FARABCO ####################
 * This application is designed and developed by SHENOUDA FAWZY .
 * This application created to convert from ARABIC to FRANCO and vice versa.
 * The source is free for individuals not for companies.
 * -----------------------------------------------------------------------------
 * What is FRANCO: Franco is a writing format used by Arabian specially Egyptians for mapping
 * the Arabic phonetics using some English letter and some numbers .
 */

package Farabco_Package;


import java.net.URISyntaxException;
import java.util.*;
import javax.swing.JFrame;

// Set is used to store dublicate-free elements .

public class TestFarabco {
    public static void main(String [] args) throws URISyntaxException{
    
       FarabcoForm fra = new FarabcoForm();
       fra.setVisible(true);
       
       
        //FarabcoForm.setDefaultLookAndFeelDecorated(true);
        
// Test cases For converting arabic to franco .        
//    String str1 = "الاسم: شنوده ، السن / 22 سنة";
//    String str2 = "الطول : 172 سم";
//    String str3 = "بسمع موسيقى قديم";
//    String str4 = "مش بحب الاغاني" ;
//    String str5 = "بحب اسمع ترانيم";
//
//        Farabco fra = new Farabco();
//        fra.setArabicStatment(str1);
//        String franco = fra.getFrancoStatment();
//        System.out.println(franco);
//        
//        
//        
//        
//        fra.setArabicStatment(str2);
//        franco = fra.getFrancoStatment();
//        System.out.println(franco);
//        
//        
//        fra.setArabicStatment(str3);
//        franco = fra.getFrancoStatment();
//        System.out.println(franco);
//        
//        
//        fra.setArabicStatment(str4);
//        franco = fra.getFrancoStatment();
//        System.out.println(franco);
//        
//        
//        fra.setArabicStatment(str5);
//        franco = fra.getFrancoStatment();
//        System.out.println(franco);
//        
//// Test cases for converting to Arabic
//        
//        System.out.println("Test converting franco to arabic.");
//        Farabco ara = new Farabco();
//        
//        String astr1 = "ana b7b mariam"; // Failed in last char
//        String astr2 = "A5oya shenouda"; // Faild in 'sh'
//        String astr3 = "Shenouda";
//        String astr4 = "aShenouda";
//        String astr5 = "ana Shadia";
//        String astr6 = "gitBash--";
//        String astr7 = "mina";
//        
//        ara.setFrancoStatment(astr1);
//        String arabic = ara.getArabicStatment();
//        System.out.println(arabic);
//        
//        ara.setFrancoStatment(astr2);
//        arabic = ara.getArabicStatment();
//        System.out.println(arabic);
//        
//        ara.setFrancoStatment(astr3);
//        arabic = ara.getArabicStatment();
//        System.out.println(arabic);
//        
//        ara.setFrancoStatment(astr4);
//        arabic = ara.getArabicStatment();
//        System.out.println(arabic);
//        
//        
//        ara.setFrancoStatment(astr5);
//        arabic = ara.getArabicStatment();
//        System.out.println(arabic);
//        
//        ara.setFrancoStatment(astr6);
//        arabic = ara.getArabicStatment();
//        System.out.println(arabic);
//        
//        ara.setFrancoStatment(astr7);
//        arabic = ara.getArabicStatment();
//        System.out.println(arabic);        
        
    }
}
