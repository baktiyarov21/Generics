import org.junit.Test;

import static org.junit.Assert.*;

public class BoxTest {

    @Test
    public void testBox() {
        Box<String, Integer,Float> box = new Box<>("S",10,17.3f);
        Box<String, Integer,Float> box1 = new Box<>("K",10,12.7f);
        float result = box.getValue() + box1.getValue();
        assertEquals(20,result);
    }
}