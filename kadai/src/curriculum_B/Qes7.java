package curriculum_B;

import java.util.Scanner;

public class Qes7 {

	/*
	 * 7										
		N人の生徒の成績を管理するプログラムを下記条件で作成してください									
		・N人の生徒の成績を入力できるようにしてください 入力値は上から英語・数学・理科・社会の点数としてください									
		・各生徒の科目平均点、全体の科目平均点、そして各教科の平均点を出力してください									
		・このプログラムの実行は必ず1回以上行われるようにしてください									
		・出力例を参考にプログラミングを作成してください									
											
		入力・出力例									
		生徒の人数を入力してください（2以上）: 2									
		1人目の『英語』の点数を入力してください :10									
		1人目の『数学』の点数を入力してください :10									
		1人目の『理科』の点数を入力してください :10									
		1人目の『社会』の点数を入力してください :10									
											
		2人目の『英語』の点数を入力してください :10									
		2人目の『数学』の点数を入力してください :10									
		2人目の『理科』の点数を入力してください :10									
		2人目の『社会』の点数を入力してください :10									
											
		1人目の平均点は10.00点です。									
		2人目の平均点は10.00点です。									
											
		英語の平均点は10.00点です。									
		数学の平均点は10.00点です。									
		理科の平均点は10.00点です。									
		社会の平均点は10.00点です。									
		全体の平均点は10.00点です。									
	
	 */

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// コンソールから人数を獲得
		Scanner scanner = new Scanner(System.in);

		System.out.print("生徒の人数を入力してください（2以上）:");
		int num = scanner.nextInt();

		// 科目を格納
		String[] subject = new String[4];
		subject[0] = "英語";
		subject[1] = "数学";
		subject[2] = "理科";
		subject[3] = "社会";

		// 人数と点数を格納するための多次元配列
		int[][] people;
		people = new int[num][];

		for (int i = 0; i < num; i++) {
			people[i] = new int[4];
		}

		//　各科目の点数を格納
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print((i + 1) + "人目の『" + subject[j] + "』の点数を入力してください :");
				Scanner scanner2 = new Scanner(System.in);
				people[i][j] = scanner2.nextInt();

			}
			System.out.println("");
		}

		// 生徒別の平均
		for (int i = 0; i < num; i++) {
			// ループごとに合計（sum）を初期化
			double sum = 0;
			for (int j = 0; j < 4; j++) {
				sum += people[i][j];
			}
			System.out.println((i+1)+"人目の平均点は"+(String.format("%.2f", sum/4)) +"点です。");
		}
		
		
		
		//　科目ごとの平均
		// sumAll 全科目の合計
		int sumAll = 0;
		
		for (int i = 0; i < 4; i++) {
			// ループごとに合計（sumSub）を初期化
			double sumSub = 0;
			for (int j = 0; j < num; j++) {
				sumSub += people[j][i];
			}
			sumAll += sumSub;
			System.out.println(subject[i] +"の平均点は"+(String.format("%.2f",sumSub/num)) +"点です。");
		}
		
		
	}

}
