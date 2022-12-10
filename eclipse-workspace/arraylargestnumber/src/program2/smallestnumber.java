package program2;

public class smallestnumber {
	public static void main(String[] args) {
	int[] a= {11,2,23,4,17};
	int small = a[0];
	for(int i=0;i<a.length;i++) {
		if(a[i]<small)
			small=a[i];
	}
	System.out.println("The number is=" +small);
	}
	

}
