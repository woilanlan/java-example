package top.woilanlan.holding;

import top.woilanlan.typeinfo.pets.Cat;
import top.woilanlan.typeinfo.pets.Dog;
import top.woilanlan.typeinfo.pets.Hamster;
import top.woilanlan.typeinfo.pets.Pet;

import java.util.HashMap;
import java.util.Map;
import static top.woilanlan.util.Print.*;

/**
 * 使用 String 作为键值
 */
public class PetMap {
    public static void show(){
        Map<String, Pet> petMap = new HashMap<String,Pet>();
        petMap.put("My Cat", new Cat("Molly"));
        petMap.put("My Dog", new Dog("Ginger"));
        petMap.put("My Hamster", new Hamster("Bosco"));
        print(petMap);
        Pet dog = petMap.get("My Dog");
        print(dog);
        print(petMap.containsKey("My Dog"));    //测试是否包含某个键
        print(petMap.containsValue(dog));   //测试是否包含某个值
    }
}
