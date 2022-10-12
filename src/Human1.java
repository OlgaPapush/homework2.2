import java.util.Objects;

public class Human1 {

    public static String name;
    public static String town;
    public static int yearOfBirth;
    public static String job;

    public Human1(String name, String town, int yearOfBirth, String job) {
        this.name = name;
        this.town = town;
        this.yearOfBirth = yearOfBirth;
        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = Math.abs(yearOfBirth);
        }
        this.job = job;
    }

    public static String getName() {
        return name;
    }

    public static String getTown() {
        return town;
    }

    public static int getYearOfBirth() {
        return yearOfBirth;
    }

    public static String getJob() {
        return job;
    }

     Human1(String town, int yearOfBirth, String job) {
        name = "default";
        this.town = town;
        this.yearOfBirth = yearOfBirth;
        this.job = job;
    }

    Human1(String name, int yearOfBirth, String job) {
        this.name = name;
        town = "default";
        this.yearOfBirth = yearOfBirth;
        this.job = job;
    }

    Human1(String name, String town, int yearOfBirth){
            this.name = name;
            this.town = town;
            this.yearOfBirth = yearOfBirth;
            job = "default";
        }


    }


}

