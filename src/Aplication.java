
public class Aplication {

	public static void main(String[] args) {
		
		Integer[] data = { 100, 200, 300, 400, null };
//		здесь мы можем установить значение NULL, поскольку Integer является классом, 
//		а элементы массива являются объектами этого класса. Если объекту не присвоено значение, 
//		то по умолчанию используется значение NULL.
		
		data = firstNull(data);
		System.out.print("The null value is the first : ");
		for (Integer i : data) {
			System.out.print(i+" ");
		}
		data = lastNull(data);
		System.out.print("\nThe null value is the last  : ");
		for (Integer i : data) {
			System.out.print(i+" ");
		}
		
	}
	
	// перемещает нулевое значение из последнего элемента в первый
	public static Integer[] firstNull(Integer[] array){
		/////////while loop////////////////////
//        int i = array.length-1;
//        while( i > 0 ){
//            array[i--] = array[i];
//        }
//        array[i] = null;
//        return array;
		/////////for loop////////////////////
		for (int i = array.length - 1; i > 0; ) {
            array[i--] = array[i];
            array[i] = null;
            }
            return array;

	}
	//перемещает нулевое значение с первого элемента на последний
	public static Integer[] lastNull(Integer[] array){
    /////////while loop////////////////////
//		int j = 0;
//	        while( j < array.length-1 ){
//	            array[j++] = array[j];
//	        }
//	        array[j] = null;
//	        return array;
    /////////for loop////////////////////
		for (int i = 0; i < array.length - 1; ) {
            array[i++] = array[i];
            array[i] = null;
            }
            return array;
    }
}