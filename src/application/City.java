package application;

public class City {

    private String name;
    private int bortleLevel;
    private String description;

    public City(String name, int bortleLevel, String description) {
        this.name = name;
        this.bortleLevel = bortleLevel;
        this.description = description;
    }

    public String getName() { return name; }
    public int getBortleLevel() { return bortleLevel; }
    public String getDescription() { return description; }

    @Override
    public String toString() { return name; }  // For ComboBox display
}