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

	public void status() {
		System.out.println("こんにちは「" + this.name + "」さん");
		System.out.println("ステータス");
		statusMp status = new statusDefence();
	}
}

//super
class statusHp {
	int value;

	public statusHp() {
		Random random = new Random();
		value = random.nextInt(1000);
		System.out.println("HP:" + value);

	}
}

//sub
class statusMp extends statusHp {

	public statusMp() {
		Random random = new Random();
		value = random.nextInt(1000);
		System.out.println("MP:" + value);
	}
}

class statusAttack extends statusMp {
	public statusAttack() {
		Random random = new Random();
		value = random.nextInt(1000);
		System.out.println("攻撃力:" + value);
	}
}

class statusSpeed extends statusAttack {
	public statusSpeed() {
		Random random = new Random();
		value = random.nextInt(1000);
		System.out.println("素早さ:" + value);
	}
}

class statusDefence extends statusSpeed {
	public statusDefence() {
		Random random = new Random();
		value = random.nextInt(1000);
		System.out.println("防御力:" + value);
		System.out.println("");
		System.out.println("さあ冒険に出かけよう！");
	}
}
