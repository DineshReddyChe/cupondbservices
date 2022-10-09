package com.example.cupon.config;

import org.springframework.context.annotation.Bean;


import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicate;

import static springfox.documentation.builders.PathSelectors.regex;


import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import static com.google.common.base.Predicates.or;

@Configuration
public class SwaggerConfig {
	@Bean
	public Docket postsApi() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("CuponDb")
	
	.apiInfo(apiInfo()).select().paths(postPaths()).build();
}

private Predicate<String> postPaths() {
	return or(regex("/coupondb/addcoupon"), regex("/coupondb/updatecoupon"));
}
	


	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("CuponDb API")
				.description("Cupon API reference for developers")
				.termsOfServiceUrl("")
				.contact("dineshece405@gmail.com").license("Dinesh License")
				.licenseUrl("dineshece405@gmail.com").version("1.0").build();
	}
//

}
