package java1;

import java.io.File;
import java.io.IOException;

public class Filehandling {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f=new File("C:/Users/chintu/Desktop/SCREEn.docx");
		//f.mkdir();  //to create a file
		// f.delete();    //to delete a file or any type file
		//f.createNewFile(); //creates new type file specified in path
		boolean a=f.exists();
		
		if(a == true){
			File f1=new File("C:/Users/chintu/Desktop/SCREEn");
			f1.mkdir();
			System.out.println("folder exists");
		}
		else{
			System.out.println("no folder available");
		}
	}

}
