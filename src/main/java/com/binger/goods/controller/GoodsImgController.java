package com.binger.goods.controller;

import io.swagger.annotations.Api;
import lombok.Data;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2017/12/19 0019
 * Time: 16:33
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Api(value = "goodsImg",description = "商品品牌接口", produces = MediaType.APPLICATION_JSON_VALUE)
@RestController(value = "商品图片API")
@RequestMapping(value = "erp-svc-goods/goodsImg")
public class GoodsImgController {
    @org.junit.Test
    public void main() {
//        int a = 10;
//        int b = 10;
        Integer a = 10;
        Integer b = 10;
        Integer c = 1000;
        Integer d = 1000;
        System.out.println(a == b);
        System.out.println(c.equals(d));
        Test test = new Test();
        System.out.println(test.getI());
        System.out.println(test.getInteger());
    }

    @Data
    class Test{
        int i;
        Integer integer;
    }


}