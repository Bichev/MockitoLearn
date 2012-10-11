package com.bichev.mockito.foobar;

/**
 * Created with IntelliJ IDEA.
 * User: vbichev
 * Date: 10/9/12
 * Time: 12:11 PM
 * http://www.slideshare.net/nunafig/mockito-12079903
 */


public class Bar {
    private FooIF foo;

    public Bar (FooIF foo){
        this.foo = foo;
    }

    public String bar (String parameter) {
        return foo.foo(parameter);
    }
}
