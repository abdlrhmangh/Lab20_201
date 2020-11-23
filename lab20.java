import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class lab20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	
	
		
		
		FileOutputStream output=new FileOutputStream("output.dat");
		//will output file that will have the values in the binary form
		FileOutputStream outputTxt=new FileOutputStream("output.txt");
		//will output file that will have the values in the txt form 
		PrintWriter pw= new PrintWriter(outputTxt);
		//to print out the values as a txt file
		
		Random random= new Random();
		//a "random" object that will generate random numbers
		
		for(int i=0;i<1000000;i++) {
			int x=random.nextInt(255);
			//we bound the random object to 255 which is 256 bits from 0-255 and that will equal to 1 byte
				output.write(x);
			//writing the binary output
				pw.print(x);
			//writing the txt output
				
		}
		
		
		
		
		System.out.println("I/O Size : "+ new File("output.dat").length()//this method is used to output the size of the folders and as we can see the 
				//output of the binary file have less size than the txt file
				+"\nTxt size : "+ new File("output.txt").length());
		

		pw.close();
		output.close();
		outputTxt.close();
		
		
		
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			};
		}

		
	}


