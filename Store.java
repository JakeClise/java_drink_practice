public class Store {
    public static void main(String[] args){
        Drink myDrink = new Drink("Vanilla Cold Brew", 4.99, 20);
        String output = String.format("This is our %s. It costs $%s and is %s ounces."
        ,myDrink.getName(), myDrink.getPrice(), myDrink.getOunces());
        System.out.println(output);

        Drink myNewDrink = new Drink("Frappe", 3.49, 12);
        String newOutput = String.format("You have ordered our %s. It costs $%s and is %s ounces.",
        myNewDrink.getName(), myNewDrink.getPrice(), myNewDrink.getOunces());
        System.out.println(newOutput);

        Drink hotDrink = new Drink("Pike", 3.99, 12);
        String pikeOutput = String.format("Thanks for ordering a %s. Your total is $%s and it is %s ounces", 
        hotDrink.getName(), hotDrink.getPrice(), hotDrink.getOunces());
        System.out.println(pikeOutput);

        Drink hotChocolate = new Drink("Hot Chocolate", 2.50, 30);
        String hotChocolateOutput = String.format("You've ordered a %s. The cost is $%s and it is %s ounces", 
        hotChocolate.getName(), hotChocolate.getPrice(), hotChocolate.getOunces());
        System.out.println(hotChocolateOutput);

        Drink pepperMintMocha = new Drink("PepperMint Mocha", 6.75, 8);
        String pepperMintMochaOutput = String.format("Thanks for your order. Your %s costs $%s and contains %s ounces.",
        pepperMintMocha.getName(), pepperMintMocha.getPrice(), pepperMintMocha.getOunces());
        System.out.println(pepperMintMochaOutput);
    }
}