package factory_pattern;

import java.util.logging.Logger;

public class CheesePizza extends Pizza {

    Logger logger = Logger.getLogger(this.getClass().getName());

    @Override
    void prepare() {
        logger.info("preparing CheesePizza");
    }

    @Override
    void bake() {
        logger.info("baking CheesePizza");
    }

    @Override
    void cut() {
        logger.info("cutting CheesePizza");
    }

    @Override
    void box() {
        logger.info("boxing CheesePizza");
    }
}
