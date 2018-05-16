package com.binger.goods.controller;

import com.binger.common.Const;
import com.binger.common.Page;
import com.binger.common.ServerResponse;
import com.binger.common.util.DozerUtils;
import com.binger.goods.controller.form.StoreForm;
import com.binger.goods.controller.query.StoreQuery;
import com.binger.goods.domain.Store;
import com.binger.goods.domain.StoreExample;
import com.binger.goods.service.StoreService;
import com.binger.goods.vo.StoreVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Api(value = "商店管理", description = "商店管理", produces = MediaType.APPLICATION_JSON_VALUE)
@RestController("store")
@RequestMapping(value = "erp-svc-goods/store")
public class StoreController {

    @Autowired
    StoreService storeService;

    @ApiOperation(value = "商店列表")
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public ServerResponse<List> list(@RequestBody(required = false) StoreQuery storeQuery,
                                     @RequestParam(value = "pageNo", required = false) Integer pageNo,
                                     @RequestParam(value = "pageSize", required = false) Integer pageSize){

        StoreExample storeExample =new StoreExample();
        StoreExample.Criteria criteria = storeExample.createCriteria();

        if(null != storeQuery) {
            if (null != storeQuery.getId()) {
                criteria.andIdEqualTo(storeQuery.getId());
            }
            if (StringUtils.isNotBlank(storeQuery.getStoreCode())) {
                criteria.andStoreCodeLike(storeQuery.getStoreCode());
            }
            if (StringUtils.isNotBlank(storeQuery.getStoreName())) {
                criteria.andStoreNameLike(storeQuery.getStoreName());
            }
        }

        if (pageNo != null) {
            long total = storeService.count(storeExample);
            Page page = new Page(pageNo, pageSize, total);
            storeExample.setOffset(page.getOffset());
            storeExample.setLimit(page.getPageSize());
            List<StoreVo> storeVoList = storeService.listByExample(storeExample);
            return ServerResponse.createBySuccess(Const.SUCCESS_MSG, storeVoList, page);
        }else {
            List<StoreVo> storeVoList = storeService.listByExample(storeExample);
            return ServerResponse.createBySuccess(Const.SUCCESS_MSG, storeVoList);
        }

    }

    @ApiOperation(value = "根据ID查找商店信息")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ServerResponse<StoreVo> findById(@PathVariable Integer id){
        StoreVo storeVo = storeService.findById(id);
        return ServerResponse.createBySuccess(Const.SUCCESS_MSG, storeVo);
    }

    @ApiOperation(value = "根据ID更新用户数据")
    @RequestMapping(value = "update/{id}",method = RequestMethod.POST)
    public ServerResponse<StoreVo> update(@PathVariable Integer id,
                                         @RequestBody StoreForm storeForm){
        Store store = DozerUtils.convert(storeForm,Store.class);
        StoreVo storeVo = storeService.updateById(store,id);
        return ServerResponse.createBySuccess(Const.SUCCESS_MSG,storeVo);
    }


    @ApiOperation(value = "增加人员")
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public ServerResponse<StoreVo> add(@RequestBody StoreForm storeForm){
        Store store = DozerUtils.convert(storeForm, Store.class);
        StoreVo storeVo = storeService.add(store);
        return ServerResponse.createBySuccess(Const.SUCCESS_MSG,storeVo);
    }

    @ApiOperation(value = "根据ID删除人员")
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public ServerResponse<Integer> delete(@PathVariable Integer id){
        Integer result = storeService.deleteById(id);
        return ServerResponse.createBySuccess(Const.SUCCESS_MSG,result);
    }



}
