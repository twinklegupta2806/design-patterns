package design.patterns.behavioral.state;

public class Player
{
    State state;
    boolean playing;

    Player(){
        this.state = new ReadyState(this);
    }

    void changeState(State state){
        this.state = state;
    }
}
