package com.datanetx.test;

import com.datanetx.domain.Dept;
import com.datanetx.domain.Emp;
import com.datanetx.service.DeptService;
import com.datanetx.service.EmpService;
import org.junit.Test;

import java.util.List;

public class TestMain {

    @Test
    public void mytest() {
        DeptService deptService=new com.datanetx.service.impl.DeptService();
        EmpService empService=new com.datanetx.service.impl.EmpService();

        List<Dept> deptList=deptService.selectAll();
        for (Dept dept:deptList) {
            System.out.println(dept);
        }

        List<Emp> empList=empService.selectAll();
        for(Emp emp:empList){
            System.out.println(emp);
        }
    }
}
