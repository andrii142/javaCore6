package module4.zoo;

/**
 * Created by citsym on 16.02.17.
 */
public abstract class Animal {


    private String name = "";
    private String foodName = "food";

    public void feed(){
        System.out.println(getClass().getSimpleName() + " "+ name + " feeds with " + foodName);
    };

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
