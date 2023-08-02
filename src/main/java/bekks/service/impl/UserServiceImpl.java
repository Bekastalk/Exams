package bekks.service.impl;

import bekks.entity.Profile;
import bekks.entity.User;
import bekks.repasitory.UserRepos;
import bekks.repasitory.impl.UserReposImpl;
import bekks.service.UserService;

public class UserServiceImpl implements UserService {
    UserRepos userRepos=new UserReposImpl();
    @Override
    public String saveUser(User user) {
        return userRepos.saveUser(user);
    }

    @Override
    public User findUserByid(Long id) {
        return userRepos.findUserByid(id);
    }

    @Override
    public void updateProfile(Long id, Profile profile) {
        userRepos.updateProfile(id, profile);
    }

    @Override
    public void delete(Long id) {
        userRepos.delete(id);
    }
}
