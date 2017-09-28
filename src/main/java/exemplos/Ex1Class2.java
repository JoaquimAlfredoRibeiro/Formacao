package exemplos;

public class Ex1Class2 {

	public void test() {
		Ex1Contador sngCnt = Ex1Contador.getInstance();
		sngCnt.increment();
		sngCnt.increment();
		System.out.println("Class2: Cnt=" + sngCnt.getCnt());
	}
	
}
