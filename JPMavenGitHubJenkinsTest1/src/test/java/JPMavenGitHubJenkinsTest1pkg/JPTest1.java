package JPMavenGitHubJenkinsTest1pkg;

import org.testng.annotations.Test;

public class JPTest1 

{
	
	@Test(groups= {"SmokeTest"})
	public void method1()
	{
		System.out.println("Method1 is running");
		System.out.println("-----");
	}
	
	
}
