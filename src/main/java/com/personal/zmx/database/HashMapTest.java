package com.personal.zmx.database;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

/**
 * <p>HashMap测试</p>
 *
 * @author chaomeng
 * @version V1.0.0
 * @date 2021-1-3 17:02
 */
public class HashMapTest {

    @Test
    public void tableSizeForTest() {
        int n = 1 << 30;
        System.out.println(n);
        Scanner sc = new Scanner(System.in);
        while (true) {
            int i = sc.nextInt();
            int result = tableSizeFor(i);
            System.out.println("result = " + result);
        }
    }

    private int tableSizeFor(int cap) {
        int n = cap - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return (n < 0) ? 1 : (n >= 1 << 30) ? 1 << 30 : n + 1;
    }

}
