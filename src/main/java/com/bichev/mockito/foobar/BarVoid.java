package com.bichev.mockito.foobar;

/**
 * Created with IntelliJ IDEA.
 * User: vbichev
 * Date: 10/9/12
 * Time: 12:15 PM
 * To change this template use File | Settings | File Templates.
 */
public class BarVoid {
    private FooVoidIF foo;

    public BarVoid (FooVoidIF foo){
        this.foo = foo;
    }

    public  void bar (String parameter) {
        foo.foo(parameter);
    }
}
