package pl.pjatk.RentalService.film.model;

public class Movies {
    private Long id;
    private String name;
    private Category category;
    private boolean isAvailable = false;

    public Movies(long id, String name, Category category ) {
        this.id = id;
        this.name = name;
        this.category = category;
    }

    public Movies (long id, String name, Category category, boolean isAvailable){
        this.id = id;
        this.name = name;
        this.category = category;
        this.isAvailable = isAvailable;
    }

    public Movies(String name, Category category){
        this.name = name;
        this.category = category;
    }

    public Movies() {
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

}
