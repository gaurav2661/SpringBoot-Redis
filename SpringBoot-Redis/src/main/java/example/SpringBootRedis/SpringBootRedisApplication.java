package example.SpringBootRedis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootRedisApplication {
	private static final Logger LOG = LoggerFactory.getLogger(SpringBootRedisApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRedisApplication.class, args);
		LOG.info("SpringBoot redis application is started successfully.");
	}

}
