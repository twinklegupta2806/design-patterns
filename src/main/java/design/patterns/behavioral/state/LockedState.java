package design.patterns.behavioral.state;

public class LockedState extends State
{
    Player player;

    LockedState(Player player)
    {
        super(player);
    }

    @Override
    void clickLock()
    {
        if(player.playing)
            player.changeState(new PlayingState(player));
        else
            player.changeState(new ReadyState(player));
    }

    @Override
    void clickPlay()
    {

    }

    @Override
    void clickNext()
    {

    }

    @Override
    void clickPrevious()
    {

    }
}
