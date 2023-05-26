package lesson30;

public class Person {
	// インスタンスフィールドを定義
	String name;
	int age;
	double height;
	double weight;
	double BMI;
	
	static int count;

	// コンストラクタを定義しインスタンスフィールドに値をセット
	Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		Person.count = count+1; 
		print();
		System.out.println("合計"+count+"人です");
	}

	
	
	// メソッドbmi 戻り値:double
	public double bmi() {

		// BMI 計算　体重/(身長)/(身長)
		double BMI = weight / height / height;
		// 戻り値
		return this.BMI = BMI;
	}

	// メッソド　戻り値:void
	public void print() {
		bmi();
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "です");
		System.out.println("BMIは" + String.format("%.1f", this.BMI) + "です");
	}
}

