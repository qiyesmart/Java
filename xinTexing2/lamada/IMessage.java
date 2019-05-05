package lamada;

/**
 * Author:QiyeSmart
 * Created:2019/5/5
 */
/*
1.函数接口：为函数编程而生，只能定义一个抽象方法，为例防止函数接口中定义多于一个的抽象方法，
可以在接口定义时使用一个@FunctionalInterface进行标注，然后就可以使用lamada表达式
2.lamada表达式的方法体
（参数列表）-》{
  code1;
  code2;
  [return]
  }
  如果方法体中只有一条语句，可以省略{}；
  如果方法体中只有一条语句，并且作为返回值return可以省略
  参数名列表中参数名称不要跟外部代码变量名重名
  建议编写时写完整格式
  如果方法体中访问外部变量，隐式外部变量final修饰，和内部类相同

 */
public interface IMessage {
    public void print();
}
