package Ex30;

import java.util.Scanner;
import java.util.Stack;

public class StringCalculator {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		str = str.replaceAll("\\s+", ""); // 공백 제거

		Stack<Integer> numbers = new Stack<>();
		Stack<Character> operators = new Stack<>();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				StringBuilder numStr = new StringBuilder();
				while (i < str.length() && (Character.isDigit(str.charAt(i)) || str.charAt(i) == '.')) {
					numStr.append(str.charAt(i));
					i++;
				}
				i--;
				numbers.push(Integer.parseInt(numStr.toString()));
			} else if (ch == '(') {
				operators.push(ch);
			} else if (ch == ')') {
				while (operators.peek() != '(') {
					int val2 = numbers.pop();
					int val1 = numbers.pop();
					char op = operators.pop();
					int result = calculator(val1, val2, op);
					numbers.push(result);
				}
				operators.pop(); // '(' 제거
			} else if (isOperator(ch)) {
				while (!operators.isEmpty() && precedence(operators.peek()) >= precedence(ch)) {
					int val2 = numbers.pop();
					int val1 = numbers.pop();
					char op = operators.pop();
					int result = calculator(val1, val2, op);
					numbers.push(result);
				}
				operators.push(ch);
			}
		}

		while (!operators.isEmpty()) {
			int val2 = numbers.pop();
			int val1 = numbers.pop();
			char op = operators.pop();
			int result = calculator(val1, val2, op);
			numbers.push(result);
		}

		int result = numbers.pop();
		System.out.println(result);
		sc.close();
	}

	// 연산자 타입
	public static boolean isOperator(char ch) {
		return ch == '+' || ch == '-' || ch == '*' || ch == '/';
	}

	// 우선 순위
	public static int precedence(char op) {
		if (op == '+' || op == '-')         return 1;
		else if (op == '*' || op == '/')      return 2;
		return 0;
	}

	// 계산 함수
	public static int calculator(int a, int b, char op) {
		switch (op) {
		case '+':        return a + b;
		case '-':        return a - b;
		case '*':       return a * b;
		case '/':
			if (b == 0) {
				throw new ArithmeticException("Division by zero");
			}
			return a / b;
		default:
			throw new IllegalArgumentException("Unknown operator: " + op);
		}
	}

}