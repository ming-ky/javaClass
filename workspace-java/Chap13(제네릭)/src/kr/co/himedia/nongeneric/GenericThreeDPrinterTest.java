package kr.co.himedia.nongeneric;

public class GenericThreeDPrinterTest {

	public static void main(String[] args) {


		GenericThreeDPrinter<Powder> powerPrinter = new GenericThreeDPrinter<>();
		powerPrinter.setMaterial(new Powder());
		Powder powder = powerPrinter.getMaterial(); //캐스팅 생략가능
		System.out.println(powerPrinter);
		
		GenericThreeDPrinter<Plastic> plasticPrinter = new GenericThreeDPrinter<Plastic>(); //<Plastic> , <> 둘다 가능
		plasticPrinter.setMaterial(new Plastic());
		Plastic plastic = plasticPrinter.getMaterial(); //캐스팅 생략가능
		System.out.println(plasticPrinter);

	}

}
