package com.stas.WebTest;

import java.io.IOException;

/**
 * Created by stanislavz on 01-Aug-17.
 */
public class webTest {
    public static void main(String[] args) throws IOException {
        Runtime.getRuntime().exec(new String[]{"cmd", "/c","start chrome http://the-internet.herokuapp.com/"});

    }
}
