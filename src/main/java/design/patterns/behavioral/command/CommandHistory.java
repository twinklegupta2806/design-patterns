package design.patterns.behavioral.command;

import java.util.Stack;

public class CommandHistory
{
    Stack<Command> history = new Stack<>();

    void push(Command c){
        history.push(c);
    }

    Command pop(){
        return history.pop();
    }
}
