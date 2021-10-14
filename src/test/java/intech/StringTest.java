package intech;

import org.junit.Test;

public class StringTest {



    @Test
    public void testStringFormat(){
        String aa="a";
        String bb="BB";
        String cc="CC";
        String url="api/%s/info/%s/as/%s";
        String format = String.format(url, aa, bb, cc);
        System.out.println(format);
    }
}
