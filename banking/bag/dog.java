package bag;

public class dog {
    private String name;
    private String breed;
    public dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
        public void setBreed(String breed){
        this.breed = breed;
    }
    public String getBreed() {
        return breed;
    }
}