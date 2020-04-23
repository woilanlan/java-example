package top.woilanlan.interfaces.filters;

/**
 * Filter
 */
public class Filter {

    public String name() {
        return getClass().getSimpleName();
    }
    public Waveform process(Waveform input) {
        return input;
    }
}