package com.bichev.mockito.wikiexample;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

import com.bichev.mockito.wikiexample.HelloApplication.HelloAction;
import com.bichev.mockito.wikiexample.HelloApplication.HelloActionImpl;
import com.bichev.mockito.wikiexample.HelloApplication.HelloSource;
import com.bichev.mockito.wikiexample.HelloApplication.HelloSourceImpl;

public class HelloActionIntegrationTest {
    HelloAction helloAction;
    HelloSource helloSource;
    Appendable helloWriterMock;

    @Before
    public void setUp() {
        helloSource = new HelloSourceImpl("welcome", " says ");
        helloWriterMock = mock(Appendable.class);
        helloAction = new HelloActionImpl(helloSource, helloWriterMock);
    }

    @Test
    public void testSayHello() throws Exception {
        when(helloWriterMock.append(any(String.class))).thenReturn(helloWriterMock);

        helloAction.sayHello("integrationTest", "universe");

        verify(helloWriterMock, times(2)).append(any(String.class));
        verify(helloWriterMock, times(1)).append(eq("integrationTest says "));
        verify(helloWriterMock, times(1)).append(eq("welcome universe"));
    }
}