#Generics and Autoboxing

## 1. Autoboxing

Autoboxing unboxing能够在Primitive和Class之间转换

eg: if Java expects a wrapper type, like Integer, and you provide a primitive type, like int, it will "autobox" the integer. 

```java
public static void blah(Integer x) {
    System.out.println(x);
}
```

```java
int x = 20;
blah(x);
```

JAVA会创立一个Integer，值20，等同于blan(new Integer(20))

### 警告

1. Arrays不支持AutoBox
2. AutoBox影响性能
3. Warpper类型占用更多的内存

###Widening

比如将int转换成double

## 2. Immutability

Immutable数据类型是指她的instances不能被改变，在任何观测方法的影响下，after instantiation。

比如 String 对象，无法被改变，改变他只会返回一个新的Object

任何有 non-private 变量的数据类型都是mutable的（除非被 final 了）

final 用来防止variable被改变，例如

```java
public class Date {
    public final int month;
    public final int day;
    public final int year;
    private boolean contrived = true;
    public Date(int m, int d, int y) {
        month = m; day = d; year = y;
    }
}
```

