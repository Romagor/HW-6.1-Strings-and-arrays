package ru.netology.stringsandarrays.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldShowAmount() {
        StatsService service = new StatsService();

        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedAmount = 180;

        long actualAmount = service.sumAllSales(sales);

        Assertions.assertEquals(expectedAmount, actualAmount);
    }

    @Test
    public void shouldShowAverageAmountSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedAverageAmountSales = 15;

        long actualAverageAmountSales = service.averageSalesAmount(sales);

        Assertions.assertEquals(expectedAverageAmountSales, actualAverageAmountSales);
    }

    @Test
    public void shouldShowNumberMaxSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedNumber = 7;

        long actualNumber = service.monthNumberMaxSales(sales);

        Assertions.assertEquals(expectedNumber, actualNumber);
    }

    @Test
    public void shouldShowNumberMinSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedNumber = 8;

        long actualNumber = service.monthNumberMinSales(sales);

        Assertions.assertEquals(expectedNumber, actualNumber);
    }
    @Test
    public void shouldShowNumberMonthsBelowAverage() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedNumber = 5;

        long actualNumber = service.salesBelowAverage(sales);

        Assertions.assertEquals(expectedNumber, actualNumber);
    }

    @Test
    public void shouldShowNumberMonthsAboveAverage() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedNumber = 5;

        long actualNumber = service.salesAboveAverage(sales);

        Assertions.assertEquals(expectedNumber, actualNumber);
    }

}
