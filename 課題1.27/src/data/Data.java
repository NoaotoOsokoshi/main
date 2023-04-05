package data;

public class Data {
	protected static String[] name;
	protected static double[] size;
	protected static int[] speed;
	protected static String[] scName;

	public String[] getName() {
		return name;
	}

	public void setName(String[] name) {
		this.name = name;
	}

	public double[] getSize() {
		return size;
	}

	public void setSize(double[] size) {
		this.size = size;
	}

	public int[] getSpeed() {
		return speed;
	}

	public void setSpeed(int[] speed) {
		this.speed = speed;
	}

	public String[] getScName() {
		return scName;
	}

	public void setScName(String[] scientificName) {
		this.scName = scientificName;
	}

	public void result() {
		System.out.println("コンソールに文字を入力してください");
		Animal animal = new Animal();
		animal.ani();
	}
}

class Animal extends Data {
	String[] name = Data.name;
	double[] size = Data.size;
	int[] speed = Data.speed;
	String[] scName = Data.scName;

	public void ani() {
		String strSize = String.valueOf(size);
		String strSpeed = String.valueOf(speed);
		if (name != null && strSize != null && strSpeed != null) {
			for (int i = 0; i < 6; i++) {
				System.out.println("動物名:" + name[i]);
				System.out.println("体長:" + size[i] + "m");
				System.out.println("時速:" + speed[i] + "km/h");
				System.out.println("学名:" + scName[i]);
				System.out.println("");
			}
		} else {
			System.out.println("エラー");
		}
	}

}
