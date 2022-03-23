package com.crm.camScannerTestScripts;

import org.testng.annotations.Test;

public class ParamertersTest {

		@Test
		public void getData() { 
			
			System.out.println(System.getProperty("browser"));
			System.out.println(System.getProperty("url"));
			System.out.println(System.getProperty("username"));
			System.out.println(System.getProperty("password"));
		}
}

//execution= run As ==> run configurations ==> select project & className
//Arguments page = -Dbrowser=cheome -Durl=http://localhost:8888 -Dusername=admin -Dpassword=root