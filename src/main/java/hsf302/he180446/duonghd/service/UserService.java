package hsf302.he180446.duonghd.service;

import hsf302.he180446.duonghd.pojo.User;
import hsf302.he180446.duonghd.repository.UserRepository;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final UserWalletService walletService;
    public UserService(UserRepository userRepository, UserWalletService walletService) {
        this.userRepository = userRepository;
        this.walletService = walletService;
    }

    public Optional<User> findUserById(Long id){
        return userRepository.findById(id);
    }

    public Optional<User> findByUsername(String name){
        return userRepository.findByUsername(name);
    }

    public void homeInfor(Authentication auth, Model model) {
        if(auth != null && auth.isAuthenticated() && !"anonymousUser".equals(auth.getName())) {
            userRepository.findByUsername(auth.getName()).ifPresent(user -> {
                model.addAttribute("user", user);

                walletService.findByWalletId(user.getId()).ifPresent(wallet ->
                        model.addAttribute("wallet", wallet)
                );
            });
        }
    }

}
