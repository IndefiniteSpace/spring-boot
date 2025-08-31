package dev.indefinitespace.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {


		try {
			ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
			String[] profiles = context.getEnvironment().getActiveProfiles();
			long pid = ProcessHandle.current().pid();

			String appName = context.getEnvironment().getProperty("spring.application.name", "UnnamedApp");
			log.info("🚀 Starting application ({}) v{} with Java {}", appName,
					Application.class.getPackage().getImplementationVersion(),
					System.getProperty("java.version"));

			log.info("✅ Application ({}) started successfully with PID {}. Active profiles: {}", appName, pid,
					profiles.length > 0 ? String.join(", ", profiles) : "default");

		} catch (Exception e) {
			log.error("❌ Application failed to start", e);
			System.exit(1);
		}
	}

}
