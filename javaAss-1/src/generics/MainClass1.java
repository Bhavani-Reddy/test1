/*package generics;
//import static generics.Exchange1.*;
public class MainClass1 {
    public static void main(String[] args) {
        int[] arr = {12,6,8,3,5,9,45};
        int a=2;
        int b=5;
        System.out.println("----------------before swapping-----------"+a+ " "+b);
        non_gen obj= new non_gen();
        obj.swap_ele(arr,a,b);
        System.out.println("----------------before swapping-----------"+a+ " "+b);
        obj.print(arr);

    }
}
class non_gen{
	
    public <E> void swap_ele(int arr[],int i,int j){
        int temp=0;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        
    }
    public void print(int aar1[]){
        for (int i = 0; i < aar1.length; i++) {
            System.out.println(aar1[i]);
        }
    }

}


*/
package generics;
public class MainClass1 {

	public static void main(String[] args) {
		Integer[] arr = {10,20,50,60};
		int p=2;
		int q=3;
		
		Exchange1<Integer> x = new Exchange1<>(arr);
		Integer[] arr2 = x.getArr();
		System.out.println("Swapping at index "+p+ "and "+q);
		System.out.println("--------------before swap-----------");
		x.printElements(arr);
		x.swap(arr,p,q);
		System.out.println("--------------after swap-----------");
		x.printElements(arr);
		

		
	}
}




