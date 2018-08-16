package eu.toop.node;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CountryConfiguration {
	
	@Value("#{${provider.services}}")
	private Map<String, String> providerServices;

	@Bean
	public Map<String, String> providerServices() {
		return this.providerServices;
	}
}
