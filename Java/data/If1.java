import java.util.Scanner;


public class If1 {

	public static void main(String[] args) {
		// 계산기
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 입력: ");
		int firstInt = scan.nextInt();
		System.out.print("숫자 입력: ");
		int secondInt = scan.nextInt();
		System.out.print("연산 부호 + - * / 입력: ");
		char giho =scan.next().charAt(0);
		if(giho == '+') {
			System.out.println(firstInt + secondInt);
			
		}
		else if(giho =='-') {
			System.out.println(firstInt - secondInt);
			
		}
		else if(giho == '*') {
			System.out.println(firstInt * secondInt);
		}
		else if(giho == '/') {
			System.out.println(firstInt / secondInt);
		}
		else {
			System.out.println("부정확한 입력입니다");
		}

	}

}
