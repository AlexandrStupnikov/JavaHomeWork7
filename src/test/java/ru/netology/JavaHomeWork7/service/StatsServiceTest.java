package ru.netology.JavaHomeWork7.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StatsServiceTest {

    @Test
    public void statsSumSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum = 180;
        int actual = service.sumSales(sales);
        Assertions.assertEquals(expectedSum, actual);
    }

    @Test
    public void averageNumberOfSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAverage = 15;
        long actual = service.averageNumber(sales);
        Assertions.assertEquals(expectedAverage, actual);
    }

    @Test
    public void maxSalesOrder() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMaxSales = 8;
        int actual = service.maxSales(sales);
        Assertions.assertEquals(expectedMaxSales, actual);
    }

    @Test
    public void minSalesOrder() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMinSales = 9;
        int actual = service.minSales(sales);
        Assertions.assertEquals(expectedMinSales, actual);
    }

    @Test
    public void belowAverageMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedBelowAverage = 5;
        int actual = service.belowAverage(sales);
        Assertions.assertEquals(expectedBelowAverage, actual);
    }

    @Test
    public void aboveAverageMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAboveAverage = 5;
        int actual = service.aboveAverage(sales);
        Assertions.assertEquals(expectedAboveAverage, actual);
    }
}
