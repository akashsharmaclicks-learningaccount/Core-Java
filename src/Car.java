public class Car {
    float price;
    String fuel_type, colour, engine;
    int capacity;

    public void setPrice(float p) {
        price = p;
    }
    public  void setFuelType(String f) {
        fuel_type = f;
    }
    public  void setColour(String c) {
        colour = c;
    }
    public  void setEngine(String e) {
        engine = e;
    }
   public void setCapacity(int c) {
        capacity = c;
   }
   public float getPrice() {
        return price;
   }
   public String getFuelType() {
        return fuel_type;
   }
   public String getColour() {
        return colour;
   }
   public String getEngine() {
        return engine;
   }
   public int getCapacity() {
        return capacity;
   }
}
class SportsCar extends Car {
    String alarm, navigator, safeGuard;
    public void setAlarm(String sa) {
        alarm = sa;
    }
    public String getAlarm() {
        return alarm;
    }
    public void setNavigator(String sn) {
        navigator = sn;
    }
    public String getNavigator() {
        return navigator;
    }
    public void setSafeGuard(String sg) {
        safeGuard = sg;
}
    public String getSafeGuard() {
        return safeGuard;
}
}
class  Runner3{
    public static void main(String[] args) {
        SportsCar obj = new SportsCar();
        obj.setPrice(1.27f);
        obj.setFuelType("Diesel");
        obj.setColour("red");
        obj.setEngine("2993cc");
        obj.setCapacity(5);
        obj.setAlarm("Yes");
        obj.setNavigator("Yes");
        obj.setSafeGuard("yes");

        System.out.println("Car : Audi");
        System.out.println("Price : " + obj.getPrice());
        System.out.println("FuelType : " + obj.getFuelType());
        System.out.println("Colour : " + obj.getColour());
        System.out.println("Engine : " + obj.getEngine());
        System.out.println("Capacity : " + obj.getCapacity());
        System.out.println("Alarm : " + obj.getAlarm());
        System.out.println("Navigator : " + obj.getNavigator());
        System.out.println("Safe Guard : " + obj.getSafeGuard());
    }
}

