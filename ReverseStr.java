import java.lang.*;
import java.io.*;
import java.util.*;
  

class ReverseStr {
    public static void main(String[] args)
    {
        String input = "edulab";
  
        StringBuilder inputsb = new StringBuilder();
  
        
        inputsb.append(input);
  
        
        inputsb.reverse();
  
        
        System.out.println(inputsb);
    }
}