package com.datanetx.test;

import com.datanetx.domain.Dept;
import com.datanetx.domain.Emp;
import com.datanetx.service.DeptService;
import com.datanetx.service.EmpService;
import com.datanetx.service.impl.DeptServiceImpl;
import com.datanetx.service.impl.EmpServiceImpl;
import com.datanetx.utils.ServiceFactory;
import com.datanetx.utils.TransactionInvocationHandler;
import org.junit.Test;

import java.util.Date;
import java.util.List;

public class TestMain {

    @Test
    public void mytest() {

        DeptService deptService=(DeptService) ServiceFactory.getService(new DeptServiceImpl());
        deptService.update(new Dept(60, "办公室", "西藏"));

        deptService = (DeptService) ServiceFactory.getService(new DeptServiceImpl());
        List<Dept> deptList=deptService.selectAll();
        for (Dept dept:deptList) {
            System.out.println(dept);
        }

        EmpService empService = (EmpService) ServiceFactory.getService(new EmpServiceImpl());
//        EmpService empService=(EmpService) new TransactionInvocationHandler(new EmpServiceImpl()).getProxy();//也可以不用ServiceFactory
        empService.insert(new Emp(9003, "leo", "刀客", 9000, new Date(), 2000.0, 200.0, 50));

        empService = (EmpService) ServiceFactory.getService(new EmpServiceImpl());
        List<Emp> empList = empService.selectAll();
        for (Emp emp : empList) {
            System.out.println(emp);
        }
    }
}
