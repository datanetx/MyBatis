package com.datanetx.dao;

import com.datanetx.domain.Dept;

import java.util.List;

public interface DeptDao {
    public Dept selectByDeptno(Integer deptno);
    public List<Dept> selectAll();
    public void insert(Dept dept);
    public void update(Dept dept);
    public void deleteByDeptno(Integer deptno);
}
