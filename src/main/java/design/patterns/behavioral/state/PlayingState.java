package design.patterns.behavioral.state;

public class PlayingState extends State
{
    PlayingState(Player player)
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
        player.changeState(new ReadyState(player));
    }

    @Override
    void clickNext()
    {
        System.out.println("play next song after playing curret");
    }

    @Override
    void clickPrevious()
    {
        System.out.println("play previouss song before playing curret");
    }
}
