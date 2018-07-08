package ie.irishlife.empower.poc.service

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.DependsOn
import org.springframework.core.io.ClassPathResource
import org.springframework.http.MediaType
import org.springframework.web.reactive.function.server.RouterFunctions.resources
import org.springframework.web.reactive.function.server.router



@Configuration
class UserRoutes() {
	
	@Bean
    fun mainRouter() = router {
	
	}
            
}