package com.datanetx.utils;

import org.apache.ibatis.session.SqlSession;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TransactionInvocationHandle implements InvocationHandler {

    Object target;
    public TransactionInvocationHandle(Object target){
        this.target=target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object obj=null;
        SqlSession session=null;
        try {
            session=SqlSessionUtils.getSession();
            obj=method.invoke(target,args);
            session.commit();
        }catch (Exception e) {
            session.rollback();
        }finally {
            SqlSessionUtils.closeSession(session);
        }
        return obj;
    }

    public Object getProxy(Object target){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }
}
