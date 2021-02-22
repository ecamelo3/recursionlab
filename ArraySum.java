
public class ArraySum {
	
	int index = 0;
	Integer[] a = new Integer[index];
	
	public int sumOfArray(Integer[] a, int index) {
		if(index == -1)
			return 0;
		else
			return a[index] + sumOfArray(a, index - 1);
	}

	
	
}
