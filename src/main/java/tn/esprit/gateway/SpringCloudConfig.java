package tn.esprit.gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringCloudConfig {
    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        System.out.println("hello");
        return builder.routes()

                .route("CondidatMicroService", r -> r.path("/candidats/**")
                        .uri("http://localhost:8088/"))
                .route("JobMicroService", r -> r.path("/jobs/**")
                        .uri("http://job_A2:8091/"))
                .build();
    }
}
