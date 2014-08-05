package com.feedhenry.ps.secondapp;
import android.app.Instrumentation;
import android.test.InstrumentationTestCase;

/**
 * Created by phayes on 05/08/2014.
 */
public class ExampleTest extends InstrumentationTestCase {
    public void test() throws Exception {
        final int expected = 5;
        final int reality = 5;
        assertEquals(expected, reality);
    }
}