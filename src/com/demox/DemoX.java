package com.demox;

public class DemoX {

	void test() {
		System.out.println(super.getClass());
		ClassLoader classLoader = this.getClass().getClassLoader();
		
		while(classLoader != null) {
			System.out.println(classLoader.getClass().getCanonicalName());
			classLoader = classLoader.getParent();
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoX demox = new DemoX();
		demox.test();
		Integer i = 0;
		i.getClass().getClassLoader();
		System.out.println(i.getClass().getClassLoader().getClass().getCanonicalName());
	}

}
