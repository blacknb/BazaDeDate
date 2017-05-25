/**
 * Created by Florin on 25.05.2017.
 */
public class Engineer {
    private TheCar newCar;
    public Engineer(){
    }
    public void orderCar(String marca){
        switch (marca){
            case "Ferrari" : FerrariFactory theFactory = new FerrariFactory();
                            theFactory.buildCar();
                                newCar = theFactory.getCar();
        }
    }
    public void showTheCar(){
        this.newCar.displayCar();
    }
    public static void main(String[] args){
        Engineer engineer = new Engineer();
        engineer.orderCar("Ferrari");
        engineer.showTheCar();
    }
}
