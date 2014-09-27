package sk.upjs.ics.novotnyr.chocolate;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan("sk.upjs.ics.novotnyr.chocolate")
public class ChocolateWebApplicationContext {
	/* vsetko je autodiscovernute */
}
