package eu.enqueue.gradlereproducer.foo;

import junit.framework.TestCase;

public class BaseTestCase extends TestCase {

    private String foo;

    @Override
    public void setUp() {
        System.out.println("Setting up the foo");
        foo = "bar";
    }

    public void testFoo() {
        assertEquals("bar", foo);
    }

    protected String getFoo() {
        return foo;
    }

}