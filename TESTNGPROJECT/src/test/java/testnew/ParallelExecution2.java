package testnew;

import org.testng.annotations.Test;

public class ParallelExecution2 {
	
		 @Test
		 
		 public void testMethod4()
		 {
			System.out.println("TestClass1>>testmethod4"+Thread.currentThread().getId()) ;
		 }
		 @Test
		 public void testMethod5()
		 {
			System.out.println("TestClass1>>testmethod5"+Thread.currentThread().getId()) ;
		 }
		 @Test
		 public void testMethod6()
		 {
			System.out.println("TestClass1>>testmethod6"+Thread.currentThread().getId()) ;
		 }
}
