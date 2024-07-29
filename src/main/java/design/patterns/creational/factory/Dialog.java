package design.patterns.creational.factory;

public abstract class Dialog
{
    abstract Button createButton();

    void render(){
        Button click = createButton();
        click.onClick();
        click.render();
    }
}
