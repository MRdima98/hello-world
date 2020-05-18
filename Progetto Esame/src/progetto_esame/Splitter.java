package progetto_esame;
import java.io.*;

public class Splitter {

	private File file=new File("D:\\Dima\\wallpaper\\day.png");
	private FileInputStream in;
	private FileOutputStream out;
	private long fileSize=file.length();
	private int chunksDim;
	private int numF=0;
	
	
	public Splitter(int c) {
		chunksDim=c;
	}
	
	
	public void read() {
		try {
			
			in=new FileInputStream(file);
			byte[] buff =new byte[chunksDim];
			while(fileSize>=0) {
				numF++;
				in.read(buff);
				out=new FileOutputStream("day" + numF + ".txt");
				out.write(buff);
				out.close();
				fileSize=fileSize-chunksDim;
				System.out.println(numF);
				if (numF >50) {
					System.out.println("Col cazzo");
					break;
				}
				
			}
			
			in.close();
		}
		catch(Exception e) {
			System.out.println("Errore");
		}
	}
}
