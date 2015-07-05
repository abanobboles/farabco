/* ################ FARABCO ####################
 * This application is designed and developed by SHENOUDA FAWZY .
 * This application created to convert from ARABIC to FRANCO and vice versa.
 * The source is free for individuals not for companies.
 * -----------------------------------------------------------------------------
 * What is FRANCO: Franco is a writing format used by Arabian specially Egyptians for mapping
 * the Arabic phonetics using some English letter and some numbers .
 */


package Farabco_Package;
import java.util.*;
/**
 *
 * @author Shenouda Fawzy
 */
public class Farabco {
    private String arabicStatment;
    private String francoStatment;
    private String prevChar , thisChar , nextChar;
    
    Map<Character , String> arabicKey; // 28 arabic char with , value in English.
    Map<String , Character> francoKey; // 28 arabic char with , value in English.
    
    public Farabco(){
        arabicKey = new HashMap<Character , String>();
        francoKey = new HashMap<String , Character>();
        
        this.initialization(); // for arabic and english
        this.initializeFrancoKey();
        
        arabicStatment = new String();
        francoStatment = new String();
        
        prevChar = new String();
        thisChar = new String();
        nextChar = new String();
        
    }
    
    public Farabco(String arabicStatment , String francoStatment){
        
        this.initialization(); // for arabic and english
        this.initializeFrancoKey();
        
        arabicKey = new HashMap<Character , String>();
        francoKey = new HashMap<String , Character>();
        
        this.arabicStatment = arabicStatment;
        this.francoStatment = francoStatment;
    }
    
// Setter and Getter methods.
    
    public void setArabicStatment(String arabicStatment){
        this.arabicStatment = arabicStatment;
    }
    
    public void setFrancoStatment(String francoStatment){
        this.francoStatment = francoStatment;
    }
    
    private void convertToArabic(){
       // String [] tokens = francoStatment.split(" ");
        
        
        StringBuilder buffer = new StringBuilder(""); // Empty buffer.
        
        StringBuilder str = new StringBuilder(); // the final converted string.
        
        for(int i = 0 ; i < this.francoStatment.length() ; i++){
            
            buffer.append(francoStatment.charAt(i));
            
            if(i < this.francoStatment.length() - 1) // for avoiding out of bound exception.
                buffer.append(francoStatment.charAt(i+1));
            
            String sss = buffer.toString();
            
            if(sss.equalsIgnoreCase("th") || sss.equalsIgnoreCase("sh") || sss.equalsIgnoreCase("kh") ||sss.equalsIgnoreCase("3\'")) {
                
                
                Character st = francoKey.get(sss.toLowerCase()); // Finde the value of the defined key.
                str.append(st);
                
                i += 1;
                buffer.delete(0, buffer.length()); // clear the buffer.
                
            }
            else{ // char by char.
                
                buffer.delete(0, buffer.length()); // Clear the buffer.
                buffer.append(francoStatment.charAt(i));
                
                if(francoKey.containsKey(buffer.toString()) == true){
                    str.append( francoKey.get(buffer.toString()) );
                    buffer.delete(0, buffer.length());
                }
                else{
                    str.append(francoStatment.charAt(i));
                    buffer.delete(0, buffer.length()); // Clear the buffer.
                }
                
            }
        } // End of for statment
        
        this.arabicStatment = str.toString();
        
    }
    
    public String getArabicStatment(){
        convertToArabic();
        return this.arabicStatment;
    }
    
    private void convertToFranco(){
        
        StringBuilder str = new StringBuilder();
        for(int i = 0 ; i < this.arabicStatment.length() ; i++){
            if( arabicKey.containsKey(arabicStatment.charAt(i)) == true  ){
                String strs = arabicKey.get(arabicStatment.charAt(i));
                
                str.append(strs);
            }
            else
                str.append(arabicStatment.charAt(i)); // to insert the char like {* , / , - , ... , etc}
        }
        
        this.francoStatment = str.toString();
    }
    
    public String getFrancoStatment(){
        convertToFranco();
        return this.francoStatment;
    }
    
