package com.bichev.mockito.foobar;


/**
 * Created with IntelliJ IDEA.
 * User: vbichev
 * Date: 10/9/12
 * Time: 2:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class DenisTask {
    private static final String CLASS_NAME = "asdf";

    static class MyException extends Exception{
        public MyException(){}
    }

    public static void exceptionHandler () {
//        try{
//            switch (CLASS_NAME)   {
//                case "asdf":
//                    break;
//                 default: break;
//            }
//            while (true) {
//                throw new MyException();
//            }
//        }   finally {
//                System.out.println("finally");
//        }
//        do {
//            try {
//                if (true)
//                    return new MyException();
//                    break;
//            }finally {
//                System.out.println("finally");
//                return new MyException();
//            }
//        } while (false);
    }

    public static Exception myReturnException () {
        try {
            System.out.println("try");
            return new Exception();
        } finally {
            System.out.println("finally");
            return new Exception();
        }
    }

    public static void runtimeWrapper (){
        //wrap with a checked exception with an unchecked one.
        throw new RuntimeException(new Exception("WTF?"));
    }

//    public static void unsafeMethod() {
//        //throw a checked exception without adding a "throws"
//        getUnsafe().throwException(new IOException());
//    }

//    private static Unsafe getUnsafe() {
//        try {
//            Field field = Unsafe.class.getDeclaredField("theUnsafe");
//            field.setAccessible(true);
//            return (Unsafe) field.get(null);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }

    public static void myExceptionGenerator (){
        label: try {
//            if (true) throw new Exception();
        }   finally {
                break label;
//            throw new Exception();
        }
    }


     public static void main (String ... args) {
         myReturnException();
         runtimeWrapper();
//         unsafeMethod();
    }
}
