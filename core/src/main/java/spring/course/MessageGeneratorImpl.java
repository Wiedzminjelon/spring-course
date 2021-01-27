package spring.course;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

public class MessageGeneratorImpl implements MessageGenerator {

    // == constans ==
    private static final Logger log = LoggerFactory.getLogger(MessageGenerator.class);

    // == fields ==
    @Autowired
    private Game game;

    private int guessCount = 10;

    // == public methods ==
    @PostConstruct
    public void init(){
        log.info("Game initialized {}", game);
    }

    @Override
    public String getMainMessage() {
        return "getMainMessage()";
    }

    @Override
    public String getResultMessage() {
        return "getResultMessage";
    }
}
