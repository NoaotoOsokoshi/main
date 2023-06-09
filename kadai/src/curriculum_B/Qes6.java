package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {

	/*
	 * 	入力した商品の残り台数が出力されるシステムを下記の条件で作成してください
	 * ・拡張for文・Switch文・条件演算子を使用すること　※普通のif文は使用不可	
	 * ・Switch文内でテレビとディスプレイは続けて書くようにしてください、条件演算子で出力される値を変更してください	
	 * ・例：テレビorディスプレイと受け取った場合〇〇に受け取った値が入る→「〇〇の残り台数は9台です」
	 * ・入力される値は右記の表のどれかが入力され、入力回数の縛りはありません
	 * ・入力された値は「、」区切りで指定してください							                        パソコン
	 * ・そのほかの値が入力された場合下記を出力されるようにしてください							        冷蔵庫
	 * 『受け取った値』は指定の商品ではありません								                        扇風機
	 * ・残り台数は0〜11までのランダムな値が出力されるようにしてください							    洗濯機
	 * 									                                                                加湿器
	 * 入力例↓↓									                                                    テレビ
	 * パソコン、冷蔵庫、扇風機、洗濯機、加湿器、テレビ、ディスプレイ、その他商品						ディスプレイ
	 * 
	 * 出力例↓↓
	 * パソコンの残り台数は8台です
	 * 冷蔵庫の残り台数は7台です
	 * 扇風機の残り台数は7台です
	 * 洗濯機の残り台数は10台です
	 * 加湿器の残り台数は3台です
	 * テレビの残り台数は9台です
	 * ディスプレイの残り台数は2台です
	 * 『 その他商品 』は指定の商品ではありません									
	 */
	public static void main(String[] args) {
		// コンソールから獲得 
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();

		// ","で区切る
		String[] item = line.split("、");

		// for文　itemに格納したものを出す
		for (int i = 0; i < item.length; i++) {
			Random random = new Random();
			int num = random.nextInt(12);
			switch (item[i]) {
			// パソコンの場合
			case "パソコン":
				// 冷蔵庫の場合
			case "冷蔵庫":
				// 扇風機の場合
			case "扇風機":
				// 洗濯機の場合
			case "洗濯機":
				// 加湿器の場合
			case "加湿器":
				System.out.println(item[i] + "の残り台数は" + num + "台です");
				break;

			// テレビの場合
			case "テレビ":
			case "ディスプレイ":
				String td = (item[i] == "テレビ") ? item[i] + "の残り台数は" + num + "台です"
						: item[i] + "の残り台数は" + num + "台です";
				System.out.println(td);
				break;

			// その他	
			default:
				System.out.println("『" + item[i] + "』は指定の商品ではありません");
				break;
			}
		}

	}

}
