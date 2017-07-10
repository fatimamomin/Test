/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//package catersmgmt;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Ramiz
 */
public class Validation {
    //public static Object numvalid;
     public static int  charvalid(String text) 
{
int i=0;
String input=text;
Pattern p = Pattern.compile("[A-Z,a-z,&%$#@!()*^, ]");
Matcher m = p.matcher(input);
if (m.find()){
      i=1;
JOptionPane.showMessageDialog(null, "String not allowed");
}
else{
}   
return i;        
    }
     
     public static int  numvalid(String text) 
{
int i=0;
String input=text;
Pattern p = Pattern.compile("[0-9]");
Matcher m = p.matcher(input);
if (m.find()){
JOptionPane.showMessageDialog(null, "Number not allowed");
i=1;
}
else{
} 
return i;        
}

   
     
    
    
}
