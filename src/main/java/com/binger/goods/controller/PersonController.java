package com.binger.goods.controller;

import com.binger.common.Const;
import com.binger.common.Page;
import com.binger.common.ServerResponse;
import com.binger.common.util.DozerUtils;
import com.binger.goods.controller.form.PersonForm;
import com.binger.goods.controller.query.PersonQuery;
import com.binger.goods.domain.Person;
import com.binger.goods.domain.PersonExample;
import com.binger.goods.service.PersonService;
import com.binger.goods.vo.PersonVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(value = "人员管理", description = "人员管理", produces = MediaType.APPLICATION_JSON_VALUE)
@RestController("person")
@RequestMapping(value = "erp-svc-goods/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @ApiOperation(value = "人员列表")
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public ServerResponse<List<PersonVo>> list(@RequestBody(required = false) PersonQuery personQuery,
                                               @RequestParam(value = "pageNo", required = false) Integer pageNo,
                                               @RequestParam(value = "pageSize", required = false) Integer pageSize) {
        PersonExample personExample = new PersonExample();
        PersonExample.Criteria criteria = personExample.createCriteria();

        if(null != personQuery) {
            if (null != personQuery.getId()) {
                criteria.andIdEqualTo(personQuery.getId());
            }
            if (StringUtils.isNotBlank(personQuery.getPersonCode())) {
                criteria.andPersonCodeLike("%"+personQuery.getPersonCode()+"%");
            }
            if (StringUtils.isNotBlank(personQuery.getPersonName())) {
                criteria.andPersonNameLike("%"+personQuery.getPersonName()+"%");
            }
            if (StringUtils.isNotBlank(personQuery.getIdCardNo())) {
                criteria.andIdCardNoLike("%"+personQuery.getIdCardNo()+"%");
            }
            if (StringUtils.isNotBlank(personQuery.getPhone())) {
                criteria.andPhoneLike("%"+personQuery.getPhone()+"%");
            }
        }
        if (pageNo != null) {
            long total = personService.count(personExample);
            Page page = new Page(pageNo, pageSize, total);
            personExample.setOffset(page.getOffset());
            personExample.setLimit(page.getPageSize());
            List<PersonVo> personVoList = personService.listByExample(personExample);
            return ServerResponse.createBySuccess(Const.SUCCESS_MSG, personVoList, page);
        }else {
            List<PersonVo> personVoList = personService.listByExample(personExample);
            return ServerResponse.createBySuccess(Const.SUCCESS_MSG, personVoList);
        }

    }

    @ApiOperation(value = "根据ID查找人员信息")
    @RequestMapping(value = "/{id}",method = RequestMethod.POST)
    public ServerResponse<PersonVo> findById(@PathVariable Integer id){
        PersonVo personVo = personService.findById(id);
        return ServerResponse.createBySuccess(Const.SUCCESS_MSG,personVo);
    }

    @ApiOperation(value = "根据ID修改人员信息")
    @RequestMapping(value = "/update/{id}",method = RequestMethod.POST)
    public ServerResponse<PersonVo> update(@PathVariable Integer id,
                                           @RequestBody PersonForm personForm){
        Person person = DozerUtils.convert(personForm,Person.class);
        PersonVo personVo = personService.updateById(person,id);
        return ServerResponse.createBySuccess(Const.SUCCESS_MSG,personVo);
    }

    @ApiOperation(value = "增加人员")
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public ServerResponse<PersonVo> add(@RequestBody PersonForm personForm){
        Person person = DozerUtils.convert(personForm,Person.class);
        PersonVo personVo = personService.add(person);
        return ServerResponse.createBySuccess(Const.SUCCESS_MSG,personVo);
    }

    @ApiOperation(value = "根据ID删除人员")
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
    public ServerResponse<Integer> delete(@PathVariable Integer id){
        Integer result = personService.deleteById(id);
        return ServerResponse.createBySuccess(Const.SUCCESS_MSG,result);
    }
}
