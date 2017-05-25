import java.util.Scanner;

/**
 * Created by Florin on 25.05.2017.
 */
public class FerrariFactory extends FactoryClass {
    @Override
    public void buildCar(){
        Scanner in = new Scanner(System.in);
        System.out.println("Choose your car type 1.Family 2.Racing 3.Sport");
        if(in.hasNextLine()){
            switch (in.nextInt()){
                case 1: theCar = new FerrariFamiliy();
                        break;
                case 2: theCar = new FerrariRacing();
                        break;
                case 3: theCar = new FerariSport();

                default: if(theCar==null){
                    System.out.println("No car has been created. Please choose a valid option.");
                }
            }
        }
    }
    public TheCar getCar(){ return theCar; }
}
