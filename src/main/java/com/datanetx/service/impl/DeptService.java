package com.datanetx.service.impl;

import com.datanetx.dao.DeptDao;
import com.datanetx.domain.Dept;
import com.datanetx.utils.SqlSessionUtils;

import java.util.List;

public class DeptService implements com.datanetx.service.DeptService {

    private DeptDao deptDao= SqlSessionUtils.getSession().getMapper(DeptDao.class);

    @Override
    public Dept selectByDeptno(Integer deptno) {
        return deptDao.selectByDeptno(deptno);
    }

    @Override
    public List<Dept> selectAll() {
        return deptDao.selectAll();
    }

    @Override
    public void insert(Dept dept) {
        deptDao.insert(dept);
    }

    @Override
    public void update(Dept dept) {
        deptDao.update(dept);
    }

    @Override
    public void deleteByDeptno(Integer deptno) {
        deptDao.deleteByDeptno(deptno);
    }
}
