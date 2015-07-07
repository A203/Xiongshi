package day02;

import java.util.Random;
import java.util.Scanner;
public class HomeworkReview {

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
     }
     int subjectsum[] = new int[5];
     double subjectaver[] = new double[5];
     int subjectsum1;
     for(int i = 0;i<5;i++){
    	 subjectsum1 = 0;
    	 for(int j =0;j<20;j++){
         subjectsum1 += score[j][i];
         subjectsum[i] = subjectsum1;
    	 }
     }
     for(int i = 0;i<5;i++){
    	 subjectaver[i] = 1.0*subjectsum[i]/20;
     }
     
     System.out.println("请输入你想求第几门课平均分");
     System.out.println("1.core C++，");
     System.out.println("2.coreJava");
     System.out.println("3.Servlet");
     System.out.println("4.JSP");
     System.out.println("5.EJB");
     
     Scanner input = new Scanner(System.in);
     int num = input.nextInt();
     
     switch(num){
		case 1:
		System.out.println( subjectaver[0]);
		break;
		case 2:
		System.out.println( subjectaver[1]);
		break;
		case 3:
		System.out.println(subjectaver[2]);
		break;
		case 4:
		System.out.println(subjectaver[3]);
		break;
		case 5:
		System.out.println(subjectaver[4]);
		break;
		}
     
    
	}

}
