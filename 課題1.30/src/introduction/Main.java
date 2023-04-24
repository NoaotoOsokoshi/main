package introduction;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
		Person person2 = new Person("山田花子", 22, 1.5, 40);

		System.out.println(person1.name);
		System.out.println(person1.age);
		System.out.println(person1.height);

		Car car = new Car();
		Bicycle bicycle = new Bicycle();

		//owener 設定
		//car person1
		car.setOwner(person1.name);
		//bicycle person2
		bicycle.setOwner(person2.name);

		System.out.println(car.getOwner());
		System.out.println(bicycle.getOwner());

	}

}
