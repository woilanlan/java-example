package top.woilanlan.interfaces.interfaceprocessor;

import top.woilanlan.interfaces.filters.BandPass;
import top.woilanlan.interfaces.filters.Filter;
import top.woilanlan.interfaces.filters.HighPass;
import top.woilanlan.interfaces.filters.LowPass;
import top.woilanlan.interfaces.filters.Waveform;

class FilterAdapter implements Processor{
    Filter filter;

    public FilterAdapter(Filter filter) {
        this.filter = filter;
    }

    @Override
    public String name() {
        return filter.name();
    }

    @Override
    public Waveform process(Object input) {
        return filter.process((Waveform) input);
    }
}

/**
 * FilterProcessor
 * 当无法修改你想使用的类时，类库并不是自己创建的
 * 这种情况下可以使用适配器模式。
 * 适配器中的代码将接受你所拥有的接口，并产生你需要的接口
 */
public class FilterProcessor {

    public static void show() {
        Waveform w = new Waveform();
        Apply.process(new FilterAdapter(new LowPass(1.0)), w);
        Apply.process(new FilterAdapter(new HighPass(2.0)), w);
        Apply.process(new FilterAdapter(new BandPass(3.0,4.0)), w);
    }
}