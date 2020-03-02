package com.xiaopy.querydsl.service;

import com.xiaopy.querydsl.bean.UserDeptDTO;

import java.util.List;

/**
 * @author xiaopeiyu
 * @since 2020/3/2
 */
public interface UserService {
    List<UserDeptDTO> findByDepartmentIdDTO(int departmentId);
}
