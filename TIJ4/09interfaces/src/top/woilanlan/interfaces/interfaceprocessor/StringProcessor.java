package top.woilanlan.interfaces.interfaceprocessor;

import java.util.Arrays;

/**
 * StringProcessor
 */
public abstract class StringProcessor implements Processor {

    @Override
    public String name() {
        return getClass().getSimpleName();
    }
    @Override
    public abstract String process(Object input);
}

class Upcase extends StringProcessor{

    @Override
    public String process(Object input) {
        return ((String)input).toUpperCase();
    }
    
}

class Downcase extends StringProcessor{

    @Override
    public String process(Object input) {
        return ((String)input).toLowerCase();
    }
    
}

class Splitter extends StringProcessor{

    @Override
    public String process(Object input) {
        String[] split = ((String)input).split(" ");
        return Arrays.toString(split);
    }
    
}