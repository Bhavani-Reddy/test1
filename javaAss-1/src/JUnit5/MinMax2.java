package JUnit5;
public class MinMax2 {

	public int[] findMinMax(int [] a1){
		

		int min=Integer.MAX_VALUE;
		for(int i=0;i<a1.length;i++) {
			if(a1[i]<min) {
				min=a1[i];
			}
			
		}
		int max=Integer.MIN_VALUE;
		for(int i=0;i<a1.length;i++) {
			if(a1[i]>max) {
				max=a1[i];
			}
		}
		int arr[]= {min,max};
		return arr;
		
	}
	
}