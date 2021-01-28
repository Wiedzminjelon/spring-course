package course.core.config;

import course.core.annotations.Guesscount;
import course.core.annotations.MaxNumber;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GameConfig {

    // == fields ==
    private int maxNumber = 25;

    private int guessCount = 8;

    // == bean methods ==
    @Bean
    @MaxNumber
    public int maxNumber(){
        return maxNumber;
    }

    @Bean
    @Guesscount
    public int guessCount(){
        return guessCount;
    }

}
