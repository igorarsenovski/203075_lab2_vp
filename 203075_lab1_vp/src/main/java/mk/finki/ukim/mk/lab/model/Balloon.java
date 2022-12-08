package mk.finki.ukim.mk.lab.model;

public class Balloon {
    private String name;
    private String description;
    private Long id;
    private Manufacturer manf;

    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
