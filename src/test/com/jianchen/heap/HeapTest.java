package com.jianchen.heap;

import org.junit.Test;

/**
 * @author: jian.cai@qunar.com
 * @Date: 14-8-27 Time: 下午6:56
 */
public class HeapTest {
    @Test
    public void testHeap() {
        Object obj = new Object();
        System.gc();
        System.out.println();
        obj = new Object();
        obj = new Object();
        System.gc();
        System.out.println();
    }
}
