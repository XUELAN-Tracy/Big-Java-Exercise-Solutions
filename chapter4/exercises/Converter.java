package chapter4.exercises;

/**
 * A program that can convert meters into miles, feet and inches.
 * @author LanXue
 */
public class Converter {

    double factor;

    /**
     * Constructs a converter that can convert between twp inits.
     * @param aConversionFactor the factor by which to multiply to convert to the target unit
     */
    public Converter(double aConversionFactor) {
        factor = aConversionFactor;
    }

    /**
     * Converts from a source measurement to a target measurement.
     * @param fromMeasurement the measurement
     * @return the input value converted to the target unit
     */
    public double convertTo(double fromMeasurement) {
        return fromMeasurement * factor;
    }

    /**
     * Converts from a target measurement to a source measurement.
     * @param toMeasurement the target measurement
     * @return the value whose conversion is the target measurement
     */
    public double convertFrom(double toMeasurement) {
        return toMeasurement / factor;
    }

}
