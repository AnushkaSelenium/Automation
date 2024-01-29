package practice;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample {
@Test
public void m1() {
	Reporter.log("Hii Tammudu",true);
}
@Test
public void m2() {
	Reporter.log("Lets do Kummudu",true);
	Assert.fail();//Intentionally we are failing the TC
	System.out.println("It is my first updation from github");
}
}
