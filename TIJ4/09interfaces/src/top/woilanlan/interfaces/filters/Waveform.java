package top.woilanlan.interfaces.filters;

/**
 * Waveform 波形
 */
public class Waveform {

    private static long counter;
    private final long id = counter++;
    @Override
    public String toString() {
        return "Waveform "+ id;
    }
}