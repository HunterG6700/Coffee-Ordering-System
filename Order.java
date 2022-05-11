/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author almiscovich
 */
public class Order {
    Drink baseDrink;
    Drink[] dessert = new Drink[4];
    
    public void setDessert(int index, Drink item){
        dessert[index] = item;
    }
    public Drink getBaseDrink() {
        return baseDrink;
    }

    public void setBaseDrink(Drink baseDrink) {
        this.baseDrink = baseDrink;
    }
    
    public double getDessertCost(int index){
        double cost = 0;
        for(int i = 0; i < index; i++){
            cost = cost + dessert[i].cost();
        }
        return cost;
    }
    public double getDessertTax(int index){
        double cost = 0;
        double tax = 0;
        for(int i = 0; i < index; i++){
            cost = cost + dessert[i].cost();
        }
        tax = cost * 0.06;
        return tax;
    }
    public String getDescription(int index){
        String description = "";
        for(int i = 0; i < index; i++){
            description = description + dessert[i].type() + " ";
        }
        return description;
    }
}
