package com.sda.threads;

public class Main {

    public static void main(String[] args) throws InterruptedException {
//        sleepThread();
//        countdown();

        Thread core=new Core1();
        core.start();

        Core2 core2=new Core2();
        core2.run();

    }

    private static void countdown() throws InterruptedException {
        for (int i = 5; i >= 0; i--) {
            System.out.println("Bomba explodeaza in: " + i + " secunde");
            Thread.sleep(1000);
        }
        System.out.println("Allahu akbar!");
    }

    private static void sleepThread() throws InterruptedException {
        System.out.println("Incep executie thread");

        //oprim executie pt 1 secunda (=1000milisecunde)
        Thread.sleep(1000);
        System.out.println("Inca execut");
        Thread.sleep(1000);


        System.out.println("opresc executie");
    }
}
