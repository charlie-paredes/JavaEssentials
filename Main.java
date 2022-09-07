//INHERITANCE, POLYMORPHISM
public class Main {
    public static void main(String[] args){
        Car car = new Car();
            /*Creates an object of the Car class*/
        car.go();
            /*calls the go method of the Car class. the go method is actually
            * found in Vehicle, but Car is able to use it because it inherits from Vehicle*/
        Bicycle bike = new Bicycle();
        bike.stop();

        System.out.println(car.doors);
        System.out.println(bike.pedals);
            /*car.doors calls the doors variable in the Car class
            * bike.pedals calls the pedals variable in the Bicycle class*/
        car.takesGas();
        bike.takesGas();
            /*Polymorphism is when you override a method in the parent class, in the child class.
            * By doing this, you're able to have a method do different things, depending on
            * which child class you're making an object of. */
    }
}
