import processing.core.PApplet;

public class Ball extends PApplet{

public static final int width = 648;
    public static final int height = 488;

    public  static final int diameter = 10;
    public  int x_axis ;

    public   int y_axis ;
    public  int speed;

    public static Ball[] four_Balls= new Ball[4];

     public Ball( int speed){
        this.x_axis=0;
        this.speed=speed;

    }
    public Ball(){

    }


 @Override
    public void settings() {
        super.settings();
        size(width,height);
    }

    @Override
    public void draw() {

        for(Ball ball_no : four_Balls){
            ball_no.x_axis= cal_width(ball_no);
            ball_no.y_axis=cal_hieght(ball_no);
            ellipse(ball_no.x_axis,ball_no.y_axis,ball_no.diameter,ball_no.diameter);
        }
    }

    private int cal_width(Ball ball) {
        ball.x_axis+=ball.speed;
        return ball.x_axis;
    }

    private int cal_hieght(Ball ball) {
        ball.y_axis=ball.speed*(height/5);
        return ball.y_axis;
    }

    public static void main(String[] args) {
        PApplet.main("Ball",args);
        for(int i=0;i<4;i++){
            Ball ball = new Ball(i+1);
            four_Balls[i]=ball;
        }
    }

}