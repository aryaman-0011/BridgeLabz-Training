package com.annotationsandreflection.annotations.cacheresult;

class Calculator {

    @CacheResult
    public int slowSquare(int x) {

        // simulate expensive computation
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Computing square of " + x);
        return x * x;
    }
}
