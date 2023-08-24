package ru.netology.stats;

public class StatsService {


        // Сумма всех продаж
        public int sumSales(long[] sales) {
            int sumSalesMonths = 0;

            for (int i = 0; i < sales.length; i++) {
                sumSalesMonths += sales[i]; // сумма всех продаж
            }
            return sumSalesMonths;
        }

        // Средняя величина продаж в месяц
        public int averageSales(long[] sales) {
            int sumSalesMonths = sumSales(sales); // вызывает метод суммы всех продаж
            int averageSalesMonths = sumSalesMonths / sales.length; // среднее значение продаж;
            return averageSalesMonths;
        }

        // Месяц с максимальными продажами
        public int maxSales(long[] sales) {
            int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

            for (int i = 0; i < sales.length; i++) {
                if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                    maxMonth = i; // запомним его как максимальный
                }
            }
            return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
        }

        // Месяц с минимальными продажами
        public int minSales(long[] sales) {
            int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

            for (int i = 0; i < sales.length; i++) {
                if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                    minMonth = i; // запомним его как минимальный
                }
            }
            return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
        }

        // Количество месяцев, в которых продажи были выше среднего
        public int countMonthsHigherAverageSales(long[] sales) {
            int averageSalesMonths = averageSales(sales); // вызывает метод расчета среднего значения
            int countMonths = 0;

            for (int i = 0; i < sales.length; i++) {
                if (sales[i] > averageSalesMonths) {
                    countMonths += 1; // увеличения счетчика месяцев
                }
            }
            return countMonths;
        }

        // Количество месяцев, в которых продажи были ниже среднего
        public int countMonthsLowerAverageSales(long[] sales) {
            int averageSalesMonths = averageSales(sales); // вызывает метод расчета среднего значения
            int countMonths = 0;

            for (int i = 0; i < sales.length; i++) {
                if (sales[i] < averageSalesMonths) {
                    countMonths += 1; // увеличения счетчика месяцев
                }
            }
            return countMonths;
        }

    }

