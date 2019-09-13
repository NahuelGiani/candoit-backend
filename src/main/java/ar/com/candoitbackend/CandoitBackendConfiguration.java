package ar.com.candoitbackend;

import org.dozer.DozerBeanMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CandoitBackendConfiguration {
	@Bean
    public DozerBeanMapper mapper() {
        return new DozerBeanMapper();
    }
}
