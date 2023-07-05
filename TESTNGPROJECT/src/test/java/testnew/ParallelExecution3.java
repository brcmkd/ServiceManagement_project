package testnew;

import org.testng.annotations.Test;

public class ParallelExecution3 {
	@Test
	 
	 public void testMethod7()
	 {
		System.out.println("TestClass1>>testmethod7"+Thread.currentThread().getId()) ;
	 }
	 @Test
	 public void testMethod8()
	 {
		System.out.println("TestClass1>>testmethod8"+Thread.currentThread().getId()) ;
	 }
	 @Test
	 public void testMethod9()
	 {
		System.out.println("TestClass1>>testmethod9"+Thread.currentThread().getId()) ;
	 }
}
