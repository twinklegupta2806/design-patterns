package design.patterns.behavioral.state;

public abstract class State
{
    Player player;

    State(Player player){
        this.player = player;
    }

    abstract void clickLock();

    abstract void clickPlay();

    abstract void clickNext();

    abstract void clickPrevious();
}
