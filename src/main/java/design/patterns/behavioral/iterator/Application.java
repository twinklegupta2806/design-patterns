package design.patterns.behavioral.iterator;

public class Application
{

    public static void main(String[] args){
        SocialNetwork socialNetwork = new Facebook();
        SocialSpammer socialSpammer = new SocialSpammer();

        FacebookIterator fbFriends = new FacebookIterator(socialNetwork,"aman", "friends");
        socialSpammer.send(fbFriends, " *** You are my friend *** ");

        FacebookIterator fbCoworkers = new FacebookIterator(socialNetwork, "aman", "coWorkers");
        socialSpammer.send(fbCoworkers, " *** You and me work in same company ***");
    }
}
