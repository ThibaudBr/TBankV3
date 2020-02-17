package com.TBankCorp.Consumer.repository;

import com.TBankCorp.Model.beans.Transaction;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionRepository extends CrudRepository<Transaction, Long> {

    @Query(nativeQuery = true,value = "SELECT idTransaction,idUtilInit,idAccountInit,idUtilEnd,idAccountEnd,date,amount FROM Transaction WHERE Transaction.idAccountInit = (:idAccount) OR Transaction.idAccountEnd = (:idAccount2) ")
    List<Transaction> findByIdAccountInitAndIdAccountEnd(@Param("idAccount") int idAccount,
                                                         @Param("idAccount2") int idAccount2);
}