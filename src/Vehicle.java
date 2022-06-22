public class Vehicle {
   private String name;
   private String size;

   private int currentVelocity = 0;
   private int currentDirection = 0;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;

    }
    public void steer(int direction){
        this.currentDirection += direction;
        System.out.println("Vehicle.steer(): car in the direction of" + currentDirection + "degree");
    }
    public void move(int velocity, int direction){
        this.currentDirection = direction;
        this.currentVelocity = velocity;
        System.out.println(" Car moving in " + currentVelocity + " and "+ currentDirection + " Velocity");
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void  stop(){
        this.currentVelocity= 0;
    }
}
