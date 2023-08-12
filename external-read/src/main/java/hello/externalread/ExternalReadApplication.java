package hello.externalread;

import hello.externalread.config.MyDataSourceConfigV1;
import hello.externalread.config.MyDataSourceConfigV2;
import hello.externalread.config.MyDataSourceEnvConfig;
import hello.externalread.config.MyDataSourceValueConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Import;

//@Import(MyDataSourceEnvConfig.class)
//@Import(MyDataSourceValueConfig.class)
//@Import(MyDataSourceConfigV1.class)
@Import(MyDataSourceConfigV2.class)
@SpringBootApplication(scanBasePackages = "hello.externalread.datasource")
@ConfigurationPropertiesScan
public class ExternalReadApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExternalReadApplication.class, args);
	}

}
