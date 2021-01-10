package three;

class Machine{
public void start()
{
System.out.println("Machine started");
}
public void video()
{
System.out.println("video taken");
}
}
class Camera extends Machine
{
public void start(){
System.out.println("camera started");
}
public void snap()
{
System.out.println("photo taken");
}
}
public class casting {

public static void main(String[] args) {
//Machine machine1=new Machine();
//Camera camera1=new Camera();
//machine1.start();
//camera1.start();
//camera1.snap();
//machine1.start();
// up casting is done with respect to method here subclass method is up casted by
//parent class
Machine machine2=new Camera();;
machine2.start();
//Down casting is done with respect to method here parent class method is
// downcasted by subclass method
//Machine machine3=new Camera();
//Camera camera2=(Camera)machine3;
//camera2.video();
//camera2.snap();

}

}


