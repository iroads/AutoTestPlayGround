package generators;

import java.util.Random;
import java.util.function.Function;

public class RandomEnumGenerator {

    private static final Random RANDOM = new Random();

    private RandomEnumGenerator() {
    }

    public static <T extends Enum<?>> T generateEnumValue(Class<T> enumClass){
        T[] enumConstants = enumClass.getEnumConstants();
        return enumConstants[RANDOM.nextInt(enumConstants.length)];
    }
}
