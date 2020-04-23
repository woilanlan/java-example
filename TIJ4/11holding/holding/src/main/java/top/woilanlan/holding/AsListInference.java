package top.woilanlan.holding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Snow {
}

class Powder extends Snow {
}

class Light extends Powder {
}

class Heavy extends Powder {
}

class Crusty extends Snow {
}

class Slush extends Snow {
}


public class AsListInference {

    public static void show() {
        List<Snow> snow1 = Arrays.asList(new Crusty(),new Slush(),new Powder());

        List<Snow> snow2 = Arrays.asList(new Light(),new Heavy());

        List<Snow> snow3 = new ArrayList<>();
        Collections.addAll(snow3,new Light(),new Heavy());

        //显示类型参数说明，告诉编译器产生的List类型，实际的目标类型应该是什么
        List<Snow> snow4 = Arrays.<Snow>asList(new Light(),new Heavy());
    }
}
