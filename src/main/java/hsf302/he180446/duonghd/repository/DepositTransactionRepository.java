package hsf302.he180446.duonghd.repository;

import hsf302.he180446.duonghd.pojo.DepositTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface DepositTransactionRepository  extends JpaRepository<DepositTransaction, Long> {
    Optional<DepositTransaction> findByTxnRef(String txnRef);
    List<DepositTransaction> findByUserId(Long userId);
    DepositTransaction save(DepositTransaction transaction);
}
