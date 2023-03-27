package animal;
import data.Data;
public class Animal {
/*
 	
 	下記がコンソールに出力されるように作成してください
 	※thisとsetterとgetterとフィールドを使ってください
 	
  	動物名：ライオン
	体長：2.1m
	速度：80km/h
 	
 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
Data data = new Data();
data.setName("ライオン");
data.setSize(2.1);
data.setSpeed(80);
data.imform();
	}

}
