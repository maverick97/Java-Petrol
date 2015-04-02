import java.util.Scanner;
public class Benzin{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double cost;
		int v;
		int i;
		double dp = 19.5;
		int dv = 19;
		double diz = 20.5;
		System.out.println("Каким топливом, вы хотите заправиться?/Дизель: 99");
		if(sc.hasNextInt()) {  
          i = sc.nextInt();  
		  switch(i){
			  case 95:
			  System.out.println("Какой объем?");
			  v=sc.nextInt();
			  cost=v*dp;
			  System.out.print("С вас: ");
			  System.out.println(cost+"грн.");
			  break;
			  case 92:
			  System.out.println("Какой объем?");
			  v=sc.nextInt();
			  cost=v*dv;
			  System.out.print("С вас: ");
			  System.out.println(cost+"грн.");
			  break;
			  case 99:
			  System.out.println("Какой объем?");
			  v=sc.nextInt();
			  cost=v*diz;
			  System.out.print("С вас: ");
			  System.out.println(cost+"грн.");
			  break;
		  }
          
		  } else {
          System.out.println("");
		
	}
	}
}
