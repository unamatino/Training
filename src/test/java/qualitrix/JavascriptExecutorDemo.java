package qualitrix;

public class JavascriptExecutorDemo {

	public static void main(String[] args) {
		WEBDRIVER driver=new CHROMEDRIVER();
		driver.method1();
		driver.method2();
		driver.method3();
		
		JAVASCRIPTEXECUTOR jse=(JAVASCRIPTEXECUTOR)driver;
		jse.method11();
	}

}
interface WEBDRIVER{
	public void method1();
	public void method2();
	public void method3();
}
interface JAVASCRIPTEXECUTOR{
	public void method11();
	public void method22();
	public void method33();
}
class REMOTEWEBDRIVER implements WEBDRIVER,JAVASCRIPTEXECUTOR{

	public void method11() {
		System.out.println("method11 in JSE");
	}

	public void method22() {
		System.out.println("method22 in JSE");
	}

	public void method33() {
		System.out.println("method33 in JSE");
	}

	public void method1() {
		System.out.println("method1 in WD");
	}

	public void method2() {
		System.out.println("method2 in WD");
	}

	public void method3() {
		System.out.println("method3 in WD");
	}
	
}
class CHROMEDRIVER extends REMOTEWEBDRIVER{
	public void method111() {
		System.out.println("method111 in CD");
	}
	public void method222() {
		System.out.println("method222 in CD");
	}
	public void method333() {
		System.out.println("method333 in CD");
	}
}
