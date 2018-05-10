package com.binger.goods.controller;

import com.binger.common.Const;
import com.binger.common.Page;
import com.binger.common.ServerResponse;
import com.binger.common.util.DozerUtils;
import com.binger.goods.controller.form.SupplierForm;
import com.binger.goods.controller.query.SupplierQuery;
import com.binger.goods.domain.Supplier;
import com.binger.goods.domain.SupplierExample;
import com.binger.goods.service.SupplierService;
import com.binger.goods.vo.SupplierDetailVo;
import com.binger.goods.vo.SupplierVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2018/4/24
 * Time: 下午2:46
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Api(value = "supplier", description = "供应商接口", produces = MediaType.APPLICATION_JSON_VALUE)
@RestController(value = "供应商API")
@RequestMapping(value = "/supplier")
public class SupplierController {

    @Autowired
    private SupplierService supplierService;
    @ApiOperation(value = "供应商列表")
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public ServerResponse<List<SupplierVo>> list(@RequestBody(required = false) SupplierQuery supplierQuery,
                                                 @RequestParam(value = "pageNo", required = false) Integer pageNo,
                                                 @RequestParam(value = "pageSize", required = false) Integer pageSize) {
        SupplierExample example = new SupplierExample();
        SupplierExample.Criteria criteria= example.createCriteria();
        if (StringUtils.isNotBlank(supplierQuery.getSupplierCode())) {
            criteria.andSupplierCodeLike(supplierQuery.getSupplierCode());
        }
        if (StringUtils.isNotBlank(supplierQuery.getSupplierName())) {
            criteria.andSupplierNameLike(supplierQuery.getSupplierName());
        }
        if (StringUtils.isNotBlank(supplierQuery.getCountry())) {
            criteria.andCountryLike(supplierQuery.getCountry());
        }
        if (StringUtils.isNotBlank(supplierQuery.getContact())) {
            criteria.andContactLike(supplierQuery.getContact());
        }
        if (StringUtils.isNotBlank(supplierQuery.getState())) {
            criteria.andStateLike(supplierQuery.getState());
        }
        if (pageNo != null) {
            long total = supplierService.count(example);
            Page page = new Page(pageNo, pageSize, total);
            example.setOffset(page.getOffset());
            example.setLimit(page.getPageSize());
            List<SupplierVo> supplierVoList = supplierService.listByExample(example);
            return ServerResponse.createBySuccess(Const.SUCCESS_MSG, supplierVoList);
        } else {
            List<SupplierVo> supplierVoList = supplierService.listByExample(example);
            return ServerResponse.createBySuccess(Const.SUCCESS_MSG, supplierVoList);
        }

    }


    @ApiOperation(value = "根据id查询供应商")
    @RequestMapping(value = "/detail/{id}", method = RequestMethod.POST)
    public ServerResponse<SupplierDetailVo> findById(@PathVariable Integer id) {
        SupplierDetailVo supplierDetailVo = supplierService.findById(id);
        return ServerResponse.createBySuccess(Const.SUCCESS_MSG, supplierDetailVo);
    }

    @ApiOperation(value = "根据供应商id修改供应商信息")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    public ServerResponse<SupplierDetailVo> update(@PathVariable Integer id,
                                                   @RequestBody SupplierForm supplierForm) {
        Supplier supplier = DozerUtils.convert(supplierForm, Supplier.class);
        SupplierDetailVo supplierDetailVo = supplierService.updateById(supplier, id);
        return ServerResponse.createBySuccess(Const.SUCCESS_MSG, supplierDetailVo);
    }

    @ApiOperation(value = "新增")
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ServerResponse<SupplierDetailVo> add(@RequestBody SupplierForm supplierForm) {
        Supplier supplier = DozerUtils.convert(supplierForm, Supplier.class);
        SupplierDetailVo supplierDetailVo = supplierService.add(supplier);
        return ServerResponse.createBySuccess(Const.SUCCESS_MSG, supplierDetailVo);
    }

    @ApiOperation(value = "删除")
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
    public ServerResponse<Integer> deleteById(@PathVariable Integer id) {
        Integer result = supplierService.deleteById(id);
        return ServerResponse.createBySuccess(Const.SUCCESS_MSG, result);
    }
}
