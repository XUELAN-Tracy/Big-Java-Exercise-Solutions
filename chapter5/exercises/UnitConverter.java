package chapter5.exercises;

/**
 * A program that can convert between legal units.
 * @author LanXue
 * @date 2020-02-12 16:55
 */
public class UnitConverter {

    private static final double IN_T0_METER = 0.0254;
    private static final double FT_T0_METER = 0.3048;
    private static final double MI_T0_METER = 1609;
    private static final double MM_T0_METER = 0.001;
    private static final double CM_T0_METER = 0.01;
    private static final double KM_T0_METER = 1000;

    double value;
    String unit;

    public UnitConverter(String unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    public double toMeters() {
        double result = 0;
        if (unit.equals("in")) {
            result = value * IN_T0_METER;
        } else if (unit.equals("ft")) {
            result = value * FT_T0_METER;
        } else if (unit.equals("mi")) {
            result = value * MI_T0_METER;
        } else if (unit.equals("mm")) {
            result = value * MM_T0_METER;
        } else if (unit.equals("cm")) {
            result = value * CM_T0_METER;
        } else if (unit.equals("km")) {
            result = value * KM_T0_METER;
        }
        return result;
    }

    public double fromMeters() {
        double result = 0;
        if (unit.equals("in")) {
            result = value * (1 / IN_T0_METER);
        } else if (unit.equals("ft")) {
            result = value * (1 / FT_T0_METER);
        } else if (unit.equals("mi")) {
            result = value * (1 / MI_T0_METER);
        } else if (unit.equals("mm")) {
            result = value * (1 / MM_T0_METER);
        } else if (unit.equals("cm")) {
            result = value * (1 / CM_T0_METER);
        } else if (unit.equals("km")) {
            result = value * (1 / KM_T0_METER);
        }
        return  result;
    }
}
