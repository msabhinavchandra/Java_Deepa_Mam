public class PlayerRating {
    private int PlayerPosition;
    private String playerName;
    private float criticOneRating;
    private float criticTwoRating;
    private float criticThreeRating;
    private float averageRating;
    private char category;

    //constructor
    PlayerRating(int PlayerPosition,String playerName){
        this.PlayerPosition=PlayerPosition;
        this.playerName=playerName;
    }

    public void calculateAverageRating(float criticOneRating,float criticTwoRating)
    {
        this.averageRating=((float)(criticOneRating+criticTwoRating))/2.0f;

        if(this.averageRating>8)
        {

        }else if(this.averageRating>5 && this.averageRating<=8){

        }else if(this.averageRating>0 && this.averageRating<=5){

        }

    }

    public void calculateAverageRating(float criticOneRating,float criticTwoRating,float criticThreeRating)
    {
        this.averageRating=((float)(criticOneRating+criticTwoRating+criticThreeRating))/3.0f;
        
    }


    public void calculateCategory(){

        if(this.averageRating>8)
        {
            this.category='A';
        }else if(this.averageRating>5 && this.averageRating<=8){
            this.category='B';

        }else if(this.averageRating>0 && this.averageRating<=5){
            this.category='C';
        }

    }

    public void display(){
        System.out.println("the player name is "+this.playerName);
        System.out.println("the player position is "+this.PlayerPosition);
        System.out.println("the average rating is "+this.averageRating);
        System.out.println("the category is "+this.category);
    }

}
class Test{
    public static void main(String[] args) {
        PlayerRating Oscar=new PlayerRating(1, "Oscar");
        Oscar.calculateAverageRating(1,1,1);
        Oscar.calculateCategory();
        Oscar.display();
    }
}

// output:
// the player name is Oscar
// the player position is 1
// the average rating is 1.0
// the category is C