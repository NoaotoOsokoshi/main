package test;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		LocalDateTime today= LocalDateTime.now();
		int thisYear = today.getYear();
		
		int bornYear = getBornYear(thisYear);
		
		int Age = Calc(bornYear,thisYear);
			
		System.out.printf("%s年生まれのあなたは今年[%d年]、%d歳になる年です%n", bornYear,thisYear,Age);
		System.out.printf("(正常終了)");
	}
	public static int getBornYear(int thisYear) {
		Scanner stdin = new Scanner(System.in);
		int bornYear; 
		
		while (true) {
			try {
				System.out.println("あなたの生まれた西暦の入力");
				bornYear=stdin.nextInt();
				if(bornYear < 1900) {
					System.out.println("西暦は1900年から今年までの範囲で入力してください");
					continue; 
				}else {
					break; 
				}
			} catch (Exception e) {
				System.out.println("西暦は整数で入力して下さい");
				stdin.next();
			}
		}
		return bornYear;
	}
	
	public static int Calc(int bornYear,int thisYear) {
		
		return thisYear - bornYear;
	}
	

}

	

}
