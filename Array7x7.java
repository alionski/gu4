package arrays;

public class Array7x7 {
	private int[][] array = new int[7][7];

	public Array7x7() {

	}

	public Array7x7(int value) {
		setArray(value);
	}

	public Array7x7(Array7x7 array7x7) {
		setArray(array7x7);
	}

	public Array7x7(int[][] intArray) {
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length; col++) {
				array[row][col] = intArray[row][col];
			}
		}
	}

	public void setElement(int row, int col, int value) {
		array[row][col] = value;
	}

	public int getElement(int row, int col) {
		return array[row][col];
	}

	public void setRow(int row, Array7 array7) {
		for (int i = 0; i < array[row].length; i++) {
			array[row][i] = array7.getElement(i);
		}
	}

	public void setRow(int row, int value) {
		for (int i = 0; i < array[row].length; i++) {
			array[row][i] = value;
		}
	}

	public Array7 getRow(int row) {
		Array7 array7 = new Array7();
		for (int i = 0; i < array.length; i++) {
			array7.setElement(i, array[row][i]);
		}
		return array7;
	}

	public void setCol(int col, Array7 array7) {
		for (int i = 0; i < array.length; i++) {
			array[i][col] = array7.getElement(i);
		}
	}

	public void setCol(int col, int value) {
		for (int i = 0; i < array.length; i++) {
			array[i][col] = value;
		}
	}

	public Array7 getCol(int col) {
		Array7 array7 = new Array7();
		for (int i = 0; i < array.length; i++) {
			array7.setElement(i, array[i][col]);
		}
		return array7;
	}

	public void setArray(int value) {
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length; col++) {
				array[row][col] = value;
			}
		}
	}

	public void setArray(Array7x7 array7x7) {
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length; col++) {
				array[row][col] = array7x7.getElement(row, col);
			}
		}
	}

	public Array7x7 copy() {
		return new Array7x7(array);
	}

	public String toString() {
		String res = "";
		for (int row = 0; row < array.length; row++) {
			res += "{";
			for (int col = 0; col < array[row].length; col++) {
				if (col > 0) {
					res += " ";
				}
				res += array[row][col];
			}
			res += "}";
			res += "\n";
		}
		return res;
	}

//	 public static void main(String[] args) {
//	 Array7x7 a0 = new Array7x7();
//	 Array7x7 a1 = new Array7x7(1);
//	 Array7x7 a2 = new Array7x7(2);
//	 }

}
