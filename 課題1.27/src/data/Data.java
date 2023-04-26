package data;

public class Data {
	protected static String[] name;
	protected static double[] size;
	protected static int[] speed;
	protected static String[] scName;

	//　getter name
	public String[] getName() {
		return name;
	}

	//　setter name
	public void setName(String[] name) {
		this.name = name;
	}

	//　getter size
	public double[] getSize() {
		return size;
	}

	//　setter size
	public void setSize(double[] size) {
		this.size = size;
	}

	//　getter speed
	public int[] getSpeed() {
		return speed;
	}

	//　setter speed
	public void setSpeed(int[] speed) {
		this.speed = speed;
	}

	//　getter scientificName
	public String[] getScName() {
		return scName;
	}

	//　setter scientificName
	public void setScName(String[] scientificName) {
		this.scName = scientificName;
	}

	public void result() {
		System.out.println("コンソールに文字を入力してください");
		//　インストラクタ
		Animal animal = new Animal();
		animal.ani();
	}
}

//　継承　サブ
class Animal extends Data {
	String[] name = Data.name;
	double[] size = Data.size;
	int[] speed = Data.speed;
	String[] scName = Data.scName;

	//処理
	public void ani() {

		//　size speed string型に変換
		String strSize = String.valueOf(size);
		String strSpeed = String.valueOf(speed);

		//　nullチェック
		if (name != null && strSize != null && strSpeed != null) {
			for (int i = 0; i < 6; i++) {
				System.out.println("動物名:" + name[i]);
				System.out.println("体長:" + size[i] + "m");
				System.out.println("時速:" + speed[i] + "km/h");
				switch (name[i]) {
				//name ライオンの場合
				case "ライオン":
					System.out.println("学名:" + scName[0]);
					break;

				//name ゾウの場合
				case "ゾウ":
					System.out.println("学名:" + scName[1]);
					break;

				//name パンダの場合
				case "パンダ":
					System.out.println("学名:" + scName[2]);
					break;

				//name チンパンジーの場合
				case "チンパンジー":
					System.out.println("学名:" + scName[3]);
					break;

				//name シマウマの場合
				case "シマウマ":
					System.out.println("学名:" + scName[4]);
					break;

				//name インコの場合
				case "インコ":
					System.out.println("学名:" + scName[5]);
					break;
				}
				System.out.println("");
			}
		} else {
			System.out.println("エラー");
		}
	}

}
