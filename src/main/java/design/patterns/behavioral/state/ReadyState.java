package design.patterns.behavioral.state;

public class ReadyState extends State
{
    ReadyState(Player player)
    {
        super(player);
    }

    @Override
    void clickLock()
    {
        player.changeState(new LockedState(player));
    }

    @Override
    void clickPlay()
    {
        player.changeState(new PlayingState(player));
    }

    @Override
    void clickNext()
    {
        System.out.println("play next song");
    }

    @Override
    void clickPrevious()
    {
        System.out.println("play previouss song");
    }
}
