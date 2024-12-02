package org.example;

public class DiamondInnerAnonymousDemo {
    public static void main(String[] args) {
        System.out.println(new StringAppender<>() {
            @Override
            public String append(String a, String b) {
                return a + "-" + b;
            }
        }.append("hello", "world"));


        System.out.println(new StringAppender<>() {
            @Override
            public StringBuilder append(String a, String b) {
                return new StringBuilder(a).append("=").append(b);
            }
        }.append("liu", "youer"));


        //--------------
        new MyRunner<>("Hello").run();
        new MyRunner<>(11).run();
        new MyRunner<>(new DiamondInnerAnonymousDemo()).run();
    }


    /**
     * Generic type of Return
     * @param <T>
     */
    public abstract static class StringAppender<T> {
        public abstract T append(String a, String b);
    }


    /**
     * Generic type of Argument
     * @param <T>
     */
    public static class MyRunner<T> implements Runnable{
        private final T t;
        public MyRunner(T t){
            this.t = t;
        }
        @Override
        public void run() {
            System.out.println("t is type of " + t.getClass().getTypeName());
        }
    }
}
