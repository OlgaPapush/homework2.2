public class car {

    public static String brand;
    public static String model;
    public static float engineVolume;
    public static String color;
    public static String productionCountry;
    public static  int productionYear;

    public  car (String brand, String model, String productionCountry, String color, float engineVolume, int productionYear) {
        this.brand = brand;
        this.model = model;
        this.productionCountry = productionCountry;
        this.engineVolume = engineVolume;
        this.color = color;
        this.productionYear = productionYear;
    }
      car ( String color, float engineVolume, int productionYear) {

        this.engineVolume = engineVolume;
        if( engineVolume == null){
            System.out.println("1.5");
        }
        this.color = color;
        if (color == null) {
            System.out.println("белый");
        }

        this.productionYear = productionYear;
        if (productionYear == null) {
            System.out.println("2000");
        }
    }
     car(String brand, String model,  String color, float engineVolume, int productionYear) {
        this.brand = brand;
        this.model = model;
        productionCountry =  "default";
        this.engineVolume = engineVolume;
        this.color = color;
        this.productionYear = productionYear;
    }
    car(String brand,  String productionCountry, String color, float engineVolume, int productionYear) {
        this.brand = brand;
        model = "default";
        this.productionCountry = productionCountry;
        this.engineVolume = engineVolume;
        this.color = color;
        this.productionYear = productionYear;
    }
     car( String model, String productionCountry, String color, float engineVolume, int productionYear) {
        brand = "default";
        this.model = model;
        this.productionCountry = productionCountry;
        this.engineVolume = engineVolume;
        this.color = color;
        this.productionYear = productionYear;
    }

    public static String getBrand() { return brand;    }

    public static String getModel() {  return model;    }

    public static float getEngineVolume() {   return engineVolume;    }

    public static String getColor() { return color;    }

    public static String getProductionCountry() {  return productionCountry;    }

    public static int getProductionYear() {  return productionYear;    }


}

