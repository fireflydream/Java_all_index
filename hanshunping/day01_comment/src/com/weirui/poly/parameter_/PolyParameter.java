package com.weirui.poly.parameter_;

import com.sun.source.tree.IfTree;

public class PolyParameter {
    public static void main(String[] args) {
        Worker worker = new Worker("罗成", 10000, 12);
        Manager manager = new Manager("袁天罡", 15000, 14, 3000);
        // 想要在方法里面调用另一个方法，需要实例化一个包含该方法类的对象
        PolyParameter polyParameter = new PolyParameter();
        polyParameter.showEmpAnnal(worker);
        polyParameter.showEmpAnnal(manager);

        polyParameter.testWork(worker);
        polyParameter.testWork(manager);
    }
    // 实现获取任何员工对象的年工资，并在main方法中调用该方法
    public void showEmpAnnal(Employee e) {
        System.out.println(e.getAnnual());
    }
    // 添加一个testWork方法，如果是普通员工，则调用work方法；如果是经理，则调用manage方法
    // instanceof 和 向下转型 搭配使用
    public void testWork(Employee e) {
        if (e instanceof Worker) {
            ((Worker) e).work();
        } else if (e instanceof Manager) {
            ((Manager) e).manage();
        }else { // 其他类型
            System.out.println("不做处理");
        }
    }
}
