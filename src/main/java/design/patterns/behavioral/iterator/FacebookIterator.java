package design.patterns.behavioral.iterator;

public class FacebookIterator implements ProfileIterator
{
    private final Facebook facebook;
    private final String type;
    private final String profileId;
    private int currentPosition;
    private Profile[] cache;

    FacebookIterator(SocialNetwork facebook, String profileId, String type){
        this.facebook = (Facebook) facebook;
        this.profileId = profileId;
        this.type = type;
    }

    private void lazyInit(){
        if(cache== null){
            cache = facebook.socialGraphRequest(profileId, type);
        }
    }
    @Override
    public Profile getNext()
    {
        Profile result;
        if(hasMore()){
            result = cache[currentPosition++];
            return result;
        }
        return null;
    }

    @Override
    public boolean hasMore()
    {
        lazyInit();
        if(cache!=null)
            return currentPosition < cache.length;
        else return false;
    }
}
