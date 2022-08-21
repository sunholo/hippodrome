package hippodrome;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static java.util.Objects.isNull;


public class Horse {

    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);
    private final String name;
    private final double speed;
    private double distance;

    public Horse(String name, double speed, double distance) {
        if (isNull(name)) {
            LOGGER.error("Horse: Name is null");
            throw new IllegalArgumentException("Name cannot be null.");
        } else if (name.isBlank()) {
            LOGGER.error("Horse: Name is blank");
            throw new IllegalArgumentException("Name cannot be blank.");
        }
        if (speed < 0) {
            LOGGER.error("Horse: Speed is negative");
            throw new IllegalArgumentException("Speed cannot be negative.");
        }
        if (distance < 0) {
            LOGGER.error("Horse: Distance is negative");
            throw new IllegalArgumentException("Distance cannot be negative.");
        }

        LOGGER.debug("Horse: Создание Horse, имя [{}], скорость [{}]",name,speed);

        this.name = name;
        this.speed = speed;
        this.distance = distance;
    }

    public Horse(String name, double speed) {
        this(name, speed, 0);
    }

    public String getName() {
        return name;
    }

    public double getSpeed() {
        return speed;
    }

    public double getDistance() {
        return distance;
    }

    public void move() {
        distance += speed * getRandomDouble(0.2, 0.9);
    }

    public static double getRandomDouble(double min, double max) {
        return (Math.random() * (max - min)) + min;
    }
}
