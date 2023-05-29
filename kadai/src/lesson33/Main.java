package lesson33;

public class Main {

	public static void main(String[] args) {
		// インストラクタ
		Person person1 = new Person("鈴木", "太郎", 20, 1.7, 60.0);
		person1.print();
		
		// インストラクタ
		Person person2 = new Person("山田", "花子", 22, 1.5, 40.0);
		person2.print();

		
		Person.printCount();

	}
}