package bekks.service;

import bekks.entity.Profile;

public interface ProfileService {
    void saveProfile(Long userId, Profile profile);

    Profile findProfileByUserId(long id);

    void deleteProfileByUserId(Long id);
}
