public class Main {
    public static void main(String[] args) {
        // Задание 1
        int dog = 7;
        byte cat = 1;
        short mouse = 3;
        long elephant = 110L;
        double sugarWeight = 4.5;
        float saltWeight = 1.5f;
        boolean dogIsAdult = dog > 10;
        char bar = 35;
        System.out.println(dogIsAdult);

        //Задание 2
        double boxer1 = 78.2;
        double boxer2 = 82.7;
        double weightOfAllBoxers = boxer1 + boxer2;
        double weightDifference = boxer2 - boxer1;
        System.out.println("Общий вес боксёров " + weightOfAllBoxers);
        System.out.println("Разница в весе боксёров " + weightDifference);

        //Задание 3
        int bananas = 5;
        int milk = 200;
        int icecream = 2;
        int eggs = 4;
        int weightproducts = bananas * 80 + milk / 100 * 105 + icecream * 100 + eggs *70;
        System.out.println ("Вес продуктов " + weightproducts + " грамм! ");
        float inKg = weightproducts / 1000;
        System.out.println("Вес в килограммах " + inKg + " кг");

        //Задание 4
        int inGrams = 7 * 1000;
        var Days1 = inGrams / 250;
        var Days2 = inGrams / 500;
        System.out.println ("При потере 250 грамм потребуется " + Days1 + " дней. ");
        System.out.println ("При потере 500 грамм потребуется " + Days2 + " дней. ");
        var meanDays = (Days1 + Days2) / 2;
        System.out.println ("Среднее значение " + meanDays + " дней.");

        //Задание 5
       int Masha = 67760;
       int Denis = 83690;
       int Kris = 76230;
       var NewMasha = Masha + Masha * 0.1;
       var NewDenis = Denis + Denis * 0.1;
       var NewKris = Kris + Kris * 0.1;
       var differenceMasha = NewMasha - Masha;
       var differenceDenis = NewDenis - Denis;
       var differenceKris = NewKris - Kris;
       System.out.print("Маша теперь получает " + NewMasha + " рублей.");
       System.out.println("Годовой доход вырос на " + differenceMasha + " рублей");
       System.out.print("Денис теперь получает " + NewDenis + " рублей.");
       System.out.println("Годовой доход вырос на " + differenceDenis + " рублей");
       System.out.print("Кристина теперь получает " + NewKris + " рублей.");
       System.out.println("Годовой доход вырос на " + differenceKris + " рублей");










    }
}