package io.github.kuyer.sboot.starter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(StartConfig.class)
@ConditionalOnClass(StartService.class)
@ConditionalOnProperty(prefix="io.github.kuyer.sboot.starter", value="enable", matchIfMissing=true)
public class StartAutoConfiguration {
	
	@Autowired
	private StartConfig startConfig;
	
	@Bean
	@ConditionalOnMissingBean(StartService.class)
	public StartService startService() {
		return new StartService(startConfig);
	}

}
