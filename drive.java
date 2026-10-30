public class drive {

    private motor frontleft;
    private motor frontright;
    private motor backleft;
    private motor backright;

    public drive(){

        this.frontleft=new motor();
        this.frontright=new motor(true);
        this.backleft=new motor();
        this.backright=new motor(true);

    }
    public void move(double speed){

        this.frontleft.spin(speed);
        this.frontright.spin(speed);
        this.backleft.spin(speed);
        this.backright.spin(speed);

    }
}
