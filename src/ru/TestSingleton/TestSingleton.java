package ru.TestSingleton;

public class TestSingleton {
private static TestSingleton instace;

public static TestSingleton getInstace() {
	if(instace==null) {
		instace = new TestSingleton();
	}
	return instace;
}

private TestSingleton() {}

public void print() {
	System.out.println(this);
}

}
