package CaesarCipher;

import java.util.Scanner;

public class CaesarCipher 
{
	 final String az = "abcdefghijklmnopqrstuvwxyz";
	 final String u_az = az.toUpperCase();

	 public String CaesarCipher(String str, int num)
	 {
		 StringBuilder result = new StringBuilder("");
	     for (char c : str.toCharArray())
	     {
	    	 int index = az.indexOf(c);
	         if (index != -1)
	         {
	           index += num;
	           if (index > az.length() - 1)
	           {
	               index -= az.length();
	           }
	           result.append(az.charAt(index));
	         } 
	         else
	         {
	             index = u_az.indexOf(c);
	             if (index != -1) 
	             {
	                   index += num;
	                    if (index >u_az.length() - 1)
	                    {
	                        index -=u_az.length() - 1;
	                    }

	                    result.append(u_az.charAt(index));
	                } 
	             	else
	             	{
	                    result.append(c);
	                }
	            }
	        }
	        return result.toString();
	    }
	 	public static void main(String[] args)
	 	{
	 		
		  Scanner s = new Scanner(System.in);
	      CaesarCipher c = new CaesarCipher();
	      
	      System.out.print(c.CaesarCipher(s.nextLine(), s.nextInt()));
	    }
	}
//Input:Hello
//number:4
//output:Lipps

