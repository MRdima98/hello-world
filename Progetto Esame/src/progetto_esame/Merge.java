package progetto_esame;
import java.io.*;

public class Merge {
	
	public Merge() {
		
	}
	
	private FileInputStream in;
	private FileOutputStream out;
	private int i=1;
	

	public void read() {
		try {
			out=new FileOutputStream("day.png",true);
			System.out.println("Ciao");
			while(i<=2) {
				System.out.println(i);
				in= new FileInputStream("day" + i + ".txt");
				
				byte[] buff=new byte[in.available()];
				in.read(buff);
				out.write(buff);
				in.close();
				System.out.println(buff);
				i++;
				
			}
			out.close();
		}
		catch(Exception e){
			System.out.println("Errore");
		}
	}
}
