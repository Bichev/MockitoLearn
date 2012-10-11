package com.bichev.mockito.oficial;

import java.util.LinkedList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.mockito.Mockito;

/**
 * Created with IntelliJ IDEA.
 * User: vbichev
 * Date: 10/11/12
 * Time: 11:50 AM
 * To change this template use File | Settings | File Templates.
 */
public class OficialTutorial {

    public void listVerification () {
        List mockList = mock(List.class);

        mockList.add("one");
        mockList.clear();

        verify(mockList).add("one");
        verify(mockList).clear();
    }

    public static void linkedListStubbing () {
        LinkedList mockLL = mock(LinkedList.class);

        when(mockLL.get(0)).thenReturn("first");
        when(mockLL.get(1)).thenThrow(new RuntimeException());

        System.out.println(mockLL.get(0));
        System.out.println(mockLL.get(1));
        System.out.println(mockLL.get(999));

        verify(mockLL).get(0);
    }

    public static void main (String ... args){
        linkedListStubbing();
    }
}
