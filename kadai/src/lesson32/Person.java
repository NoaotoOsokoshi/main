package lesson32;

class Person {
	public String name;
	public int age;
	public double height;
	public double weight;
	// count　定義　int 初期値:0
	static int count = 0;

	// コンストラクタ
	Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		// count 処理ごとにプラス1
		count++;
	}

	// bmi 計算
	public double bmi() {
		return this.weight / (this.height * this.height);
	}

	// 表示
	public void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "です");
	}

	// クラスメソッド　戻り値　void
	public static void printCount() {
		System.out.println("合計" + count + "人です");
	}

}
