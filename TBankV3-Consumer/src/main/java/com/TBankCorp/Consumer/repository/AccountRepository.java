package com.TBankCorp.Consumer.repository;

import com.TBankCorp.Model.beans.Account;
import com.TBankCorp.Model.beans.Transaction;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface AccountRepository extends CrudRepository<Account, Long>
{
    @Query(nativeQuery = true,value = "SELECT * FROM Account WHERE idUtil = (:idUtil)")
    List<Account> findAllAccountWithIdUtil(@Param("idUtil") int idUtil);

    @Query(nativeQuery = true, value = "SELECT * FROM Account WHERE idUtil != (:idUtil)")
    List<Account> findAllAccountWithoutIdUtil(@Param("idUtil") int idUtil);

    @Query(nativeQuery = true, value = "SELECT idUtil FROM Account WHERE idAccount = (:idAccount)")
    int getIdUtilEndWithIdAccountEnd(@Param("idAccount") int idAccountEnd);

    @Transactional
    @Modifying(clearAutomatically = true)
    @Query(nativeQuery = true, value = "UPDATE Account SET money = (:amount) WHERE idAccount = (:idAccountInit)")
    void updateAccountInit(@Param("idAccountInit") int idAccountInit, @Param("amount") int amount);

    @Transactional
    @Modifying(clearAutomatically = true)
    @Query(nativeQuery = true, value = "UPDATE Account SET money = (:amount) WHERE idAccount = (:idAccountEnd)")
    void updateAccountEnd(@Param("idAccountEnd") int idAccountEnd, @Param("amount") int amount);

    @Query(nativeQuery = true, value = "SELECT money FROM Account WHERE idAccount = (:idAccount) ")
    int getAmount(@Param("idAccount") int idAccount);

    @Transactional
    @Modifying(clearAutomatically = true)
    @Query(nativeQuery = true, value = "DELETE FROM Account WHERE idAccount = (:idAccount)")
    void deleteById(@Param("idAccount")int idAccount);
}
