package JPMavenGitHubJenkinsTest1pkg;

import org.testng.annotations.Test;

public class JPTest1c_bothsmkreg1 

{
	
	@Test(groups= {"SmokeTest","RegressionTest"})
	public void method1c()
	{
		System.out.println("Method1c is running");
		System.out.println("-----");
	}
}
