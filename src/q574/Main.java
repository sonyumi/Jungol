package q574;

import java.util.Scanner;

public class Main {
	
	//1.
//	public static int ret(int p[]) {
//		int max = 0;
//		if(n1>n2) {
//			if(n1>n3) {
//				max = n1;
//			} else {
//				max = n3;
//			}
//		}else {
//			if(n2>n3) {
//				max = n2;
//			} else {
//				max=n3;
//			}
//		}
//		return max;
//	}
	
	//2 static 제거
//	public int ret(int[] iArr) {
//		
//		return max
//	}
//	public static void main(String[] args) {
//		main m = new main();
//	}
	
	//3 배열
	
	public int maxRet(int[] iArr) {
		int max=Integer.MIN_VALUE;
		
		return 0;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Function fx = new Function();
		int n = sc.nextInt();
		int m = sc.nextInt();
		int o = sc.nextInt();
		sc.close();
		fx.setiArr(n, m, o);
		System.out.print(fx.getMax());
	}
	
//	class MaxCalcu {
//		   private int[] maxarr;
//
//		   //Set
//		   void setMaxarr(int[] maxarr) {
//		      this.maxarr = maxarr;
//		   }
//
//		   //Run
//		   void print() {
//		      int max = Integer.MIN_VALUE;
//		      for (int i = 0; i < maxarr.length; i++) {
//		         max = (max < maxarr[i]) ? maxarr[i] : max;
//		      }
//		      System.out.println(max);
//		   }
//		}
//
//		public class Main {
//
//		   public static void main(String[] args) {
//		      Scanner sc = new Scanner(System.in);
//		      int[] arr = new int[3];
//
//		      for (int i = 0; i < arr.length; i++) {
//		         arr[i] = sc.nextInt();
//		      }
//		      sc.close();
//
//		      MaxCalcu max = new MaxCalcu();
//
//		      max.setMaxarr(arr);
//		      max.print();
//		   }
//
//		}
	
	//2
//	
//	public class Main2 {
//		   
//		   static void maxCalcu(int[] arr) {
//		      int max = Integer.MIN_VALUE;
//		      for (int i = 0; i < arr.length; i++) {
//		         max = (max < arr[i]) ? arr[i] : max;
//		      }
//		      System.out.println(max);
//		   }
//
//		   public static void main(String[] args) {
//		      Scanner sc = new Scanner(System.in);
//		      int[] arr = new int[3];
//
//		      for (int i = 0; i < arr.length; i++) {
//		         arr[i] = sc.nextInt();
//		      }sc.close();
//		      
//		      maxCalcu(arr);
//		   }
//		}
}afsfsda
