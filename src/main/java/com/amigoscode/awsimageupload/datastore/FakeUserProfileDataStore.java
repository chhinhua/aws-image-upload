package com.amigoscode.awsimageupload.datastore;

import com.amigoscode.awsimageupload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {
    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("9abaed67-5b1c-4dc0-a106-01e0d9b0c6c3"), "chhinhua", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("c295436e-9491-423e-ae1f-b1e7ec62907c"), "eric", null));
    }

    public List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }
}
