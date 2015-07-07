package day02;

import java.util.Random;
public class Homework {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int score[][] = new int[20][5];
     for(int i=0;i<20;i++){
    	 for(int j=0;j<5;j++){
    		 score[i][j] = new Random().nextInt(100) + 1;
    		 
    	 }
     }
     int studentsum[] = new int[20];
     double studentaver[] = new double[20];
     int studentsum1;
     for(int i = 0;i<20;i++){
    	 studentsum1 = 0;
    	 for(int j =0;j<5;j++){
         studentsum1 += score[i][j];
         studentsum[i] = studentsum1;
    	 }
     }
     for(int i = 0;i<20;i++){
    	 studentaver[i] = 1.0*studentsum[i]/5;
     }
     System.out.println("coreC++"+"\t" + "Java"+"\t"+"Servlet"+"\t"+"JSP"+"\t"+"EJB");
     for(int i=0;i<20;i++){
    	 System.out.println();
    	 for(int j=0;j<5;j++){
    		 System.out.print(score[i][j]+"\t");
    	 }
     }
     System.out.println();
     for(int i = 0;i<20;i++){
    	 int j = i+1;
    	 System.out.println("第"+j+"个同学的总分为"+studentsum[i]);
    	 System.out.println("第"+j+"个同学的平均分为"+studentaver[i]);
     }
     //for(int i = 0;i<20;i++){
    	// int j = i+1;
    	 //System.out.println("第"+j+"个同学的平均分为"+studentaver[i]);
    	 
    // }
    
	}

}
