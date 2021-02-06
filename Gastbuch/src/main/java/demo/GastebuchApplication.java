package demo;

import demo.catalogue.Photo;
import demo.catalogue.PhotoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.stream.Stream;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class, DataSourceTransactionManagerAutoConfiguration.class })
@ComponentScan("demo.catalogue")
public class GastebuchApplication {

    public static void main(String[] args) {
        SpringApplication.run(GastebuchApplication.class, args);
    }

    @Bean
    CommandLineRunner init(PhotoRepository photos) {

        return args -> {

            Stream.of( //
                    new Photo("00001", "Christian","Leipzig"), //
                    new Photo("00002", "Daniel","Frankfurt am Main"), //
                    new Photo("00003", "Martin","Braunschweig"), //
                    new Photo("00004", "Dominik","Duisburg")) //
                    .forEach(photos::save);
        };
    }


    @Configuration
    @EnableGlobalMethodSecurity(prePostEnabled = true)
    static class SecurityConfiguration extends WebSecurityConfigurerAdapter implements WebMvcConfigurer {

        /*
         * (non-Javadoc)
         * @see org.springframework.web.servlet.config.annotation.WebMvcConfigurer#addViewControllers(org.springframework.web.servlet.config.annotation.ViewControllerRegistry)
         */
        @Override
        public void addViewControllers(ViewControllerRegistry registry) {

            // Route requests to /login to the login view (a default one provided by Spring Security)
            registry.addViewController("/login").setViewName("login");
        }

        /*
         * (non-Javadoc)
         * @see org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter#configure(org.springframework.security.config.annotation.web.builders.HttpSecurity)
         */
        @Override
        protected void configure(HttpSecurity http) throws Exception {

            http.csrf().disable();

            // Allow all requests on the URI level, configure form login.
            http.authorizeRequests().anyRequest().permitAll() //
                    .and().formLogin() //
                    .and().logout().logoutSuccessUrl("/").clearAuthentication(true);
        }
    }
}