    private void initialization(){
        
        arabicKey.put('ا', "a");
        arabicKey.put('أ', "a"); //Tested by 'Boula EL-kes Mina'
	arabicKey.put('ب', "b");
	arabicKey.put('ت', "t");
	arabicKey.put('ث', "th");
	arabicKey.put('ج', "g");
	
	arabicKey.put('ح', "7");
	arabicKey.put('خ', "5");
	arabicKey.put('د', "d");
	arabicKey.put('ذ', "z");
	arabicKey.put('ر', "r");
	
	arabicKey.put('ز', "Z");
	arabicKey.put('س', "s");
	arabicKey.put('ش', "Sh");
	arabicKey.put('ص', "S"); // --
	arabicKey.put('ض', "D");
	
	arabicKey.put('ط', "6"); // -- 't'
	arabicKey.put('ظ', "Z");
	arabicKey.put('ع', "3");
	arabicKey.put('غ', "3\'");
	arabicKey.put('ف', "f");
	
	arabicKey.put('ق', "2");
	arabicKey.put('ك', "k");
	arabicKey.put('ل', "l");
	arabicKey.put('م', "m");
	arabicKey.put('ن', "n");
	
	arabicKey.put('ه', "h");
	arabicKey.put('و', "w");
	arabicKey.put('ي', "y");
        arabicKey.put('ى', "a");
        
      //Special Key
        arabicKey.put(' ', " ");
        arabicKey.put('ة', "a");
        arabicKey.put('ئ', "2");
        arabicKey.put('ء', "2");
        arabicKey.put('ؤ', "2");
    }
    
    private void initializeFrancoKey(){
        
    	francoKey.put("A" , 'ا');
	francoKey.put("a" , 'ا');
	francoKey.put("b" , 'ب');
	francoKey.put("B" , 'ب');
	francoKey.put("t" , 'ت');
	francoKey.put("T" , 'ط'); //Tested by 'Boula EL-kes Mina'
	francoKey.put("th" , 'ث');
	francoKey.put("g" , 'ج');
	francoKey.put("G" , 'ج');
	
	francoKey.put("7" , 'ح');
	francoKey.put("5" , 'خ');
        francoKey.put("4" , 'ش'); // Tested by 'Shady Fabbino'
        francoKey.put("9" , 'ق'); // Tested by 'Shady Fabbino'
        
        francoKey.put("kh" , 'خ');
	francoKey.put("d" , 'د');
	francoKey.put("z" , 'ز');
	francoKey.put("r" , 'ر');
	francoKey.put("R" , 'ر');
	
	francoKey.put("s" , 'س');
	francoKey.put("sh" , 'ش');
        francoKey.put("ch" , 'ش');
	francoKey.put("S" , 'ص');
	francoKey.put("D" , 'ض');
	francoKey.put("6" , 'ط');
	
	francoKey.put("Z" , 'ظ');
	francoKey.put("3" , 'ع');
	francoKey.put("3\'" , 'غ'); // Tested by 'Boula EL-kes Mina'
        francoKey.put("q" , 'ق');   // Tested by 'Boula EL-kes Mina'
        francoKey.put("Q" , 'ق');   // Tested by 'Boula EL-kes Mina'
        francoKey.put("8" , 'غ');
	francoKey.put("f" , 'ف');
	francoKey.put("F" , 'ف');
	francoKey.put("2" , 'أ'); // Tested by 'Botros Sameh & Hosam Sabry'
	
	francoKey.put("k" , 'ك');
	francoKey.put("K" , 'ك');
	francoKey.put("l" , 'ل');
	francoKey.put("L" , 'ل');
	francoKey.put("m" , 'م');
	francoKey.put("M" , 'م');
	francoKey.put("n" , 'ن');
	francoKey.put("N" , 'ن');
	francoKey.put("h" , 'ه');
	francoKey.put("H" , 'ه');
	
	francoKey.put("w" , 'و');
	francoKey.put("W" , 'و');
	francoKey.put("o" , 'و');
	francoKey.put("O" , 'و');
	
        francoKey.put("i" , 'ي');
	francoKey.put("I" , 'ي');
        
        francoKey.put("e" , 'ي');
        francoKey.put("E" , 'ي');
        
        francoKey.put("u" , 'و');
        francoKey.put("U" , 'و');
        
	francoKey.put("y" , 'ي');
	francoKey.put("y" , 'ي');
        
        francoKey.put("c" , 'ك');
        francoKey.put("C" , 'ك');
        francoKey.put("p" , 'ب');
        francoKey.put("P" , 'ب');
	
	francoKey.put(" " , ' ');
    }
    
}
// End of the programe