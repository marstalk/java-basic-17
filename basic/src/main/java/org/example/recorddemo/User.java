package org.example.recorddemo;

import java.math.BigDecimal;
import java.util.Objects;

public record User(String name, Addr addr, Card card) {
}

record Addr(String province, String city) {
}

class Card {
    String no;
    BigDecimal amount;

//    @Override
//    public boolean equals(Object obj) {
//        if (obj instanceof Card card) {
//            return this.no.equals(card.no)
//                    && this.amount.equals(card.amount);
//        } else {
//            return false;
//        }
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return Objects.equals(no, card.no) && Objects.equals(amount, card.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(no, amount);
    }
}
