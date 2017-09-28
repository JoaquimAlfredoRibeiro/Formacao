package exemplos;

public class Ex1Test {
	public static void main(String[] args) {
		Ex1Class1 c1 = new Ex1Class1(); 
		Ex1Class2 c2 = new Ex1Class2(); 
		c1.test(); // incrementa 3x
		c2.test(); // incrementa 2x
		Ex1Contador sngCnt = Ex1Contador.getInstance();
        for(int i=0; i<55; i++) {
  		  sngCnt.increment();
        }
		System.out.println("Test: Cnt=" + sngCnt.getCnt());  
		
	}

}
