import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class T200309 {

	public static void main7(String[] args) {
		//数一下 1到 100 的所有整数中出现多少个数字9
		int i = 1;
		int sum = 0;
		for(i = 1; i <= 100; i++) {
			if(i/10 == 9) {//十位
				sum += 1;
			}//else if(i%10 == 9)则为有多少个数字包含9
			if(i%10 == 9) {//个数
				sum += 1;
			}
		}
		System.out.println(sum);
	}

	public static void main6(String[] args) {
		//计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值。
		double sum = 0;
		int flg = 1;
		for(int i = 1; i <= 100; i++) {
			sum = sum + 1.0/i +flg;
			flg = -flg;
		}
		System.out.println(sum);//5.18...
	}

	public static void main5(String[] args) {
		//求两个正整数的最大公约数
		Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();//18
        int num2 = sc.nextInt();//24
        int num3 = num1%num2;//18%24 = 6
        //辗转相除法
        while(num3 != 0) {
        	num1 = num2;//24  18
        	num2 = num3;//18   6
        	num3 = num1 % num2;//6   0
        }
        System.out.println(num2);//6
	}

	public static void main4(String[] args) {
		//输出乘法口诀表
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		int i = 1;
		int j = 1;
		for(i = 1; i <= n; i++) {
			for(j = 1; j <= i; j++) {
			    System.out.print(i + "*" + j + "=" + i*j + " ");
			}
			System.out.println();
		}
	}

	public static void main3(String[] args) {
		//输出1000——2000的闰年
		int i = 1000;
		for(i = 1000; i <= 2000; i++) {
			if(((i%4 == 0) && (i%100 != 0)) || (i%400 == 0)) {
				System.out.print(i + " ");
			}
		}
	}

	public static void main2(String[] args) {
		//打印1——100的素数
		int j = 1;
		for(j = 1; j <= 100; j++) {
			int i = 2;
            for(i = 2; i <= Math.sqrt(j); i++) {
        	    if(j % i == 0) {
        		    break;
        	    }
            }
            if(i > Math.sqrt(j)) {
        	    System.out.print(j + " ");
            }
	    }
    }

	public static void main1(String[] args) {
		//判断一个数是否为素数
		Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 2;
        for(i = 2; i <= Math.sqrt(num); i++) {//最优化方式(根号num)
        //for(i = 2; i <= num/2; i++) 
        //for(i = 2; i <= num; i++) 
        	if(num % i == 0) {
        		break;
        	}
        }
        if(i > Math.sqrt(num)) {
        	System.out.println(num + "是素数");
        }else {
        	System.out.println(num + "不是素数");
        }
	}
}