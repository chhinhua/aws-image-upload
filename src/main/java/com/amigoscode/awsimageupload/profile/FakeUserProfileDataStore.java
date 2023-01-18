package com.amigoscode.awsimageupload.profile;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {
    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "jamaica", null));
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "eric", null));
    }

    public List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }
}