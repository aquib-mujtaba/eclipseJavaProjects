package wrinting_in_file.ObjectOutputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class StudentInputObj {
	public static void main(String[] args) {
		ObjectInputStream oi = null;
		try {
			FileInputStream fi = new FileInputStream("C:\\Users\\Aquib\\Desktop\\student1.txt");
			oi = new ObjectInputStream(fi);
			Object o = oi.readObject();
			if (o instanceof Student) {
				Student s = (Student) o;
				System.out.println("Id=" + s.id + " Name=" + s.name + " Precent=" + s.perct);
			}
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				oi.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
