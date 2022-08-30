package org.example.junkDealer;

public class Smartphone extends Product {

    protected String model;
    protected String manufacturer;

    public Smartphone(int id, String name, int value, String model, String manufacturer) {
        super(id, name, value);
        this.model = model;
        this.manufacturer = manufacturer;
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
