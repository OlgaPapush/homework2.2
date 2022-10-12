public class Main {
    public static void main(String[] args) {

        Human1 maxim1 = new Human1("Максим", "Минск", 1987, "бренд-менеджер");
        Human1 anna1 = new Human1("Анна", "Москва", 1993, "методист");
        Human1 katya1 = new Human1("Катя", "Калиниград", 1994, "продакт-менеджер");
        Human1 artem1 = new Human1("Артем", "Москва", 1995, "директор по развитию безнеса");
        System.out.println("Привет! Меня зовут" + " " + maxim1.getName() + "." + "Я из города" + " " + maxim1.getTown() + "." + "Я родился в" + " " + maxim1.getYearOfBirth() + ". Я работаю на должности" + " " + maxim1.getJob() + ". Будем знакомы!");
        System.out.println("Привет! Меня зовут" + " " + anna1.getName() + "." + "Я из города" + " " + anna1.getTown() + "." + "Я родился в" + " " + anna1.getYearOfBirth() + ". Я работаю на должности" + " " + anna1.getJob() + ". Будем знакомы!");
        System.out.println("Привет! Меня зовут" + " " + katya1.getName() + "." + "Я из города" + " " + katya1.getTown() + "." + "Я родился в" + " " + katya1.getYearOfBirth() + ". Я работаю на должности" + " " + katya1.getJob() + ". Будем знакомы!");
        System.out.println("Привет! Меня зовут" + " " + artem1.getName() + "." + "Я из города" + " " + artem1.getTown() + "." + "Я родился в" + " " + artem1.getYearOfBirth() + ". Я работаю на должности" + " " + artem1.getJob() + ". Будем знакомы!");


        car lada = new car("Lada", "Granta", "Россия", "желтый", 1.7f, 2015);
        car audi = new car("Audi", "50L TDI", "Германия", "черный", 3.0f, 2020);
        car bmw = new car("BMW", "Z8", "Германия", "черный", 3.0f, 2018);
        car kia = new car("Kia", "Sportage", "Южная Корея", "красный", 2.4f, 2018);
        car hyndai = new car("Hundai", "Avante", "Южная Корея", "оранжевый", 1.6f, 2016);
        System.out.println(lada.getBrand() + " " + lada.getModel() + ", " + lada.getProductionCountry() + " - год выпуска," + "сборка - " + lada.getProductionCountry() + ",цвет - " + lada.getColor() + " , - объем двигателя " + lada.getEngineVolume());
        System.out.println(audi.getBrand() + " " + audi.getModel() + ", " + audi.getProductionCountry() + " - год выпуска," + "сборка - " + audi.getProductionCountry() + ",цвет - " + audi.getColor() + " , - объем двигателя " + audi.getEngineVolume());
        System.out.println(bmw.getBrand() + " " + bmw.getModel() + ", " + bmw.getProductionCountry() + " - год выпуска," + "сборка - " + bmw.getProductionCountry() + ",цвет - " + bmw.getColor() + " , - объем двигателя " + bmw.getEngineVolume());
        System.out.println(kia.getBrand() + " " + kia.getModel() + ", " + kia.getProductionCountry() + " - год выпуска," + "сборка - " + kia.getProductionCountry() + ",цвет - " + kia.getColor() + " , - объем двигателя " + kia.getEngineVolume());
        System.out.println(hyndai.getBrand() + " " + hyndai.getModel() + ", " + hyndai.getProductionCountry() + " - год выпуска," + "сборка - " + hyndai.getProductionCountry() + ",цвет - " + hyndai.getColor() + " , - объем двигателя " + hyndai.getEngineVolume());

    }


}