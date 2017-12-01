/*
* algorithm for searching for a given key in an indexed array that has been ordered 
  by numerical values assigned to the keys (key values).  
*/
package interpoletionsearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author jonathan andres moreno leyva
 */
public class Interpoletionsearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException
    {
      InputStreamReader isr = new InputStreamReader (System.in);
      BufferedReader br = new BufferedReader ( isr );// creation of buffers
      
      System.out.println ("introdusca los numeros ordenados ");
      String [] numero=br.readLine().split ("," );
      int[] array = new int [numeros. length];
      
      System.out.println ("introdusca valor a encontrar");
      int x= Integer.parseInt (br.readLine()); // value to find
      
      for (int i =0; i < numeros. length; i++) { // process to save numbers in string in the array 
          array [i]= Integer.parseInt(numeros[i]);
      }  
      int index1=Interpoletionsearch (array,x); // call a recursion interpoletionsearch
      
      System.out.print ("el numero "+x+" esta en la posicion numero"+ (index1+1)+"del areglo");
    }
    static int Interpoletionsearch (int []A, int x){
        int lower_bound=0;
        int upper_bound=A.length-1;
        int index=-1; 
                                                                                                                                                                                                                                                                                                                                                                                       
       while (lower_bound<upper_bound) 
    {
        int middlepoint=lower_bound+((upper_bound-lower_bound)/(A[upper_bound]-A[Lower_bound]))* (-)[lower_bound];
        if (x==A [middlepoint]){
           
          index=middlepoint;
          break;
          
        } else {
        
      if ( x<A[middlepoint]){
      upper_bound = middlepoint-1; 
      //If the upper limit is lower than the lower limit, there would be no solution
            
            
   } else {
        lower_bound=middlepoint+1;
    } 
 }

if (lower_bound==upper_bound&& A [lower_bound]==x)
  {  
      index=lower_bound;
  }
 return index;
 
 }
    
