package au.edu.jcu.sp3406.guessinggame;

import java.util.Random;

public class Game {

    static int secretNum() {
        Random randomNum = new Random();
        return randomNum.nextInt(10);
    }

    static boolean check(int userNnm) {
        int secNum = secretNum();
        return secNum == userNnm;
    }
}