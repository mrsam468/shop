package org.example;

import junit.framework.TestCase;

public class managerTest extends TestCase {

    public void testResume() {
        manager man = new manager();

        assertEquals("i will be resuming work everyday by 6am", man.resume());
    }



    public void testGetcashier() {
        manager man = new manager();
        man.setcashier("james");
        String manage = man.getcashier();
        assertEquals("james you are employed as the new cashier",manage);
    }

}