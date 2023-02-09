public class Drink {
    private String name; 
    private Double price;
    private Integer numberOfOunces;

    public Drink(String name, Double price, Integer numberOfOunces){
        this.name = name;
        this.price = price;
        this.numberOfOunces = numberOfOunces;
    }
    public String getName(){
        return name;
    }
    public Double getPrice(){
        return price;
    }
    public Integer getOunces(){
        return numberOfOunces;
    }
}