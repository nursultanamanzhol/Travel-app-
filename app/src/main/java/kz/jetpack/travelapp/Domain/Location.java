package kz.jetpack.travelapp.Domain;

public class Location {
    private int id;
    private String Loc;

    public Location() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLoc() {
        return Loc;
    }

    public void setLoc(String loc) {
        Loc = loc;
    }

    public Location(String loc) {
        Loc = loc;
    }
}
