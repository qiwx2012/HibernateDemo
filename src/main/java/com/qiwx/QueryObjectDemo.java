package com.qiwx;

import com.qiwx.entities.DepartMent2;
import com.qiwx.entities.Department;
import com.qiwx.entities.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class QueryObjectDemo {
    public static void main(String[] args) {
        Configuration configuration=new Configuration().configure();
        SessionFactory factory=configuration.buildSessionFactory();
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
      /*  Department department=new Department();
        department.setDeptId(101);
        department.setDeptName("产品部");
        department.setDeptNo("D101");
        department.setLocation("北京");*/
        DepartMent2 department=new DepartMent2();
        department.setDeptId(111);
        department.setDeptName("财务部");
        session.save(department);
        tx.commit();
        session.close();
        factory.close();
    }
}
