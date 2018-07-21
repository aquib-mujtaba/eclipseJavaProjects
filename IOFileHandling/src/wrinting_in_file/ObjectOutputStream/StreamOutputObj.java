package wrinting_in_file.ObjectOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StreamOutputObj {

	public static void main(String[] args) throws IOException {
		Student s = new Student(12, "Aquib", 86.00);
		FileOutputStream fo = new FileOutputStream("C:\\Users\\Aquib\\Desktop\\student1.txt");
		ObjectOutputStream os = new ObjectOutputStream(fo);
		os.writeObject(s);
		fo.close();
		System.out.println("Written Sucssefull");
	}

}
