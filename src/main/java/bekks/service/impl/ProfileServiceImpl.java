package bekks.service.impl;

import bekks.entity.Profile;
import bekks.repasitory.ProfileRepos;
import bekks.repasitory.impl.ProfileReposImpl;
import bekks.service.ProfileService;

public class ProfileServiceImpl implements ProfileService {
    ProfileRepos profileRepos=new ProfileReposImpl();
    @Override
    public void saveProfile(Long userId, Profile profile) {
        profileRepos.saveProfile(userId, profile);
    }

    @Override
    public Profile findProfileByUserId(long id) {
        return profileRepos.findProfileByUserId(id);
    }

    @Override
    public void deleteProfileByUserId(Long id) {
        profileRepos.deleteProfileByUserId(id);
    }
}
