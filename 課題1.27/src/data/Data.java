package data;

public class Data {
	protected String[] name;
	protected double[] size;
	protected int[] speed;
	protected String[] scientificName;

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

	public String[] getScientificName() {
		return scientificName;
	}

	public void setScientificName(String[] scientificName) {
		this.scientificName = scientificName;
	}

}

class Name extends Data {
	int i;

	public void animalName(int i) {
		System.out.println("動物名：" + name[i]);
	}
}

class Size extends Name {
	public void animalSize(int i) {
		System.out.println("体長：" + size[i] + "");
	}
}

class Speed extends Size {
	public void animalSpeed(int i) {
		System.out.println("時速" + speed[i] + "km/h");
	}
}

class ScientificName extends Speed{
	public void animalScientificName(int i) {
		System.out.println("学名" + scientificName[i]);
	}
}
