import java.io.*;
public class JavaExceptionExample{  
    public static void main(String args[]){  
        try{  
        //code that may raise exception  
        
		int []arr = new int[5];
		arr[10] = 50;
		
        }
		catch(ArrayIndexOutOfBoundsException e){
			
		System.out.println(e);
		}
		finally {
			System.out.println("To kaise ho aap?");
		}
        //rest code of the program   
        System.out.println("rest of the code...");  
    }  
} 