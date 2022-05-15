package enumerators.ex3_temperature_convert;

public enum TemperatureConvert {
    C_F('C', 'F', -273F, inputTemperature -> inputTemperature * 1.8F + 32),
    F_C('F', 'C', -459.67F, inputTemperature -> (inputTemperature - 32) / 1.8F),
    K_C('K', 'C', 0F, inputTemperature -> inputTemperature - 273F),
    C_K('C', 'K', -273F, inputTemperature -> inputTemperature + 273F),
    F_K('K', 'F', 0F, inputTemperature -> (inputTemperature + 459.67F) * (5F / 9)),
    K_F('F', 'K', -459.67F, inputTemperature -> inputTemperature * 9 / 5 - 459.67F);

    private final char inputUnit;
    private final char outputUnit;
    private final float minInputValue;
    private final FloatsConverter converter;

    TemperatureConvert(char inputUnit, char outputUnit, float minInputValue, FloatsConverter converter) {
        this.inputUnit = inputUnit;
        this.outputUnit = outputUnit;
        this.converter = converter;
        this.minInputValue = minInputValue;
    }

    public static float convertTemperature(char inputUnit, char outputUnit, float inputTemperature) {
        inputUnit = Character.toUpperCase(inputUnit);
        outputUnit = Character.toUpperCase(outputUnit);

        TemperatureConvert temperatureConvert = findConverter(inputUnit, outputUnit);
        temperatureConvert.checkIfInputTemperatureValueValid((inputTemperature));
        return temperatureConvert.converter.convert(inputTemperature);
    }

    private static TemperatureConvert findConverter(char inputUnit, char outputUnit) {
        for (TemperatureConvert temperatureConvert : TemperatureConvert.values()) {
            if (temperatureConvert.inputUnit == inputUnit && temperatureConvert.outputUnit == outputUnit) {
                return temperatureConvert;
            }
        }
        throw new IllegalArgumentException("Unsupported units.");
    }

    private void checkIfInputTemperatureValueValid(float inputTemperature) {
        if (inputTemperature < minInputValue) {
            throw new IllegalArgumentException("Input temperature below absolute zero.");
        }
    }
}
