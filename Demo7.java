package day02;

public class Demo7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num=0;
		// TODO Auto-generated method stub
     for(int i = 1;i<=99;i++){
    	 if(i%5==0){
    		 System.out.println(i);
    		 continue;
    	 }
    	 num++;
     }
     System.out.println("num="+num);
	}

}
