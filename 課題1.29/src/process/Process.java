package process;
import java.util.Arrays;
public class Process {
static String[] place;
static int [] num; 

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
	Sort sort = new Sort();
	sort.imform();
}

}
//処理
class Sort{
int[]	num = Process.num;
public void imform(){
	Arrays.sort(num);
	System.out.println(num[0]);
}

	
}