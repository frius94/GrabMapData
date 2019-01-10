package poi;

import java.util.ArrayList;

public class Poi {
    private String name;
    private ArrayList<String> categories;
    private ArrayList<Classifications> classifications;

    public Poi(String name, ArrayList<String> categories, ArrayList<Classifications> classifications) {
        this.name = name;
        this.categories = categories;
        this.classifications = classifications;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getCategories() {
        return categories;
    }

    public void setCategories(ArrayList<String> categories) {
        this.categories = categories;
    }

    public ArrayList<Classifications> getClassifications() {
        return classifications;
    }

    public void setClassifications(ArrayList<Classifications> classifications) {
        this.classifications = classifications;
    }
}
