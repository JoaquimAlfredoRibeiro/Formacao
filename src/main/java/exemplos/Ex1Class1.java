package exemplos;

public class Ex1Class1 {
	
	public void test() {
		Ex1Contador sngCnt = Ex1Contador.getInstance();
		sngCnt.increment();
		sngCnt.increment();
		sngCnt.increment();
		System.out.println("Class1: Cnt=" + sngCnt.getCnt());
	}

}
