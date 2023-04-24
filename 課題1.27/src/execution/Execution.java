package execution;

import java.util.Scanner;

import data.Data;

public class Execution {
	/*
	 
	コンソールに下記が入力されたときにコンソール出力結果がコンソールに表示されるように作ってください
	ライオン:2.1:80,ゾウ:3.2:40,パンダ:1.9:30,チンパンジー:0.94:25,シマウマ:2.4:65,インコ:0.1:50
	
	コンソール出力結果
	
	コンソールに文字を入力してください
	動物名：ライオン
	体長：2.1m
	速度：80km/h
	学名：パンテラ レオ
	
	動物名：ゾウ
	体長：3.2m
	速度：40km/h
	学名：ロキソドンタ・サイクロティス
	
	動物名：パンダ
	体長：1.9m
	速度：30km/h
	学名：アイルロポダ・メラノレウカ
	
	動物名：チンパンジー
	体長：0.94m
	速度：25km/h
	学名：パン・トゥログロディテス
	
	動物名：シマウマ
	体長：2.4m
	速度：65km/h
	学名：チャップマンシマウマ
	
	動物名：インコ
	体長：0.1m
	速度：50km/h
	学名：不明
	
	
	*/
	public static void main(String[] args) {
		//　コンソールから獲得
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();

		//　個体ごとのデータ ","で区切る
		String[] aniData = line.split(",");

		//　名前、体長、速度に分ける
		String[] name = new String[aniData.length];
		double[] size = new double[aniData.length];
		int[] speed = new int[aniData.length];
		
		//　　":"で区切る
		for (int i = 0; i < aniData.length; i++) {
			String[] animal = aniData[i].split(":");

			name[i] = animal[0];
			size[i] = Double.parseDouble(animal[1]);
			speed[i] = Integer.parseInt(animal[2]);

			/*　確認
			System.out.println(name[i]);
			System.out.println(size[i]);
			System.out.println(speed[i]);
			*/
		}
		//　学名
		String[] scName = new String[6];
		scName[0] = "パンテラ レオ";
		scName[1] = "ロキソドンタ・サイクロティス";
		scName[2] = "アイルロポダ・メラノレウカ";
		scName[3] = "パン・トゥログロディテス";
		scName[4] = "チャップマンシマウマ";
		scName[5] = "不明";

		//　インスタンス
		Data data = new Data();
		data.setName(name);
		data.setSize(size);
		data.setSpeed(speed);
		data.setScName(scName);

		data.result();

	}

}
