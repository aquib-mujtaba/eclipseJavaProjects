package wrinting_in_file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderExp {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("C:\\Users\\Aquib\\Desktop\\student.txt");
		BufferedReader br = new BufferedReader(fr);
		String s = "";
		while ((s = br.readLine()) != null) {
			System.out.println(s);
		}
		br.close();
	}
}
