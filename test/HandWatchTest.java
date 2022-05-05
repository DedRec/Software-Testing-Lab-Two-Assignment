import org.junit.Test;

import static org.junit.Assert.*;

public class HandWatchTest {

    @Test
    public void testModifyState() {
        HandWatch tester = new HandWatch();
        assertEquals("NORMAL TIME 2000-1-1 0:0", tester.modifyState("abadcaaaaa"));
    }

    @Test
    public void testModifyStateADUP1() {
        HandWatch tester = new HandWatch();
        assertEquals("UPDATE YEAR 2002-1-1 0:0", tester.modifyState("acaaaabb"));
    }

    @Test
    public void testModifyStateADUP2() {
        HandWatch tester = new HandWatch();
        assertEquals("ALARM CHIME 2001-5-4 3:2", tester.modifyState("aacbbabbbabbbabbbbababa"));
    }

    @Test
    public void testModifyStateS1() {
        HandWatch tester = new HandWatch();
        assertEquals("NORMAL TIME 2000-1-1 0:0", tester.modifyState(" "));
    }

    @Test
    public void testModifyStateE1() {
        HandWatch tester = new HandWatch();
        assertEquals("NORMAL DATE 2000-1-1 0:0", tester.modifyState("a"));
    }

    @Test
    public void testModifyStateE2() {
        HandWatch tester = new HandWatch();
        assertEquals("NORMAL TIME 2000-1-1 0:0", tester.modifyState("aa"));
    }

    @Test
    public void testModifyStateE3() {
        HandWatch tester = new HandWatch();
        assertEquals("ALARM ALARM 2000-1-1 0:0", tester.modifyState("b"));
    }

    @Test
    public void testModifyStateE4() {
        HandWatch tester = new HandWatch();
        assertEquals("ALARM CHIME 2000-1-1 0:0", tester.modifyState("ba"));
    }

    @Test
    public void testModifyStateE5() {
        HandWatch tester = new HandWatch();
        assertEquals("NORMAL TIME 2000-1-1 0:0", tester.modifyState("bad"));
    }

    @Test
    public void testModifyStateE6() {
        HandWatch tester = new HandWatch();
        assertEquals("UPDATE MIN 2000-1-1 0:0", tester.modifyState("c"));
    }

    @Test
    public void testModifyStateE7() {
        HandWatch tester = new HandWatch();
        assertEquals("NORMAL TIME 2000-1-1 0:0", tester.modifyState("cd"));
    }

    @Test
    public void testModifyStateE8() {
        HandWatch tester = new HandWatch();
        assertEquals("UPDATE HOUR 2000-1-1 0:0", tester.modifyState("ca"));
    }

    @Test
    public void testModifyStateE9() {
        HandWatch tester = new HandWatch();
        assertEquals("UPDATE DAY 2000-1-1 0:0", tester.modifyState("caa"));
    }

    @Test
    public void testModifyStateE10() {
        HandWatch tester = new HandWatch();
        assertEquals("UPDATE MONTH 2000-1-1 0:0", tester.modifyState("caaa"));
    }

    @Test
    public void testModifyStateE11() {
        HandWatch tester = new HandWatch();
        assertEquals("UPDATE YEAR 2000-1-1 0:0", tester.modifyState("caaaa"));
    }

    @Test
    public void testModifyStateE12() {
        HandWatch tester = new HandWatch();
        assertEquals("NORMAL TIME 2000-1-1 0:0", tester.modifyState("caaaaa"));
    }

    @Test
    public void testModifyStateE13() {
        HandWatch tester = new HandWatch();
        assertEquals("UPDATE MIN 2000-1-1 0:1", tester.modifyState("cb"));
    }

    @Test
    public void testModifyStateE14() {
        HandWatch tester = new HandWatch();
        assertEquals("UPDATE HOUR 2000-1-1 1:0", tester.modifyState("cab"));
    }

    @Test
    public void testModifyStateE15() {
        HandWatch tester = new HandWatch();
        assertEquals("UPDATE DAY 2000-1-2 0:0", tester.modifyState("caab"));
    }

    @Test
    public void testModifyStateE16() {
        HandWatch tester = new HandWatch();
        assertEquals("UPDATE MONTH 2000-2-1 0:0", tester.modifyState("caaab"));
    }

    @Test
    public void testModifyStateE17() {
        HandWatch tester = new HandWatch();
        assertEquals("UPDATE YEAR 2001-1-1 0:0", tester.modifyState("caaaab"));
    }

    @Test
    public void testIncrementm60() {
        HandWatch tester = new HandWatch();
        int actual = 0;
        for(int i = 0; i < 61; i++){
            actual+=1;
            if(actual>=60) actual%=60;
            assertEquals(actual,tester.incrementm60());
        }
    }

    @Test
    public void testIncrementh24() {
        HandWatch tester = new HandWatch();
        int actual = 0;
        for(int i = 0; i < 25; i++){
            actual+=1;
            if(actual>=24) actual%=24;
            assertEquals(actual,tester.incrementh24());
        }
    }

    @Test
    public void testIncrementD31() {
        HandWatch tester = new HandWatch();
        int actual = 1;
        for(int i = 0; i < 33; i++){
            actual+=1;
            if (actual>=32) actual = 1;
            if (actual == 0) actual = 1;
            assertEquals(actual,tester.incrementD31());
        }
    }

    @Test
    public void testIncrementM12() {
        HandWatch tester = new HandWatch();
        int actual = 1;
        for(int i = 0; i < 61; i++){
            actual+=1;
            if(actual>=13) actual=1;
            assertEquals(actual,tester.incrementM12());
        }
    }

    @Test
    public void testIncrementY100() {
        HandWatch tester = new HandWatch();
        int actual = 2000;
        for(int i = 0; i < 101; i++){
            actual+=1;
            if(actual>=2101) actual=2000;
            assertEquals(actual,tester.incrementY100());
        }
    }

    @Test
    public void output() {
        HandWatch tester = new HandWatch();
        HandWatch.State state = HandWatch.State.NORMAL;
        HandWatch.State1 state1 = HandWatch.State1.TIME;
        assertEquals("NORMAL TIME 2000-1-1 0:0", tester.Output(state, state1));
    }
}