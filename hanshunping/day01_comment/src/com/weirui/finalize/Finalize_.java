package com.weirui.finalize;

// 演示一下finalize方法的用法
public class Finalize_ {
    public static void main(String[] args) {
        Car tesla = new Car("特斯拉");
//        从java 9开始，finalize就被弃用了
        // 置空 使其没有任何引用  目的；把Car对象变成垃圾，被回收（销毁）掉
        // 在被垃圾回收器回收之前，编译器会调用这个Car对象的finalize方法
        // 这时，程序员就可以在finalize中，写自己的业务逻辑代码（比如：释放资源）
        // 如果程序员不重写finalize，那么就会调用Object类中的finalize；即 默认处理
        tesla = null;
        // 主动调用垃圾回收器  （可以把垃圾回收器理解成一个保洁阿姨）
        System.gc(); // 即使你主动垃圾回收器，但它可能由于各种原因，也不能及时来处理
    }
}
