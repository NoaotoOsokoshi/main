package lesson15;

public class multidimensionalArray {
	/*
	①配列int test[][]に以下の成績を格納し、表示してください。
		出力結果：生徒1：国語64点、数学73点、英語69点
				  生徒2：国語58点、数学81点、英語75点
				  生徒3：国語86点、数学68点、英語79点
				  生徒4：国語72点、数学55点、英語80点
		
	②それぞれの教科の平均点を表示してください。
		出力結果：国語の平均点は○○点です。
				  数学の平均点は○○点です。
				  英語の平均点は○○点です。
	*/

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[][] test = new int[4][3];

		//生徒1
		test[0][0] = 64;
		test[0][1] = 73;
		test[0][2] = 69;
		//生徒2
		test[1][0] = 58;
		test[1][1] = 81;
		test[1][2] = 75;
		//生徒3
		test[2][0] = 86;
		test[2][1] = 68;
		test[2][2] = 79;
		//生徒4
		test[3][0] = 72;
		test[3][1] = 55;
		test[3][2] = 80;

		for (int i = 0; i < 4; i++) {
			int j = i + 1;
			System.out.println("生徒" + j + ":国語" + test[i][0] + "点、数学" + test[i][1] + "点、英語" + test[i][2] + "点");
		}
		//国語の合計
		int sum = 0;
		for (int i = 0; i < 4; i++) {
			sum += test[i][0];
		}

		System.out.println("国語の平均点は" + sum / 4 + "点です。");

		//数学の合計
		sum = 0;
		for (int i = 0; i < 4; i++) {
			sum += test[i][1];
		}

		System.out.println("数学の平均点は" + sum / 4 + "点です。");

		//英語の合計
		sum = 0;
		for (int i = 0; i < 4; i++) {
			sum += test[i][2];
		}

		System.out.println("英語の平均点は" + sum / 4 + "点です。");
	}

}
