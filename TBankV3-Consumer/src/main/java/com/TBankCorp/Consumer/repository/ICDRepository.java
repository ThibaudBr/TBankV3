package com.TBankCorp.Consumer.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.TBankCorp.Model.beans.Util;

//@Repository
public interface ICDRepository extends CrudRepository<Util, Long>
{
}
