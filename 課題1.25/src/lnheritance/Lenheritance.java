package lnheritance;

import data.Data;
/**
 * @author user
 *
 */
public class Lenheritance {
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
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Data data = new Data();
		data.setName("獺越");
		data.status();

	}

}
