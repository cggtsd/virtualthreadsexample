package cgg.virtualthreads.virtualthreadsexample;

import java.util.concurrent.Executors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatProtocolHandlerCustomizer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VirtualthreadsexampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(VirtualthreadsexampleApplication.class, args);
	}

	// @Bean
	// TomcatProtocolHandlerCustomizer<?> tomcatProtocolHandlerCustomizer() {
	// return protocolHandler -> {
	// protocolHandler.setExecutor(Executors.newVirtualThreadPerTaskExecutor());
	// };
	// }

}
