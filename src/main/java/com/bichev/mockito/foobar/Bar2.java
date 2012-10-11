package com.bichev.mockito.foobar;

/**
 * Created with IntelliJ IDEA.
 * User: vbichev
 * Date: 10/9/12
 * Time: 12:20 PM
 * http://www.slideshare.net/nunafig/mockito-12079903
 */
public class Bar2 {
    private FooIF foo1;
    private FooIF foo2;

    public Bar2 (FooIF foo1, FooIF foo2){
        this.foo1 = foo1;
        this.foo2 = foo2;
    }

    public void bar (String parameter) {
        foo1.foo(parameter);
        foo2.foo(parameter);
    }
}
