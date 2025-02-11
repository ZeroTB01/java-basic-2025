#java学习之路
## Java 的基础语法学习
### Java OOR
面向对象编程,需要创建一个类,然后实例化为对象方可调用,具有具体的属性与方法或行为
- 创建一个对象
`public class className{}`
- 实例化类创建对象
`className ObjectName = new className`
- 注意
1. 类名与文件名一致

### 构造方法
- 定义
构造方法就是初始化类属性 (class attribute)
- 注意
1. 构造方法就算给不写,Java也会自动设置一个构造方法
2. 构造方法名与类名一致
3. 无返回值类型
4. 可以重载(写多个构造方法,应对不同的初始化部分)

### 封装
- 定义
将类中的属性用 private 保护起来,这样类属性就不能在类以外的部分轻易更改.然后在类中创建相应的get(),set()方法,在类以外调用调整类属性
- 优点
1. 保护类属性
2. 设置输入 添加验证逻辑,例如设置范围

### 继承与多态
- 继承
1. 定义
子类继承父类的属性和方法,以便于直接使用
2. 使用
`class sunclass extends superclass`重点是使用extends关键字用以继承
- 多态
1. 定义
用以重写方法,同一个父类方法,子类重写方法体,达成不同行为.创建对象时,引用父类创建子类对象,调用方法时实际调用为子类方法
2. 注意
- 使用@Override 用以表明为重写方法
- 子类使用父类构造方法,使用super()
- 父类可以直接指向任意子类创建对象
``Animal animal = new Dog();``
  - 但是不能直接调用子类方法因此需要转化为具有该方法的子类才能调用方法
  当使用循环调用一个对象数组时,对象的其中一个方法是属于某个子类类时,需要使用instanceof进行判断该父类属于哪个子类然后转化为该子类才能调用
  ``if (animal instanceof Dog){
        Dog dog = (Dog) animal;
        dog.fetch();
    }``
3. 代码示例
``animal.Animal animal = new animal.Dog();  
  animal.makeSound(); // 实际调用Dog类的方法  ``
### 抽象类与接口
- 区别
抽象类是存在没有具体函数体不能实例化的类,接口是只有函数名,没有函数体
- 抽象类定义
抽象类的定义是使用 _abstract_ 关键字,子类需要实现所有抽象方法
`abstract class className{}`
- 注意
抽象类方法不能有主体,即使是空的{}也不行
- 接口的定义
完全的抽象类,使用interface关键字创建接口,使用implements关键字使类实现该接口
``interfac 接口Name{}``
``class className implements 接口Name{}``
1. 所有默认方法都是 public abstract 
2. 所有字段都是 public static final
3. 可以添加默认方法设置函数体 使用default关键字