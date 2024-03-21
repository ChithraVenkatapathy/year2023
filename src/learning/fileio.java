package learning;
import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileio {

	public static void main(String[] args) throws IOException {
	
		File file=new File("D:\\Chithra_interview\\newfile.txt");
		if(file.createNewFile()) {
			System.out.println("File created");
			Desktop dk=Desktop.getDesktop();
			dk.open(file);
			//dk.print(file);
			
			
		}else {
			System.out.println("File already exists");
			Desktop dk=Desktop.getDesktop();
			dk.print(file);
		}
		FileWriter fw=new FileWriter(file);
		fw.write("hello chithra. learn the file operation. this will help you one day");
		fw.write("Thanks & Regards, V.Chithra.");
		fw.close();
		//FileReader fr=new FileReader(file);
		Scanner sc=new Scanner(file);
		while(sc.hasNextLine()) {
			String res=sc.nextLine();
			System.out.println(res);
		}
		sc.close();
		
		if(file.exists()) {
			System.out.println("File exists");
		}
		if(file.isAbsolute()) {
			System.out.println("File name is absoulte");
		}
		if(file.isFile()) {
			System.out.println("File is a file");
		}
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getCanonicalPath());
		System.out.println(file.getPath());
		System.out.println(file.getName());
		System.out.println(file.getParent());
		if(file.canExecute()) {
			System.out.println("File can be exceuted");
		}
		if(file.canRead()) {
			System.out.println("File can be Readed");
		}
		if(file.canWrite()) {
			System.out.println("File can be writed");
		}
		File filecreate=new File("D:\\test\\test\\test");
		if(filecreate.mkdir()){
			System.out.println("mkdir directory created");
		}else System.out.println("mkdir could not create directory");
		if(filecreate.mkdirs()) {
			System.out.println("mkdirs Directory created");
		}else System.out.println("mkdirs not able to create directory");
		File renamefile=new File("D:\\Chithra_interview\\newtextfile.txt");
		if(file.renameTo(renamefile)) {
			System.out.println("File renamed");
		}else System.out.println("file not found");
		if(renamefile.delete()) {
			System.out.println("File deleted successfully");
		}else
			System.out.println("file not exist");
	}

}
