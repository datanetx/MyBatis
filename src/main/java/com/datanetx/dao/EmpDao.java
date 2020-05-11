package com.datanetx.dao;

import com.datanetx.domain.Emp;

import java.util.List;

public interface EmpDao {
    public Emp selectByEmpno(Integer empno);
    public List<Emp> selectAll();
    public void insert(Emp emp);
    public void update(Emp emp);
    public void deleteByEmpno(Integer empno);
}
