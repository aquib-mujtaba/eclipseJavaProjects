package wrinting_in_file;

import java.io.FileInputStream;
import java.io.IOException;

public class StreamInputExp {
	public static void main(String[] args) throws IOException {
		FileInputStream fi = new FileInputStream("C:\\Users\\Aquib\\Desktop\\student.txt");
		int i;
		while ((i = fi.read()) != -1) {
			System.out.print((char) i);
		}
		fi.close();
	}

}
