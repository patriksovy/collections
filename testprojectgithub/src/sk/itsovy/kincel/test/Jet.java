package sk.itsovy.kincel.test;

import java.util.ArrayList;
import java.util.List;

public class Jet {
    private String brand;
    private String model;
    private int year;
    private boolean jet;

    public Jet(String brand, String model, int year, boolean jet) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.jet = jet;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public boolean isJet() {
        return jet;
    }

    public String toString() {
        return brand + "," + model + "," + year + ", Jet: " + jet;
    }

    public static List<Jet> planes = new ArrayList<>();

    public static void main(String[] args) {
        Jet first = new Jet("Boeing", "747", 2000, true);
        Jet second = new Jet("Airbus", "A380", 2020, true);
        Jet third = new Jet("Cesna", "172", 2014, false);
        Jet fourth = new Jet("Antonov", "An-225", 2013, true);
        Jet fifth = new Jet("Northrop Grumman", "B-2 Spirit", 1997, true);

        planes.add(first);
        planes.add(second);
        planes.add(third);
        planes.add(fourth);
        planes.add(fifth);
        planes.add(new Jet("Boeing", "777", 2015, true));
        planes.add(new Jet("Boeing", "727", 2002, true));

        planes.forEach(i -> System.out.println(i));
        System.out.println();

        planes.stream().filter((temp) -> temp.getBrand() == "Boeing")
                .forEach(temp -> System.out.println(temp));
        System.out.println();

        planes.stream().filter((temp) -> temp.isJet() == false)
                .forEach(temp -> System.out.println(temp));
        System.out.println();
    }
}