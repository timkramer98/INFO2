import org.junit.Assert;
import org.junit.Test;


public class StringIteratorTest {

    @Test
    public void test1() {

        StringIterator.IterableString myString = StringIterator.makeIterableString("Hello World");

        String s1 = "";
        for (char c1: myString) {
            String s2 = "";
            for (char c2: myString) {
                s2 += c2;
            }
            Assert.assertEquals(s2,"Hello World");
            s1 += c1;
        }
        Assert.assertEquals(s1,"Hello World");

    }


}
