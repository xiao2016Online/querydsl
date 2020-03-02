package com.xiaopy.querydsl.service;

import com.querydsl.jpa.impl.JPAQueryFactory;
import com.xiaopy.querydsl.bean.UserDeptDTO;
import com.xiaopy.querydsl.entity.QDepartment;
import com.xiaopy.querydsl.entity.QUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author xiaopeiyu
 * @since 2020/3/2
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private JPAQueryFactory jpaQueryFactory;

    @Override
    public List<UserDeptDTO> findByDepartmentIdDTO(int departmentId) {
        QUser user = QUser.user;
        QDepartment department = QDepartment.department;
        //直接返回
        return jpaQueryFactory
                //投影只去部分字段
                .select(
                        user.username,
                        user.nickName,
                        user.birthday,
                        department.deptName,
                        department.createDate

                )
                .from(user, department)
                //联合查询
                .where(
                        user.departmentId.eq(department.deptId).and(department.deptId.eq(departmentId))
                )
                .fetch()
                //lambda开始
                .stream()
                .map(tuple ->
                        //需要做类型转换，所以使用map函数非常适合
                        UserDeptDTO.builder()
                                .username(tuple.get(user.username))
                                .nickname(tuple.get(user.nickName))
                                .birthday(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(tuple.get(user.birthday)))
                                .deptName(tuple.get(department.deptName))
                                .deptBirth(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(tuple.get(department.createDate)))
                                .build()
                )
                .collect(Collectors.toList());
    }
}
