package day02;

public class Demo6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
	//int i = 1;
	//do {
		//	System.out.println(i);
			//i++;//
	//	}while(i<1);
	//}
	/**
	 * 使用for输出1-100
	 */
   // for(;i<=100;i++){
   // 	 System.out.println(i);
    //}
	
	
	int[] integers={1,2,3,4};//定义整型数组
	for(int i = 0;i<integers.length;i++){
		System.out.println(integers[i]);
		
		
	}
	
	for(int n:integers)
		System.out.println(n);
	}
}
