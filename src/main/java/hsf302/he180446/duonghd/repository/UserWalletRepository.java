package hsf302.he180446.duonghd.repository;

import hsf302.he180446.duonghd.pojo.UserWallet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserWalletRepository extends JpaRepository<UserWallet, Long> {
    <T> Optional<T> findByUserId(Long userId);
}
