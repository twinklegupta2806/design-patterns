package design.patterns.behavioral.iterator;

import java.util.Objects;

public class Facebook implements SocialNetwork
{
    Profile[] profiles = new Profile[]{new Profile("aman", "eg"), new Profile("kashish", "amazon"), new Profile("umang", "ms"), new Profile("arushi", "eg")};
    @Override
    public ProfileIterator createFriendsIterator(int profileId)
    {
        return null;
    }

    @Override
    public ProfileIterator createCoworkersIterator(int profileId)
    {
        return null;
    }

    public Profile[] socialGraphRequest(String profileId, String type){
        if(type.equals("friends")){
            return profiles;
        } else {
            String profileCompany="";
            for (Profile value : profiles)
            {
                if (value.name.equals(profileId)) profileCompany = value.companyName;
            }
            for (Profile profile : profiles)
            {
                if (Objects.equals(profile.companyName, profileCompany) && !Objects.equals(profile.name, profileId))
                    return new Profile[]{profile};
            }
            return null;
        }
    }
}
