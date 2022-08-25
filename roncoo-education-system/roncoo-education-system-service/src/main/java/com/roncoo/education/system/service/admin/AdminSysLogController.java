package com.roncoo.education.system.service.admin;

import com.roncoo.education.common.core.base.Page;
import com.roncoo.education.common.core.base.Result;
import com.roncoo.education.system.service.admin.biz.AdminSysLogBiz;
import com.roncoo.education.system.service.admin.req.SysLogPageREQ;
import com.roncoo.education.system.service.admin.resp.SysLogPageRESQ;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 后台操作日志表
 *
 * @author wujing
 */
@RestController
@RequestMapping(value = "/system/admin/sys/log")
public class AdminSysLogController {

    @Autowired
    private AdminSysLogBiz biz;

    /**
     * 后台操作日志分页列表接口
     */
    @ApiOperation(value = "后台操作日志分页列表接口", notes = "后台操作日志分页列表接口")
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public Result<Page<SysLogPageRESQ>> list(@RequestBody SysLogPageREQ sysLogPageREQ) {
        return biz.list(sysLogPageREQ);
    }

}
