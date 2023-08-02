package bekks.repasitory;

import bekks.entity.Profile;
import bekks.entity.User;

public interface UserRepos {
    String saveUser(User user);

    User findUserByid(Long id);

    void updateProfile(Long id, Profile profile);

    void delete(Long id);
}
