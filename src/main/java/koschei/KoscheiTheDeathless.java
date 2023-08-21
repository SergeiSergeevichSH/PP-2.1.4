package koschei;

import koschei.models.Ocean1;
import koschei.models.Rabbit4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class KoscheiTheDeathless {

    private Ocean1 ocean;

    @Autowired
    public void setOcean(Ocean1 ocean) {
        Logger.getLogger(Rabbit4.class.getName()).info("!!!!!!!!!");
        this.ocean = ocean;
    }

    public String getRulesByDeth() {
        return "На свете есть океан , " + ocean.toString();
    }
}
