package infexp;

public class CpuImpl implements IMouse {

	@Override
	public void rightClick() {
		System.out.println("Right click by Mouse");
	}

	@Override
	public void LeftClick() {
		System.out.println("Left Click by Mouse");
	}

	@Override
	public void doubleClick() {
		System.out.println("Double click by Mouse");
	}

	void type() {
		System.out.println("Sub class Specific Method");
	}

	public static void main(String[] args) {
		IMouse im = new CpuImpl();
		im.rightClick();
		im.LeftClick();
		im.doubleClick();
		((CpuImpl) im).type();// Type Casting
	}

}
