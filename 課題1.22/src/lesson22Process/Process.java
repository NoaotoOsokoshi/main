package lesson22Process;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Process {
	static LocalDateTime ldt = LocalDateTime.now();//現在の時間
	static DateTimeFormatter dtformat = DateTimeFormatter.ofPattern("yyyy/MM/dd H:mm:ss");//出力の仕方
	static String nowDate = dtformat.format(ldt);//現在時間を出力
/*
	public String[] str = { "こんにちは！ここは日本です！",
			"この寿司はうまい",
			"寿司は和食です",
			"今の現在日時は" + nowDate + "です"
	};
	*/
	
	String food;
	String jp;
	
	public void hello() {
		str();
		food = "寿司";
		jp= "和食";
		print();
	}

	public void str() {
		food = "";
		jp= "";
	}

	public void print() {
		System.out.println("こんにちは！ここは日本です！");
				System.out.println(getFood());
				System.out.println(getJp());
				System.out.println(getTime());
			
		}
	public String getFood() {
		return "この"+this.food+"はうまい";
	}
	
	public String getJp() {
		return food+"は"+this.jp+"です";
	}
	
	public String getTime() {
		return "今の現在日時は" + nowDate + "です";
	}
}
