public class Main { public static void main(String[] args) {

        // Объявление переменных
        double ticketPrice = 1665; // стоимость билета
        int rublesPerMile = 20; // количество рублей для 1 мили
        int bonusMiles; // количество начисленных миль

        // Расчёт количества начисленных миль
        bonusMiles = (int) (ticketPrice / rublesPerMile);

        // Вывод результата на экран
        System.out.println("Начислено " + bonusMiles + " миль.");
    }
}

