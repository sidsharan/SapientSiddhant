package com.sapient.cui.client;


import java.util.HashMap;


class Data<T> {
	private int value;

	public Data(int i) {
		// TODO Auto-generated constructor stub
		this.value=i;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.valueOf(value);
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
}

public class MainApp {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Data<Integer> d = new Data<Integer>();
//		Integer value = new Integer(43);
//		d.setValue(value);
//		System.out.println(d.getValue());
//		List<String> list = new ArrayList<String>();
//		list.add("A");
//		list.add("awwq");
//		list.add("zxc");
//		list.add("d");
//		list.add("A");
//		list.add("a");
//		String name;
//		Iterator<String> iterator = list.iterator();
//		while(iterator.hasNext()){
//			name = iterator.next();
//			System.out.println(name);
		
		HashMap<Integer, Data> result = new HashMap<Integer, Data>();
		result.put(3, new Data(12));
		result.put(4, new Data(23));
		result.put(5, new Data(34));
		result.put(3, new Data(45));
		result.put(6, new Data(56));
	
		System.out.println(result);
		System.out.println();
		}
}



