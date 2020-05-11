package com.datanetx.service;

import com.datanetx.domain.Emp;

import java.util.List;

public interface EmpService {
    public Emp selectByEmpno(Integer empno);
    public List<Emp> selectAll();
    public void insert(Emp emp);
    public void update(Emp emp);
    public void deleteByEmpno(Integer empno);
}
