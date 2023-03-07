package ch08.sec09;

public class ExtendsExample {
	public static void main(String[] args) {
		InterfaceCImp1 imp1 = new InterfaceCImp1();
		
		InterfaceA ia = imp1;
		ia.methodA();
		System.out.println();
		
		InterfaceB ib = imp1;
		ib.methodB();
		System.out.println();
		
		InterfaceC ic = imp1;
		ia.methodA();
		ib.methodB();
		ic.methodC();
		System.out.println();
	}
}
