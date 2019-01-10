package location;

import java.util.ArrayList;
import tomtom.*;

public class Results {
    private String type;
    private String id;
    private double score;
    private Address address;
    private Position position;
    private Viewport viewport;
    private ArrayList<EntryPoints> entryPoints;

    public Results(String type, String id, double score, Address address, Position position, Viewport viewport, ArrayList<EntryPoints> entryPoints) {
        this.type = type;
        this.id = id;
        this.score = score;
        this.address = address;
        this.position = position;
        this.viewport = viewport;
        this.entryPoints = entryPoints;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Viewport getViewport() {
        return viewport;
    }

    public void setViewport(Viewport viewport) {
        this.viewport = viewport;
    }

    public ArrayList<EntryPoints> getEntryPoints() {
        return entryPoints;
    }

    public void setEntryPoints(ArrayList<EntryPoints> entryPoints) {
        this.entryPoints = entryPoints;
    }
}
