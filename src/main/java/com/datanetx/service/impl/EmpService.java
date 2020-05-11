package com.datanetx.service.impl;

import com.datanetx.dao.EmpDao;
import com.datanetx.domain.Emp;
import com.datanetx.utils.SqlSessionUtils;
import com.datanetx.utils.TransactionInvocationHandle;

import java.util.List;

public class EmpService implements com.datanetx.service.EmpService {

    private EmpDao empDao= SqlSessionUtils.getSession().getMapper(EmpDao.class);

    @Override
    public Emp selectByEmpno(Integer empno) {
        return empDao.selectByEmpno(empno);
    }

    @Override
    public List<Emp> selectAll() {
        return empDao.selectAll();
    }

    @Override
    public void insert(Emp emp) {
        empDao.insert(emp);
    }

    @Override
    public void update(Emp emp) {
        empDao.update(emp);
    }

    @Override
    public void deleteByEmpno(Integer empno) {
        empDao.deleteByEmpno(empno);
    }
}
