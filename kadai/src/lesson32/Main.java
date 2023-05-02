package lesson32;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
		person1.print();

		Person person2 = new Person("山田花子", 22, 1.5, 40);
		person2.print();
		
		System.out.println("合計"+Person.count+"人です");
		person1.printCount();
	}

	
}
