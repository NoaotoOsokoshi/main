package lesson29process;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Process {
	static String[] place;
	static int[] num;
	static String sort;

	// getter num
	public int[] getNum() {
		return num;
	}

	// setter num
	public void setNum(int[] num) {
		Process.num = num;
	}

	// getter place
	public String[] getPlace() {
		return place;
	}

	// setter place
	public void setPlace(String[] place) {
		Process.place = place;
	}

	// getter sort
	public static String getSort() {
		return sort;
	}

	// setter sort
	public void setSort(String sort) {
		Process.sort = sort;
	}

	public void result() {
		Print print = new Print();

	}
}

class Sort {
	int[] num = Process.num;
	String[] place = Process.place;
	String[] sortPlace = new String[num.length];
	String[] sortPlace2 = new String[num.length];
	String sort = Process.sort;

	public Sort() {

		// 並び替え（昇順）
		Arrays.sort(num);

		// 並び替えた順でplaceを格納（昇順）
		for (int i = 0; i < num.length; i++) {
			sortPlace[i] = place[num[i]];
		}

		// 並び替え（降順） 
		for (int f = 0, l = num.length - 1; f < l; f++, l--) {
			int down = num[f];
			num[f] = num[l];
			num[l] = down;
		}

		// 並び替えた順でplaceを格納（降順）
		for (int i = 0; i < num.length; i++) {
			sortPlace2[i] = place[num[i]];
		}

	}
}

//  継承　サブ　　分割,表示
class Data extends Sort {
	// 都道府県名
	String[] prefecture = new String[sortPlace.length];
	String[] prefecture2 = new String[sortPlace2.length];

	// 県庁所在地
	String[] capital = new String[sortPlace.length];
	String[] capital2 = new String[sortPlace2.length];

	// 面積
	Double[] size = new Double[sortPlace.length];
	Double[] size2 = new Double[sortPlace2.length];

	//List list1降順　list2 昇順
	List<String> list1 = new ArrayList<String>();
	List<String> list2 = new ArrayList<String>();

	public Data() {
		// nullチェック 

		if (sortPlace != null) {
			for (int j = 0; j < sortPlace.length; j++) {
				//  ":"で分ける　[0]都道府県　[1]県庁所在地　[2]面積
				String[] data = sortPlace[j].split(":");
				// list1に追加
				list1.add("都道府県名：" + data[0]);
				list1.add("県庁所在地：" + data[1]);
				list1.add("面積：" + Double.parseDouble(data[2]) + "km2");
				list1.add("");

			}
		} else {
			System.out.println("エラー");
		}

		// nullチェック 昇順
		if (sortPlace2 != null) {
			for (int j = 0; j < sortPlace2.length; j++) {
				// ":"で分ける　[0]都道府県　[1]県庁所在地　[2]面積
				String[] data = sortPlace2[j].split(":");
				// list2に追加
				list2.add("都道府県名：" + data[0]);
				list2.add("県庁所在地：" + data[1]);
				list2.add("面積：" + Double.parseDouble(data[2]) + "km2");
				list2.add("");
			}
		} else {
			System.out.println("エラー");
		}

	}

}

// 表示

/*例
都道府県名：山形県
県庁所在地：山形市
面積：9323.0km2
 */
class Print extends Data {
	public Print() {
		String sort2 = null;
		// while　breakでループを抜ける
		do {
			if (sort.equals("降順")) {
				// list1 表示
				list1.forEach(System.out::println);
				break;
			} else if (sort.equals("昇順")) {
				// list2　表示
				list2.forEach(System.out::println);
				break;
			} else {
				System.out.println("昇順か降順かを入力してください");
				Scanner scanner2 = new Scanner(System.in);
				sort2 = scanner2.nextLine();
				sort = sort2;
			}
		} while (true);
	}
}
