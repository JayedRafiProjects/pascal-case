/*******************************
 * 
 * Project: Pascal case for usual text
 * Language: Java
 * Date: June 2021
 * 
 * Dev: Jayed Rafi
 *
*******************************/

import java.util.Scanner; //importing scanner
public class PascalCase {
    public static void main(String args[]) {
      
      Scanner scan = new Scanner(System.in);
      String name = scan.nextLine();
      String[] splitName = name.split(" "); //Assigning each words in the input sentence into an array
      String output = "";
      int endPoint = splitName.length;
      int i = 0;
      
      while(i<endPoint)

      {
          String process = "";
          process += splitName[i].charAt(0);
          process = process.toUpperCase();
          String lower = "";

          for(int j=1; j<splitName[i].length(); j++)

          {
              lower+=splitName[i].charAt(j);
          }

          process+=lower.toLowerCase()+" ";
          output+=process+" ";
          process="";
          lower = "";
          i++;
          }
          System.out.println(output);
      }
    }
