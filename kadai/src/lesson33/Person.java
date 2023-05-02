package lesson33;

class Person {
	public static int count = 0;
	public String name;
	
	public int age;
	public double height, weight;

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Person.count = count;
	}

	public String getName() {
		return name;
	}


	public void setName(String lastName) {
		this.name = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	Person(String name, int age, double height, double weight) {
		Person.count++;
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	
	public void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "です");
	}

	public double bmi() {
		return this.weight / this.height / this.height;
	}

	public static void printCount() {
		System.out.println("合計" + Person.count + "人です");
	}
}