package introduction;

public class Person {
	// インスタンスフィールドを定義
	String name;
	int age;
	double height;
	double weight;
	double BMI;

	// コンストラクタを定義しインスタンスフィールドに値をセット
	Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		print();
	}

	//メソッドbmi 戻り値:double
	public double bmi() {

		//BMI 計算　体重/(身長)/(身長)
		double BMI = weight / height / height;
		//戻り値
		return this.BMI = BMI;
	}

	//表示
	public void print() {
		bmi();
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "です");
		System.out.println("BMIは" + String.format("%.1f", this.BMI) + "です");
	}

	//インスタンスメソッド　buy 引数　car
	public void buy(Car car) {
		car.setOwner(this.name);
		System.out.println(car.getOwner()+"が購入しました");
	}

	//インスタンスメソッド　buy 引数　bicycle
	public void buy(Bicycle bicycle) {
		bicycle.setOwner(this.name);
		System.out.println(bicycle.getOwner()+"が購入しました");
	}
}
