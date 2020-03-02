package com.xiaopy.querydsl.bean;

import lombok.Builder;
import lombok.Data;

/**
 * @author xiaopeiyu
 * @since 2020/3/2
 */

@Data
@Builder
public class UserDeptDTO {
    /**
     * 用户名
     */
    private String username;
    /**
     * 昵称
     */
    private String nickname;

    /**
     * 用户生日
     */
    private String birthday;

    /**
     * 用户所属部门
     */
    private String deptName;
    /**
     * 部门创建的时间
     */
    private String deptBirth;
}
