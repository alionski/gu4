package arrays;

public class Array7 {
	private int[] array = new int[7];

	public Array7() {
	
	}

	public Array7(int value) {
		setArray(value);
	}

	public Array7(Array7 array7) {
		setArray(array7);
	}

	public Array7(int[] intArray) {
		for (int i = 0; i < array.length; i++) {
			array[i] = intArray[i];
		}
	}

	public void setElement(int pos, int value) {
		array[pos] = value;
	}

	public int getElement(int pos) {
		return array[pos];
	}

	public void setArray(Array7 array7) {
		for (int i = 0; i < array.length; i++) {
			array[i] = array7.getElement(i);
		}
	}

	public void setArray(int value) {
		for (int i = 0; i < array.length; i++) {
			array[i] = value;
		}
	}

	public Array7 copy() {
		return new Array7(array);
	}

	public String toString() {
		String res = "{";
		for (int i = 0; i < array.length; i++) {
			if (i > 0) {
				res += ",";
			}
			res += array[i];
		}
		res += "}";
		return res;
	}

//	 public static void main(String[] args) {
//		 Array7 a0 = new Array7();
//		 Array7 a1 = new Array7(1);
//		 Array7 a2 = new Array7(2);
//	
//	 }
}
