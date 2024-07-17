package ru.netology.JavaHomeWork7.service;

public class StatsService {
    public long sumSales(long[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = (int) (sum + sales[i]);
        }
        return sum;
    }

    public int averageNumber(long[] sales) {
        int average = 0;
        for (int i = 0; i < sales.length; i++) {
            average = (int) (average + sales[i]);
        }
        return average / 12;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int belowAverage(long[] sales) {
        int belowMonth = 0;
        int averageSum = averageNumber(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSum)
                belowMonth += 1;
        }
        return belowMonth;
    }
    public int aboveAverage(long[] sales) {
        int averageMonth = 0;
        int averageSum = averageNumber(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSum)
                averageMonth += 1;
        }
        return averageMonth;



    }
}

