package curriculum_B;

import java.util.Scanner;

public class Qes1_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*
		 * 1										
			ログイン時の入力チェックシステムを下記条件で作成してください
			・コンソールにユーザー名を入力できるようにしてください
			・ユーザー名の文字数が10文字より大きい場合「名前を10文字以内にしてください」と出力してください
			・ユーザー名の文字数が0文字以下もしくはnullの場合「名前を入力してください」と出力してください
			・ユーザー名が正常な値だった場合「ユーザー名「 入力したユーザー名 」を登録しました」と出力してください
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
		}else {
			System.out.println("「ユーザー名「 "+ user + "」を登録しました」");
		}
	}

}
