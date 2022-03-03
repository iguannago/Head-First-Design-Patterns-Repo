package factory_pattern;

import java.util.logging.Logger;

public class VeggiePizza extends Pizza {
    Logger logger = Logger.getLogger(this.getClass().getName());

    @Override
    void prepare() {
        logger.info("preparing VeggiePizza");
    }

    @Override
    void bake() {
        logger.info("baking VeggiePizza");
    }

    @Override
    void cut() {
        logger.info("cutting VeggiePizza");
    }

    @Override
    void box() {
        logger.info("boxing VeggiePizza");
    }

}
