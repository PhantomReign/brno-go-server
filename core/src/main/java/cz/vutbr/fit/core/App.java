package cz.vutbr.fit.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;

@SpringBootApplication(scanBasePackages = "cz.vutbr.fit")
@EnableReactiveMongoRepositories
@EnableWebFluxSecurity
@EnableCaching()
public class App {

    private static void setProxy() {
        System.setProperty("socksProxyHost", "localhost");
        System.setProperty("socksProxyPort", "9001");
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
        setProxy();
    }
}
