package com.bichev.mockito.foobar;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.verify;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * Created with IntelliJ IDEA.
 * User: vbichev
 * Date: 10/9/12
 * Time: 12:27 PM
 * To change this template use File | Settings | File Templates.
 */
@RunWith(MockitoJUnitRunner.class)
public class MockitoTestRunner {
    @Mock
    private FooIF foo;

    @InjectMocks
    private Bar bar = new Bar(null);

    @Test
    public void test(){
        bar.bar("asf");
        verify(foo).foo("asf");
    }
}
