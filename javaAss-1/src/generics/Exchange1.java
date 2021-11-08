package generics;

public class Exchange1<T> {
      private T[] arr;

	public Exchange1(T[] arr) {
		super();
		this.arr = arr;
	}

	public T[] getArr() {
		return arr;
	}

	public void setArr(T[] arr) {
		this.arr = arr;
	}
      
	public <E> void printElements(E[] arr)
	{
		for(E e : arr)
		{
			System.out.println(e);
		}
	}
	 public static <T> void swap(T[] array, int i, int j)
	 {
		 
       	T temp = array[i];
         array[i] = array[j];
         array[j] = temp;
         
	 }
}