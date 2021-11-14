package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ArrayListList {
	static String[] things = { "eggs", "laser", "hats", "pie" };
	static String[] morethings = { "laser", "hats" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arrayListDataType();
		ListDataType();
		editList();
	}

	// define al with ArrayList data type

	public static void arrayListDataType() {
		ArrayList<String> al = new ArrayList();

		for (String x : things) {
			al.add(x);
		}
		System.out.println("things array with arrayList: ");
		for (String y : al) {
			System.out.println(y);
		}
		System.out.println();
	}

	public static void ListDataType() {

		// define list1 with List data type
		List<String> list1 = new ArrayList();

		for (String a : morethings) {
			list1.add(a);
		}
		System.out.println("Morethings array with List ArrayList: ");
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}

	}

	// now remove the common elements from the list

	public static void editList() {

		List<String> listA = new ArrayList();
		List<String> listB = new ArrayList();

		for (String st : things) {
			listA.add(st);
		}

		for (String str : morethings) {
			listB.add(str);
		}

		Iterator<String> it = listA.iterator();

		while (it.hasNext()) {
			if (listB.contains(it.next())) {
				it.remove();
			}

		}
		System.out.println();
		System.out.println("List after removing the common elements: ");
		for (int i = 0; i < listA.size(); i++) {
			System.out.printf("%s ", listA.get(i));
		}

	}
}
