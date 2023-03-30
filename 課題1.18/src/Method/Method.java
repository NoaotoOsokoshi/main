package Method;

import java.util.Random;

public class Method {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// Q1：コンソールに「Hello Java」とコンソールに出力するメソッド（関数）を作成してください。
		hello();

		// Q2：引数として整数を渡すと+1して返すメソッド（関数）を作成してください。
		System.out.println(plusOne(2));

		// Q3：引数として整数を2つ渡すと、その引数2つを乗算した値を返すメソッド（関数）を作成してください。
		System.out.println(sum(3, 4));

		// Q4：引数として小数を2つ渡すと、その引数2つを乗算した値を返すメソッド（関数）を作成してください。
		//     ※ただしメソッド名はQ3のメソッド名と同じにしてください。
		System.out.println(sum(3.5, 4.7));
		// Q5：引数として数字を渡すと、1～100までのランダムな数字を引数の値分格納して返すメソッド（関数）を作成してください。
		int[] array = ramdomNum(6);

		// Q6：Q5で作成した関数を用いて、このメソッド（関数）の引数をQ5のメソッド（関数）の引数に渡して
		//     配列の要素の平均値を返すメソッド（関数）を作成してください。
		ave(array);
	}

	//Q1
	public static void hello() {
		System.out.println("Hello Java");
	}

	//Q2	
	public static int plusOne(int num1) {
		return num1 + 1;
	}

	//Q3
	public static int sum(int num1, int num2) {
		return num1 * num2;
	}

	//Q4
	public static double sum(double num1, double num2) {
		return num1 * num2;
	}

	//Q5
	public static int[] ramdomNum(int num) {
		Random random = new Random();
		int[] value = new int[num];
		for (int i = 0; i < num; i++) {
			value[i] = random.nextInt(101);
			System.out.println(value[i]);
		}
		return value;
	}

	private static void ave(int[] value) {
		int sum = 0;
		double ave;
		for (int i = 0; i < value.length; i++) {
			sum += value[i];
		}
		ave = sum / value.length;
		System.out.println(ave);

	}

}
