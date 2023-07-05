package testnew;

import org.testng.annotations.Test;

public class ParallelExecution1 {
 @Test
 
 public void testMethod1()
 {
	System.out.println("TestClass1>>testmethod1"+Thread.currentThread().getId()) ;
 }
 @Test
 public void testMethod2()
 {
	System.out.println("TestClass1>>testmethod2"+Thread.currentThread().getId()) ;
 }
 @Test
 public void testMethod3()
 {
	System.out.println("TestClass1>>testmethod3"+Thread.currentThread().getId()) ;
 }
}
