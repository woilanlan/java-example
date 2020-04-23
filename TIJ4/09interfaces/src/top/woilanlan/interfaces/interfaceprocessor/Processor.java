package top.woilanlan.interfaces.interfaceprocessor;

/**
 * Processor
 */
public interface Processor {

    String name();
    Object process(Object input);
}