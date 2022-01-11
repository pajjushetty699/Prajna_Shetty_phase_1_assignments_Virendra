package exercise;
import  java.io.File;
import java.io.IOException; 

public class CreateFile {

	public static void main(String[] args) {
		try{
		File f1=new File("D:file operation example.txt");
		if(f1.createNewFile()){
			System.out.println("file "+f1.getName()+" is created successfully");
		}
		else{
			System.out.println("file is already existed");
		}
		}catch(IOException exception){
			System.out.println("there is unknown error");
			exception.printStackTrace();
		}

	}

}
