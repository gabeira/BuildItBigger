package com.udacity.java;

import java.util.Random;

public class Jokes {

    public String getJoke() {
        return "This is totally a funny joke number " + new Random().nextInt(99);
    }
}
