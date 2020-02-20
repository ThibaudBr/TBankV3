package com.TBankCorp.Consumer.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.TBankCorp.Model.beans.Util;

//@Repository
public interface ICDRepository extends CrudRepository<Util, Long>
{
    @Query(nativeQuery = true,value ="SELECT * FROM Util WHERE idConnexion = :idConnexion AND password= :password")
    Util findUtilWithMailAndPassword(@Param("idConnexion") String idConnexion,@Param("password") String password);
}
