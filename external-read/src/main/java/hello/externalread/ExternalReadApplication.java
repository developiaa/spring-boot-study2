package hello.externalread;

import hello.externalread.config.MyDataSourceEnvConfig;
import hello.externalread.config.MyDataSourceValueConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

//@Import(MyDataSourceEnvConfig.class)
@Import(MyDataSourceValueConfig.class)
@SpringBootApplication(scanBasePackages = "hello.externalread.datasource")
public class ExternalReadApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExternalReadApplication.class, args);
	}

}
