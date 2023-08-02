package bekks.repasitory;

import bekks.entity.Profile;

public interface ProfileRepos {
    void saveProfile(Long userId, Profile profile);

    Profile findProfileByUserId(long id);

    void deleteProfileByUserId(Long id);
}
