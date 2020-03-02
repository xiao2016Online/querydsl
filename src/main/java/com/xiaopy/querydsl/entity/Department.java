package com.xiaopy.querydsl.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * @author xiaopeiyu
 * @since 2020/3/2
 */
@Data
@Entity
@Table(name = "t_department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /**
     * 部门id
     */
    private Integer deptId;
    /**
     * 部门名称
     */
    private String deptName;
    /**
     * 创建时间
     */
    private Date createDate;


}
