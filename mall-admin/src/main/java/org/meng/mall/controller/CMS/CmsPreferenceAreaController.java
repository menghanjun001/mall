package org.meng.mall.controller.CMS;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import mall.common.api.CommonResult;
import org.meng.mall.model.CmsPreferenceArea;
import org.meng.mall.service.CmsPreferenceAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Created by menghanjun
 * @Date 2020/11/25 8:49 下午
 */
@Controller
@Api(tags = "CmsPreferenceAreaController",description = "商品优选管理")
@RequestMapping("/preferenceArea")
public class CmsPreferenceAreaController {
    @Autowired
    private CmsPreferenceAreaService preferenceAreaService;

    @ApiOperation("获取所有商品优选")
    @RequestMapping
    @ResponseBody
    public CommonResult<List<CmsPreferenceArea>> listAll() {
        List<CmsPreferenceArea> preferenceAreaList=preferenceAreaService.listAll();
        return CommonResult.success(preferenceAreaList);
    }
}
