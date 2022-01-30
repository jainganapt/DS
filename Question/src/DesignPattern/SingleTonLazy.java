package DesignPattern;

public class SingleTonLazy {

	public static volatile SingleTonLazy s2 = null;

	private SingleTonLazy() {

	}

	public static SingleTonLazy getIns() {
		if (s2 == null) {
			synchronized (SingleTonLazy.class) {
				s2 = new SingleTonLazy();
			}
		}

		return s2;
	}
}
