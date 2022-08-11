package mavenParameter;

import org.testng.annotations.Test;

public class ToReaddataFrommaven {
	@Test
	public void readData() {
		String url = System.getProperty("Url");
		String browser = System.getProperty("browser");
		
		System.out.println(url);
		System.out.println(browser);
	}

}
