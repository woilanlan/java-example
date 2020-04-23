package top.woilanlan;

import org.junit.Test;

/**
 * AllTest
 */
public class AllTest {

    @Test
    public void testIfElse() {
        IfElse e = new IfElse();
        e.show();
    }

    @Test
    public void testWhile() {
        WhileTest w = new WhileTest();
        while (w.condition()) {
            System.out.println("Inside 'while'");
        }
        System.out.println("Exited 'while'");
    }

    @Test
    public void testFor() {
        ListCharacters l = new ListCharacters();
        l.show();
    }

    @Test
    public void testFor2() {
        ListCharacters l = new ListCharacters();
        l.commaOperator();
    }

    @Test
    public void testForeach() {
        ListCharacters l = new ListCharacters();
        l.foreachFloat();
    }

    @Test
    public void testForeach2() {
        ListCharacters l = new ListCharacters();
        l.foreachString();
    }
    
    @Test
    public void testBreakAndContinue(){
        BreakAndContinue b = new BreakAndContinue();
        b.shwo();
    }

    @Test
    public void testLabeledFor(){
        LabeledFor l = new LabeledFor();
        l.show();
    }

    @Test
    public void testLabeledWhile(){
        LabeledWhile l = new LabeledWhile();
        l.show();
    }

    @Test
    public void testSwitch(){
        VowelsAndConsonants v = new VowelsAndConsonants();
        v.show();
    }
}