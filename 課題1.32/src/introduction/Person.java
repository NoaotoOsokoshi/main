package introduction;

class Person {
	public String name;
	public int age;
	public double height;
	public double weight;

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

	//クラスフィールド
	int count;

	//コンストラクタ
	Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		count = count+1; 
	}

	//bmi 計算
	public double bmi() {
		return this.weight / this.height / this.height;
	}

	//表示
	public void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "です");
	}
	
	public void printCount() {
		System.out.println("合計"+count+"人です");
	}

	
	
}
