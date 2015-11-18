package ru.pavelnix;

/**
 * Class implements calculator.
 * Класс реализует калькулятор.
 */
public class Calculator {

    /**
     * Method performs division
     * @param aFloat - first argument
     * @param aFloat1 - second argument
     * @return division
     */
    public float div(float aFloat, float aFloat1) {
        return aFloat / aFloat1;
    }

    /**
     * Method performs subtraction
     * @param aFloat - first argument
     * @param aFloat1 - second argument
     * @return subtraction
     */
    public float minus(float aFloat, float aFloat1) {
        return aFloat - aFloat1;
    }

    /**
     * Method performs sum
     * @param aFloat - first argument
     * @param aFloat1 - second argument
     * @return sum
     */
    public float sum(float aFloat, float aFloat1) {
        return aFloat + aFloat1;
    }

    /**
     * Method performs multiplication
     * @param aFloat - first argument
     * @param aFloat1 - second argument
     * @return multiplication
     */
    public float mult(float aFloat, float aFloat1) {
        return aFloat * aFloat1;
    }
}
