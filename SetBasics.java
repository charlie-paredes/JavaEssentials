import java.util.HashSet;
import java.util.Set;

public class SetBasics {
    public static void main(String[] args) {
    Set<Ball> balls = new HashSet<>();
    balls.add(new Ball("Blue"));
    balls.add(new Ball("Yellow"));
    balls.add(new Ball("Green"));
    balls.add(new Ball("Red"));
    balls.remove(new Ball("Red"));
        //removes any element containing "Red"
    balls.forEach(System.out::println);
        //each element of the balls object is printed randomly
    }
    static class Ball{
        String color;
        public Ball(String color){
            this.color = color;
        }
    }
}
