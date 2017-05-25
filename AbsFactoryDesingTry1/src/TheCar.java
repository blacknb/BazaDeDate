/**
 * Created by Florin on 25.05.2017.
 */
public abstract class TheCar {
    String name;
    int length;
    int width;
    int enginePower;
    String color;

    public void setName(String neName){ this.name = neName; }
    public void setLength(int newLength){ this.length = newLength;}
    public void setWidth(int newWidth){ this.width = newWidth;}
    public void setEnginePower(int newEnginePower){ this.enginePower = newEnginePower; }
    public void setColor(String newColor){ this.color= newColor;}
    public TheCar(){

    }
    public void displayCar(){
        String outPutCar = this.name+". ";
        outPutCar +=  "Dimension: "+ Integer.toString(this.length)+" length, "+Integer.toString(this.width)+" width. And the engine power is "+Integer.toString(this.enginePower)+". Comes in "+this.color+" color.";
        System.out.println(outPutCar);
    }
}
