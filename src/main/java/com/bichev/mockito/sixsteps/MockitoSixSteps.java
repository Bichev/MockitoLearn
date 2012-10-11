package com.bichev.mockito.sixsteps;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.junit.Test;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Iterator;

import static org.mockito.Matchers.anyInt;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * Created with IntelliJ IDEA.
 * User: vbichev
 * Date: 10/10/12
 * Time: 10:40 AM
 * To change this template use File | Settings | File Templates.
 */
public class MockitoSixSteps {

    @Test
    public void iteratorWillReturnHW () {
        Iterator i = mock(Iterator.class);
        when(i.next()).thenReturn("Hello").thenReturn("World");

        String result = i.next() + " " + i.next();

        assertEquals("Hello World", result);
    }

    @Test
    public void withArguments(){
        Comparable c = mock(Comparable.class);
        when(c.compareTo("Test")).thenReturn(1);
        assertEquals(1, c.compareTo("Test"));
    }

    @Test
    public void withUnspecArgs(){
        Comparable c = mock(Comparable.class);
        when(c.compareTo(anyInt())).thenReturn(-1);
        assertEquals(-1, c.compareTo(5));
    }

    @Test(expected = IOException.class)
    public void OutputStreamWriterMethod() throws IOException {
        OutputStream mockObject = mock(OutputStream.class);
        OutputStreamWriter osw = new OutputStreamWriter(mockObject);
        doThrow(new IOException()).when(mockObject).close();
        osw.close();
        verify(mockObject).close();
    }

    @Test
    public void OutputStreamWriterBufferMethod () throws IOException {
        OutputStream mockObject = mock(OutputStream.class);
        OutputStreamWriter osw = new OutputStreamWriter(mockObject);
        osw.write('a');
        osw.flush();

        BaseMatcher arrayStartingWithA = new BaseMatcher() {
            @Override
            public boolean matches(Object o) {
                byte[] actual = (byte[]) o;
                return actual[0]=='a';
            }

            @Override
            public void describeTo(Description description) {
                //To change body of implemented methods use File | Settings | File Templates.
            }
        };

//        verify(mockObject).write(argThat(arrayStartingWithA), eq(0), eq(1));
    }


}
