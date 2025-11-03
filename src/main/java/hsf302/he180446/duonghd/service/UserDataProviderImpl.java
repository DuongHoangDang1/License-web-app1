package hsf302.he180446.duonghd.service;

import hsf302.he180446.duonghd.repository.UserRepository;
import org.springframework.stereotype.Service;
import hsf302.he180446.duonghd.pojo.User;
import hsf302.he180446.duonghd.config.UserDataProvider;

import java.util.Optional;

/**
 * App chính implement UserDataProvider để lib có thể gọi sang.
 */
@Service
public class UserDataProviderImpl implements UserDataProvider<User> {

    private final UserRepository userRepository;

    public UserDataProviderImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Optional<User> findByUsername(String username) {
        return userRepository.findByUsername(username).map(appUser -> {
            User libUser = new User();
            libUser.setUsername(appUser.getUsername());
            libUser.setPassword(appUser.getPassword());
            libUser.setVerified(appUser.isVerified());
            libUser.setRole(appUser.getRole());
            return libUser;
        });
    }
}
