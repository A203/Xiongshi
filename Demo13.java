package day02;

public class Demo13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[];
    int []a1;
    
    a = new int[3];
    
    int size = 5;
    a1 = new int[size];
    //数组初始化
    a[0] = 1;
    a[2] = 2;
    a[3] = 3;
    //方式2
    int b[] = {1,2,3,4,5};
    int b1[] = new int[]{1,2,3,4,5};
    //int b2[] = new int[5]{1,2,3,4,5};//如果设置了初始化值，不能指定长度
    /*int b3[];
     * b3 = {1,2,3,4,5};
     */
    //输出 a数组内容
    System.out.println("数组长度"+a.length);
    for(int i = 0;i<a.length;i++){
    	System.out.println(a[i]);   	
    }
	}

}
