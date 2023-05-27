package lesson32;

class Person {
	private String name;
	private int age;
	private double height;
	private double weight;

	//getter
	public String getName() {
		return name;
	}

	//setter
	public void setName(String name) {
		this.name = name;
	}

	//getter
	public int getAge() {
		return age;
	}

	//setter
	public void setAge(int age) {
		this.age = age;
	}

	//getter
	public double getHeight() {
		return height;
	}

	//setter
	public void setHeight(double height) {
		this.height = height;
	}

	//getter
	public double getWeight() {
		return weight;
	}

	//setter
	public void setWeight(double weight) {
		this.weight = weight;
	}

	static int count = 0;

	// コンストラクタ
	Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		Person.count = count++;
	}

	//bmi 計算
	public double bmi() {
		return this.weight / (this.height * this.height);
	}

	//表示
	public void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "です");
	}

	// メソッド　戻り値　void
	public void printCount() {
		System.out.println("合計" + count + "人です");
	}

}
