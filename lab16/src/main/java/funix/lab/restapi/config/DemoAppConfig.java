package funix.lab.restapi.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan("funix.lab.restapi.config, funix.lab.restapi.controller, funix.lab.restapi.entity, funix.lab.restapi.exception")
public class DemoAppConfig {

}
