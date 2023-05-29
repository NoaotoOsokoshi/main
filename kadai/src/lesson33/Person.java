package lesson33;

class Person {
	public static int count = 0;
	public String firstName;
	public int age;
	public double height, weight;
	// 問１　lastName 追加
	public String lastName;

	Person(String firstName, String lastName, int age, double height, double weight) {
		// 問3　追加
		Person.count++;
		this.firstName = firstName;
		// 問２ コンストラクタに追加
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	public String fullName() {
		return this.firstName + this.lastName;
	}

	public void print() {
		System.out.println("名前は" + this.fullName() + "です");
		System.out.println("年は" + this.age + "です");
	}

	public double bmi() {
		return this.weight / this.height / this.height;
	}

	public static void printCount() {
		System.out.println("合計" + Person.count + "人です");
	}
}