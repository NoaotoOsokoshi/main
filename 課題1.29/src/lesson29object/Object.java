package lesson29object;

import java.util.Scanner;

import lesson29process.Process;

public class Object {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String[] place = new String[11];
		place[0] = "北海道:札幌市:83424";
		place[1] = "青森県:青森市:9646";
		place[2] = "岩手県:盛岡市:15275";
		place[3] = "宮城県:仙台市:7282";
		place[4] = "秋田県:秋田市:11638";
		place[5] = "山形県:山形市:9323";
		place[6] = "福島県:福島市:13784";
		place[7] = "茨城県:水戸市:6097";
		place[8] = "栃木県:宇都宮市:6408";
		place[9] = "群馬県:前橋市:6362";
		place[10] = "埼玉県:さいたま市:3798";

		//コンソールから獲得
		Scanner scanner = new Scanner(System.in);
		String[] str = new String[3];
		str[0] = scanner.nextLine();
		str[1] = scanner.nextLine();
		str[2] = scanner.nextLine();

		int[] num = new int[3];
		//int[]に変換
		for (int i = 0; i < 3; i++) {
			num[i] = Integer.parseInt(str[i]);
			
			//確認
			//System.out.println(num[i]);
		}

		Process process = new Process();
		process.setPlace(place);
		process.setNum(num);
		process.result();
	}

}
