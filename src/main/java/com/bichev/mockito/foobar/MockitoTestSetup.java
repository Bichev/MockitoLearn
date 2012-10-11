package com.bichev.mockito.foobar;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;

/**
 * Created with IntelliJ IDEA.
 * User: vbichev
 * Date: 10/9/12
 * Time: 12:32 PM
 * To change this template use File | Settings | File Templates.
 */
public class MockitoTestSetup {
    private FooIF foo;
    private Bar bar;

    @Before
    public void init(){
        foo = mock(FooIF.class);
        bar = new Bar(foo);
    }

    @Test
    public void test(){
        bar.bar("asf");
        verify(foo).foo("asf");
    }
}
