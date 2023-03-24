package basicClass;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Animal {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		Dog dog = new Dog();
		dog.DogName();
		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		dog.DogNum(3);
		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		LocalDateTime ldt = LocalDateTime.now();
		DateTimeFormatter dtformat = DateTimeFormatter.ofPattern("yyyy-MM-dd H:m:s");
		String nowDate = dtformat.format(ldt);
		System.out.println(nowDate);

	}

}
