package tn.esprit.gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.CrossOrigin;

@Configuration
@CrossOrigin(origins="*")
public class SpringCloudConfig {
    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        System.out.println("hello");
        return builder.routes()

                .route("CandidatApiApplication", r -> r.path("/candidats/**")
                        .uri("http://candidat:8082/"))
                /*.route("JobMicroService", r -> r.path("/jobs/**")
                        .uri("http://localhost:8081/"))*/
                .build();
    }
}
