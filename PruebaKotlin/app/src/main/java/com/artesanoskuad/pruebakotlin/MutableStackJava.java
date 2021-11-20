package com.artesanoskuad.pruebakotlin;

import java.util.List;
import java.util.Random;

public class MutableStackJava<E> {

    private List<E> items;

    public MutableStackJava(List<E> items) {
        this.items = items;
    }

    public E randomObject(){
        Random randomInt = new Random();
        int maxValue = items.size();
        return items.get(randomInt.nextInt(maxValue));
    }

}
