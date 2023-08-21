package koschei.config;

import koschei.models.Island2;
import koschei.models.Rabbit4;
import koschei.models.Wood3;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.logging.Logger;

@Configuration
@ComponentScan(basePackages = "koschei")
public class AppConfig {

    @Bean
    public static Island2 getIsland(Wood3 wood) {
        Logger.getLogger(Rabbit4.class.getName()).info("!!!!!!!!!");
        return new Island2(wood);
    }
}