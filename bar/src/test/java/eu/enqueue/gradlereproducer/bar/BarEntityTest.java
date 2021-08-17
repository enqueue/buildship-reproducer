/*
 * Copyright (c) 2021 Riege Software. All rights reserved.
 * Use is subject to license terms.
 */
package eu.enqueue.gradlereproducer.bar;

import eu.enqueue.gradlereproducer.foo.BaseTestCase;

public class BarEntityTest extends BaseTestCase {

    public void testEntity() {
        BarEntity be = new BarEntity();
        be.setBaz("qux");
        assertEquals("qux", be.getBaz());
        System.out.println("The qux is good");
    }

}
