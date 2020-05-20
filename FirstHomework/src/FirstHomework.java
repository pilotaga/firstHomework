import java.util.Scanner;

public class FirstHomework {

    public static void main(String[] args) {
	byte b = 5;
	short s = 32000;
	int i = -20;
	long l = 2020L;
	float f = 12.23f;
	double d = 32.32d;
	char c = 90;
	boolean bool = false;
	int in = 2;
	double doub = Exp(in, i, b, s);
	Scanner sc = new Scanner(System.in);

	//System.out.println("Expression equals" + doub);
	//System.out.println("Enter two integer numbers");
	//int x = sc.nextInt();
	//int y = sc.nextInt();
	//System.out.println(checkSum(x,y));
	//System.out.println("Enter integer number to check if its positive or negative");
	//int z = sc.nextInt();
	//checkNum(z);
	//String str;
	System.out.println("Enter a year");
	short y = sc.nextShort();
	leapYear(y);


    }

    public static double Exp(int a,int b, int c, int d){
        return a*(b+ ((float)c)/d);
    }

    public static boolean checkSum(int x, int y){
    	if((x+y)>=10&&(x+y)<=20)
    		return true;
    	else return false;
	}

	public static void checkNum(int x){
		if(x>=0) System.out.println("Number is positive");
		else System.out.println("Number is negative");
	}

	public static boolean checkNum1(int x){
		if(x>=0) return false;
		else return true;
	}

	public static void helloName(String s){
    	System.out.println("Hello, " + s + "!");
	}

	public static void leapYear(short y){
    	if((y%4)==0){
    		if(y%100==0){
    			if(y%400==0){
    				System.out.println("Year is leap");
				} else System.out.println("Year is not leap");
			} else System.out.println("Year is leap");
		}
	}

}
