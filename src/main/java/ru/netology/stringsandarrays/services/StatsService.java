package ru.netology.stringsandarrays.services;

public class StatsService {

    public int sumAllSales(int[] sales) {
        int allSales = 0;
        for (long sale : sales) {
            allSales += sale;

        }
        return allSales;
    }

    public int averageSalesAmount(int[] sales) {

        int allSales = 0;
        int averageSalesMonth = 0;
        for (long sale : sales) {
            allSales += sale;

            averageSalesMonth = allSales / sales.length;

        }
        return averageSalesMonth;
    }

    public int monthNumberMaxSales(int[] sales) {

        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth;
    }

    public int monthNumberMinSales(int[] sales) {

        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth;
    }

    public int salesBelowAverage(int[] sales) {

        int numberMonths = 0;
        int allSales = 0;

        for (long sale : sales) {
            allSales += sale;
        }

        for (int averageSalesMonth : sales) {
            if (averageSalesMonth > averageSalesAmount(sales)) {
                numberMonths += 1;
            }
        }
        return numberMonths;
    }

    public int salesAboveAverage(int[] sales) {

        int numberMonths = 0;
        int allSales = 0;

        for (long sale : sales) {
            allSales += sale;
        }

        for (int averageSalesMonth : sales) {
            if (averageSalesMonth < averageSalesAmount(sales)) {
                numberMonths += 1;
            }
        }
        return numberMonths;
    }
}