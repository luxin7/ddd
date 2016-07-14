package com.spring.ddd.model;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by luxin on 2016/7/14.
 */
public interface TimeDao extends CrudRepository<DTime,String> {
    List<DTime> findByTid(String tid);
}
