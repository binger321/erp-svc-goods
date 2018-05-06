package com.binger.goods.service;

import com.binger.goods.domain.Person;
import com.binger.goods.domain.PersonExample;
import com.binger.goods.vo.PersonVo;

import java.util.List;

public interface PersonService {
    /**
     * 计算人员总数
     * @param personExample
     * @return
     */
    Long count(PersonExample personExample);

    /**
     *
     * @param personExample
     */
    List<PersonVo> listByExample(PersonExample personExample);

    PersonVo findById(Integer id);

    PersonVo updateById(Person person,Integer id);

    PersonVo add(Person person);

    Integer deleteById(Integer id);
}
