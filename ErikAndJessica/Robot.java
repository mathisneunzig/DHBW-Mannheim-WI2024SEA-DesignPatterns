package ErikAndJessica;

public class Robot implements Prototype<Robot>{
       
    String color;
    double height;
    Type type;
    boolean state;
    String[] tasks;

    public Robot(String color, double height, Type type, boolean state, String[] tasks){
        this.color = color;
        this.height = height;
        this.type = type;
        this.state = state;
        this.tasks = tasks;
    }

    public void changeState(){
        this.state = !this.state;
    }

    public void speak(){
        System.out.println("I am a robot and my type is: "+ this.type.toString().toLowerCase());
        System.out.print("My task list is: ");
        for(int i = 0; i<tasks.length; i++) {
            System.out.print(tasks[i]);
            if(i<tasks.length-1){
                System.out.print(", ");
            } else {
                System.out.print(".");
            }
        }
        System.out.println();
    }

    @Override
    public Robot clone(){
        return new Robot(this.color, this.height,this.type, this.state, this.tasks);
    }

    
}
