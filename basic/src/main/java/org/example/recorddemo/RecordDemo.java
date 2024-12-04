package org.example.recorddemo;

public class RecordDemo {
    public static void main(String[] args) {
        User user = new User("liuyouer", new Addr("fujian", "xiamen"), new Card());

        //toString(): User[name=liuyouer, addr=Addr[province=fujian, city=xiamen], card=org.example.recorddemo.Card@2e817b38]
        System.out.println(user);

        //equals: true
        User user2 = new User("liuyouer", new Addr("fujian", "xiamen"), new Card());
        System.out.println(user.equals(user2));

        //equals: false
        User user3 = new User("liuyouer-copy", new Addr("fujian", "xiamen"), new Card());
        System.out.println(user.equals(user3));

        // immutable
        // no setter method

    }
}
