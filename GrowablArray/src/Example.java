public class Example {
	Object[] arrayObject = new Object[5];
	private int elementCount = 0;

	public void add(Object obj) {
		if (elementCount == arrayObject.length) {
			increseCapacity();
		}
		arrayObject[elementCount] = obj;
		elementCount++;
	}

	public void increseCapacity() {
		int newArraySize = arrayObject.length * 2;
		Object[] newArrObjects = new Object[newArraySize];
		// System.arraycopy(arrayObject, 0, newArrObjects, 0,
		// arrayObject.length);
		for (int i = 0; i < arrayObject.length; i++) {
			newArrObjects[i] = arrayObject[i];
		}
		arrayObject = newArrObjects;
	}

	public int size() {
		return elementCount;
	}

	public int capacity() {
		return arrayObject.length;
	}

	public Object display(int index) {
		if (index >= size() || index < 0) {
			throw new IndexOutOfBoundsException();
		}
		return arrayObject[index];
	}

	public void show() {
		for (Object obj : arrayObject) {
			System.out.println(obj);
		}
	}

	public void replace(int index, Object obj) {
		arrayObject[index] = obj;
	}

	public void remove(int index) {
		if (index < 0 || index >= size()) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		while (index < size() - 1) {
			arrayObject[index] = arrayObject[index + 1];
			index++;
		}
		elementCount--;
	}

	public void insert(int index, Object obj) {
		if (index < 0 || index > capacity()) {
			throw new ArrayIndexOutOfBoundsException(
					"Check our index, this Array has only capacity of "
							+ capacity() + " element");
		}
		if (elementCount == capacity()) {
			increseCapacity();
		}

		for (int i = size() - 1; i >= index; i--) {
			arrayObject[i + 1] = arrayObject[i];
		}
		arrayObject[index] = obj;
		elementCount++;

	}
}
