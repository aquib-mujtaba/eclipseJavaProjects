package reading_from_one_Writting_another;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadingWritting {

	public static void main(String[] args) throws IOException {
		FileInputStream fi = null;
		FileOutputStream fo = null;
		try {
			fi = new FileInputStream("C:\\Users\\Aquib\\Desktop\\student.txt");
			fo = new FileOutputStream("C:\\Users\\Aquib\\Desktop\\details.txt", true);
			int b;
			while ((b = fi.read()) != -1) {
				fo.write(b);
			}
		} finally {
			fi.close();
			fo.close();
			System.out.println("Sucssesfully copied");
		}
	}

}
