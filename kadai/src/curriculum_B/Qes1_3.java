package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes1_3 {

	public static void main(String[] args) {

		/*
		 * 1
		 * ログイン時の入力チェックシステムを下記条件で作成してください
		 * ・コンソールにユーザー名を入力できるようにしてください
		 * ・ユーザー名の文字数が10文字より大きい場合「名前を10文字以内にしてください」と出力してください
		 * ・ユーザー名の文字数が0文字以下もしくはnullの場合「名前を入力してください」と出力してください
		 * ・ユーザー名が正常な値だった場合「ユーザー名「 入力したユーザー名 」を登録しました」と出力してください
		 */
		// コンソールからユーザー名を獲得
		Scanner scanner = new Scanner(System.in);
		String user = scanner.nextLine();

		// 10文字より多いの場合
		if (user.length() > 10) {
			System.out.println("「名前を10文字以内にしてください」");

			// ユーザー名の文字数が0文字以下もしくはnullの場合
		} else if (user.length() <= 0 || user == null) {
			System.out.println("「名前を入力してください」");

			// それ以外（正常な値）
		} else {
			System.out.println("「ユーザー名「 " + user + "」を登録しました」");
			Janken(user);
		}

	}

	// メソッド　じゃんけん
	public static void Janken(String user) {

		//じゃんけん
		String[] janken = new String[3];
		janken[0] = "グー";
		janken[1] = "チョキ";
		janken[2] = "パー";

		int num = 0;
		int num2 = 0;

		while (true) {
			// じゃんけん　ユーザー
			Random random = new Random();
			int janUser = random.nextInt(3);

			// じゃんけん　PC 
			Random random2 = new Random();
			int janPc = random2.nextInt(3);

			//回数
			num2++;

			System.out.println(user + "の手は「" + janken[janUser] + "」");
			System.out.println("相手の手は「" + janken[janPc] + "」");
			System.out.println("");

			// グーで負け
			if (janUser == 0 && janPc == 2) {
				System.out.println("俺の勝ち！");
				System.out.println("負けは次につながるチャンスです！");
				System.out.println("ネバーギブアップ！");
				System.out.println("");

				// チョキで負け
			} else if (janUser == 1 && janPc == 0) {
				System.out.println("俺の勝ち！");
				System.out.println("たかがじゃんけん、そう思ってないですか？");
				System.out.println("それやったら次も、俺が勝ちますよ");
				System.out.println("");

				//パーで負け
			} else if (janUser == 2 && janPc == 1) {
				System.out.println("俺の勝ち！");
				System.out.println("なんで負けたか、明日まで考えといてください。");
				System.out.println("そしたら何かが見えてくるはずです");
				System.out.println("");

				//あいこ
			} else if (janUser == janPc) {
				System.out.println("DRAW あいこ もう一回しましょう！");
				System.out.println("");

				//それ以外（勝った場合）
			} else {
				//ループ終了
				System.out.println("やるやん");
				System.out.println("次は俺にリベンジさせて");
				System.out.println("");

				System.out.println("勝つまでにかかった合計回数は" + num2 + "回です");
				break;

			}
		}
	}

}
