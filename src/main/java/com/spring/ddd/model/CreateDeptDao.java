package com.spring.ddd.model;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by luxin on 2016/7/13.
 */
public interface CreateDeptDao extends CrudRepository<CreateDept,Long> {
    List<CreateDept> findByDname(String dname);
    List<CreateDept> findByDeptnoAndDname(long deptno,String dname);
    List<CreateDept> findByDeptnoOrDname(long deptno,String dname);
}