package course.console;

import course.core.config.GameConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
public class Main {

    public static void main(String[] args) {
        log.info("Guess The Number game");

        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(GameConfig.class);

        context.close();
    }
}
