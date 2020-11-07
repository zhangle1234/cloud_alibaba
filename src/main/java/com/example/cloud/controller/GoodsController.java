package com.example.cloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/** @Author:zl @Date:2020/11/06 15:48:01 @Userful: */
@Controller
@RequestMapping("goods")
public class GoodsController {

  @RequestMapping("/getGoodsInfoById")
  @ResponseBody
  public Map<String, Object> getGoodsInfoById(@RequestParam("id") String goodsId) {
    Map result = new HashMap();
    result.put("goodsName", "Y7000");
    result.put("price", 6800.00);
    result.put("color", "blank");
    return result;
  }
}
