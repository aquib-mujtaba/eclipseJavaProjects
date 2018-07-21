package wrinting_in_file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterExp {
	public static void main(String[] args) throws IOException {

		FileWriter fl = new FileWriter("C:\\Users\\Aquib\\Desktop\\student.txt", true); //
		BufferedWriter bf = new BufferedWriter(fl);
		bf.write("hello World im Buffer Writer Example for Writting");
		bf.close();
		System.out.println("File Sucssefully Written");

	}

}
