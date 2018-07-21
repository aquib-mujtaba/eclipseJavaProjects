package wrinting_in_file.ObjectOutputStream;

import java.io.Serializable;

public class Student implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int id;
	String name;
	double perct;

	public Student(int id, String name, double perct) {
		this.id = id;
		this.name = name;
		this.perct = perct;
	}
}
