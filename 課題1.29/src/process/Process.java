package process;

import java.util.Arrays;

public class Process {
	static String[] place;
	static int[] num;

	public int[] getNum() {
		return num;
	}

	public void setNum(int[] num) {
		this.num = num;
	}

	public String[] getPlace() {
		return place;
	}

	public void setPlace(String[] place) {
		this.place = place;
	}

	public void result() {
		Print print = new Print();
	}

}

class Sort {
	int[] num = Process.num;
	String[] place = Process.place;
	String[] sortPlace = new String[num.length];

	public  Sort() {
		//並び替え
		Arrays.sort(num);
		for (int i = 0; i < num.length; i++) {
			sortPlace[i] = place[num[i]];
		}
	}
}

//分割,表示
class Data extends Sort {
	String[] prefecture = new String[sortPlace.length];
	String[] capital = new String[sortPlace.length];
	Double[] size = new Double[sortPlace.length];

	public Data() {
		if (sortPlace != null) {
			for (int j = 0; j < sortPlace.length; j++) {
				String[] data = sortPlace[j].split(":");
				prefecture[j] = data[0];
				capital[j] = data[1];
				size[j] = Double.parseDouble(data[2]);
			}
		} else {
			System.out.println("エラー");
		}

	}

}

//表示

/*例
 * 都道府県名：山形県
			県庁所在地：山形市
			面積：9323.0km2
 */
class Print extends Data {
	public Print() {
		for (int k = 0; k < prefecture.length; k++) {
			System.out.println("都道府県名：" +prefecture[k]);
			System.out.println("県庁所在地:" + capital[k]);
			System.out.println("面積:" + size[k] + "km2");
			System.out.println("");

		}
	}
}
