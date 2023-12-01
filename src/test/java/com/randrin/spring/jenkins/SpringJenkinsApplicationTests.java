package com.randrin.spring.jenkins;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
@Slf4j
class SpringJenkinsApplicationTests {

	@Test
	void contextLoads() {
		log.info("Test Spring Jenkins CI");
		Assert.isTrue("Randrino".equalsIgnoreCase("Randrino"), "Randrino");
	}

}
