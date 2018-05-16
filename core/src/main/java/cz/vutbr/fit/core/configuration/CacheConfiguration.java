package cz.vutbr.fit.core.configuration;

import com.github.benmanes.caffeine.cache.Caffeine;
import com.github.benmanes.caffeine.cache.Ticker;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cache.CacheManager;
import org.springframework.cache.caffeine.CaffeineCache;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

/**
 * Cache configuration class. This class takes information from application.properties file and creates caches.
 *
 */

@Configuration
@ConfigurationProperties(prefix = "caching")
public class CacheConfiguration {

    private Map<String, Cache> specs;

    @Bean
    public CacheManager cacheManager(Ticker ticker) {
        SimpleCacheManager manager = new SimpleCacheManager();
        if (specs != null) {
            List<CaffeineCache> caches = specs.entrySet().stream()
                    .map(entry -> buildCache(entry.getKey(), entry.getValue()))
                    .collect(Collectors.toList());
            manager.setCaches(caches);
        }
        return manager;
    }

    private CaffeineCache buildCache(String name, Cache cacheSpec) {
        final Caffeine<Object, Object> caffeineBuilder = Caffeine.newBuilder()
                .expireAfterWrite(cacheSpec.getExpiration(), TimeUnit.SECONDS)
                .maximumSize(cacheSpec.getSize())
                .ticker(ticker());
        return new CaffeineCache(name, caffeineBuilder.build());
    }

    @Bean
    public Ticker ticker() {
        return Ticker.systemTicker();
    }

    public Map<String, Cache> getSpecs() {
        return specs;
    }

    public void setSpecs(Map<String, Cache> specs) {
        this.specs = specs;
    }

    public static class Cache {
        private Integer expiration;
        private Integer size = 2000;

        public Integer getExpiration() {
            return expiration;
        }

        public void setExpiration(Integer expiration) {
            this.expiration = expiration;
        }

        public Integer getSize() {
            return size;
        }

        public void setSize(Integer size) {
            this.size = size;
        }

    }

}
