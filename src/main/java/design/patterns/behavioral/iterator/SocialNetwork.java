package design.patterns.behavioral.iterator;

public interface SocialNetwork
{
    ProfileIterator createFriendsIterator(int profileId);
    ProfileIterator createCoworkersIterator(int profileId);
}
