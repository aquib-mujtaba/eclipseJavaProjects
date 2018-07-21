public class Student {
	void Take() {
		System.out.println("Student goes to teacher");
		Teacher t = new Teacher();
		Paper p = t.Give();
		System.out.println("Teacher gives question paper to student");
		p.studentName = "Aquib";
		p.contact = 8821020731l;
		p.roll = 33;
		System.out.println("Student name=" + p.studentName
				+ " Student contact=" + p.contact + " Student roll Number="
				+ p.roll);
	}
}
