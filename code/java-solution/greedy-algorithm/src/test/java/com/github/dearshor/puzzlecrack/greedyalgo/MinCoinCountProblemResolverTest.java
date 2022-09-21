package com.github.dearshor.puzzlecrack.greedyalgo;

import org.junit.Assert;
import org.junit.Test;

import static java.lang.System.Logger.Level.INFO;
import static org.junit.Assert.*;

public class MinCoinCountProblemResolverTest {

    private final System.Logger logger;

    private MinCoinCountProblemResolver resolver;

    public MinCoinCountProblemResolverTest() {
        this.resolver = new MinCoinCountProblemResolver();
        logger = System.getLogger("default.stdout");
    }

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @Test
    public void letUsDoIt() {
        int[] values = { 5, 1, 2, 10 }; // 硬币面值
        int total = 110; // 总价
        int minCoin = resolver.getMinCoinCountLoop(total, values, 0);

        minCoin =  (minCoin == Integer.MAX_VALUE) ? -1 : minCoin;
        logger.log(INFO, String.format("min coin count: %s", minCoin)); // 输出答案

        Assert.assertEquals(11, minCoin);
    }
}
