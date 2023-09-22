package koschei.models;

import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.logging.Level;
import java.util.logging.Logger;

@Component
public class Wood3 {

    private final Rabbit4 rabbit;


    @Autowired
    public Wood3(Rabbit4 rabbit) {
        Logger.getLogger(Rabbit4.class.getName()).info("This is an info message.");
        this.rabbit = rabbit;

    }

    @Override
    public String toString() {
        Logger.getLogger(Rabbit4.class.getName()).info("!!!!!!!!!");
        return ", на дереве заяц " + rabbit.toString();
    }
}
