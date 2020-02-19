package com.TBankCorp.Consumer.repository;

import com.TBankCorp.Model.beans.Account;
import com.TBankCorp.Model.beans.Transaction;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends CrudRepository<Account, Long>
{
    @Query(nativeQuery = true,value = "SELECT * FROM Account WHERE idUtil = (:idUtil)")
    List<Account> findAllAccountWithIdUtil(@Param("idUtil") int idUtil);

}
