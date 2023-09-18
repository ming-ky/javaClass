package kr.co.himedia.singleton;

public class Company {
	
	private Company() {}
	private static Company Instance = new Company();
	
	public static Company getIstance() {
		if (Instance == null)
			Instance = new Company();
		return Instance;
	}

}
