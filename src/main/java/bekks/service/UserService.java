package bekks.service;

import bekks.entity.Profile;
import bekks.entity.User;

public interface UserService {
    String saveUser(User user);

    User findUserByid(Long id);

    void updateProfile(Long id, Profile profile);

    void delete(Long id);
}
