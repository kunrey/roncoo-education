package com.roncoo.education.user.service.auth.req;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * API-AUTH-用户登录日志
 * </p>
 *
 * @author wujing
 * @date 2022-08-25
 */
@Data
@Accessors(chain = true)
@ApiModel(value = "AuthLogLoginReq", description = "API-AUTH-用户登录日志")
public class AuthLogLoginReq implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    private Long id;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "创建时间")
    private LocalDateTime gmtCreate;

    @ApiModelProperty(value = "用户ID")
    private Long userId;

    @ApiModelProperty(value = "登录状态(1成功，0失败)")
    private Integer loginStatus;

    @ApiModelProperty(value = "登录IP")
    private String loginIp;

    @ApiModelProperty(value = "国家")
    private String country;

    @ApiModelProperty(value = "省")
    private String province;

    @ApiModelProperty(value = "市")
    private String city;

    @ApiModelProperty(value = "浏览器")
    private String browser;

    @ApiModelProperty(value = "操作系统")
    private String os;
}
