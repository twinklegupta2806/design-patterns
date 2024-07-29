package design.patterns.behavioral.iterator;

public class SocialSpammer
{
    void send(ProfileIterator iterator, String message){
        while(iterator.hasMore()){
            System.out.println(iterator.getNext() + " and "+ message);
        }
    }
}
