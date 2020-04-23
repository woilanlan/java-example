package top.woilanlan;

import org.junit.Test;

import top.woilanlan.array.ArrayClassObj;
import top.woilanlan.array.ArrayInit;
import top.woilanlan.array.ArrayNew;
import top.woilanlan.array.ArrayOfPrimitives;
import top.woilanlan.array.AutoboxVarArgs;
import top.woilanlan.array.DynamicArray;
import top.woilanlan.array.NewVarArgs;
import top.woilanlan.array.OptionalTrailingArguments;
import top.woilanlan.array.OverloadVarArgs;
import top.woilanlan.array.OverloadVarArgs2;
import top.woilanlan.array.VarArgType;
import top.woilanlan.array.VarArgs;
import top.woilanlan.enums.Burrito;
import top.woilanlan.enums.EnumOrder;
import top.woilanlan.enums.SimpleEnumUse;

/**
 * AllTest
 */
public class AllTest {

    @Test
    public void testRock() {
        Rock r = new Rock();
        r.show();
    }

    @Test
    public void testRock2() {
        Rock r = new Rock();
        r.show2();
    }

    @Test
    public void testTree() {
        Tree t = new Tree();
        t.show();
    }

    @Test
    public void testLeaf() {
        Leaf l = new Leaf();
        l.increment().increment().increment().print();
    }

    @Test
    public void testThis() {
        PassingThis t = new PassingThis();
        t.show();
    }

    @Test
    public void testFlower() {
        Flower f = new Flower();
        f.printPetalCount();
    }

    @Test
    public void testTermination() {
        TerminationCondition t = new TerminationCondition();
        t.show();
    }

    @Test
    public void testInitialValues() {
        InitialValues iv = new InitialValues();
        iv.printInitialValues();
    }

    @Test
    public void testOrderOfInit() {
        OrderOfInitialization iv = new OrderOfInitialization();
        iv.show();
    }

    @Test
    public void testStaticInit() {
        StaticInitialization iv = new StaticInitialization();
        iv.show();
    }

    @Test
    public void testExplicitStatic() {
        ExplicitStatic iv = new ExplicitStatic();
        iv.show();
    }

    @Test
    public void testMugs() {
        Mugs.show();
    }

    @Test
    public void testArrayOfPrimitives() {
        ArrayOfPrimitives a = new ArrayOfPrimitives();
        a.show();
    }

    @Test
    public void testArrayNew() {
        ArrayNew a = new ArrayNew();
        a.show();
    }

    @Test
    public void testArrayClassObj() {
        ArrayClassObj.show();
    }

    @Test
    public void testArrayInit() {
        ArrayInit.show();
    }

    @Test
    public void testDynamicArray() {
        DynamicArray.show();
    }

    @Test
    public void testVarArgs() {
        VarArgs.show();
    }

    @Test
    public void testNewVarArgs() {
        NewVarArgs.show();
    }

    @Test
    public void testNewVarArgs2() {
        OptionalTrailingArguments.show();
    }

    @Test
    public void testVarArgType() {
        VarArgType.show();
    }

    @Test
    public void testAutoboxVarArgs() {
        AutoboxVarArgs.show();
    }

    @Test
    public void testOverloadVarArgs() {
        OverloadVarArgs.show();
    }

    @Test
    public void testOverloadVarArgs2() {
        OverloadVarArgs2.show();
    }

    @Test
    public void testSimpleEnumUse() {
        SimpleEnumUse.show();
    }

    @Test
    public void testEnumOrder() {
        EnumOrder.show();
    }

    @Test
    public void testBurrito() {
        Burrito.show();
    }
}