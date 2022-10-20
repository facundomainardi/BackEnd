package com.portmainardi.jfm;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@SpringBootTest(classes = JfmApplicationTests.class)
class JfmApplicationTests {

	@Test
	void contextLoads() {
	}
        
      //   @RunWith(SpringJUnit4ClassRunner.class) @SpringBootTest(classes = Application.class) @ActiveProfiles("test") @WebAppConfiguration /** * If you have any property file to load to test uncomment below line) @TestPropertySource({ "classpath:/properties/dbConfig-test.properties", "classpath:/properties/unittest.properties" }) */ public abstract class AbstractSpringTest{}


}
