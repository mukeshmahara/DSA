package List_Examples;

import java.util.ArrayList;
import java.util.List;

public class DemoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add("SA");
		list.add("SAD"); 
		System.out.println("Before Remove "+list);
		list.remove(1);
		list.remove(0);
		System.out.println(" After Remove " +list);

	}

}
