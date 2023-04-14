package data;

import java.util.Random;

/*

名前を入力したら下記がコンソールに出力されるように作ってください
	条件：数値は毎回変わるように作ってください
	 	 サブクラスを使用してください
	 	 メソッドのオーバーライドを使用してください
		 superクラスを使用してください
		 getterとsetterを使用してください
		 packageを2つ作ってメインと処理を分けてください
		 命名する場合は規則にのっとってください
		 コンストラクタを使用してください

	こんにちは 「 名前 」 さん
	ステータス
	HP：849
	MP：862
	攻撃力：375
	素早さ：937
	防御力：24

	さあ冒険に出かけよう！

*/
public class Data {
	private String name;

	//getter
	public String getName() {
		return name;
	}

	//setter
	public void setName(String name) {
		this.name = name;
	}

	//出力
	public void status() {
		System.out.println("こんにちは「" + this.name + "」さん");
		System.out.println("ステータス");
		//インストラクタ
		Status status = new Status();
	}
	
}

//super

class Value {
	static int[] value = new int[5];

	public static int[] ramValue() {
		for (int i = 0; i < 5; i++) {
			Random random = new Random();
			value[i] = random.nextInt(1000);
		}
		return value;
	}
}
//sub
class Status extends Value {
	//コンストラクタ
	
	public Status() {
		ramValue();
		System.out.println("HP:" + value[0]);
		System.out.println("MP:" + value[1]);
		System.out.println("攻撃力:" + value[2]);
		System.out.println("素早さ:" + value[3]);
		System.out.println("防御力:" + value[4]);
		System.out.println("");
		System.out.println("さあ冒険に出かけよう！");
	}
}

