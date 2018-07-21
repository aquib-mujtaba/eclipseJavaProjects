package wrinting_in_file;

import java.io.FileOutputStream;
import java.io.IOException;

public class StreamOutput {
	public static void main(String[] args) {
		FileOutputStream fs = null;
		try {
			fs = new FileOutputStream("C:\\Users\\Aquib\\Desktop\\details.txt", true);
			String s = "Hello";
			char ch[] = s.toCharArray();
			for (int j = 0; j < ch.length; j++) {
				try {
					fs.write(ch[j]);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} catch (IOException e) {
			e.getMessage();
		} finally {
			if (fs != null) {
				try {
					fs.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("Written Sucssed");
	}
}
