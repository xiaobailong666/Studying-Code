/**
 * 方法引用
 * 方法引用提供了一个很有用的语义来直接访问类或者实例的已经存在的方法或者构造方法。

方法引用可以通过方法的名字来引用其本身。方法引用是通过 :: 符号（双冒号）来描述的。

它可以用来引用下列类型的方法：

构造器引用。语法是 Class::new，或者更一般的 Class<T>::new，要求构造器方法是没有参数；
静态方法引用。语法是 Class::static_method。
特定类的任意对象方法引用。它的语法是 Class::method。
特定对象的方法引用，它的语法是 instance::method。
*@param 2022.8.4
 */

import java.util.ArrayList;
import java.util.List;

public class LambdaTest1 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Peter");
        names.add("Linda");
        names.add("Smith");
        names.add("Zack");
        names.add("Bob");

        //通过
        names.forEach(System.out::println);
    }
}
