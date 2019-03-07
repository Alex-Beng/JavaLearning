# 声明数组变量

```java
int[] arrayRefVar;   // 首选的方法
 
int arrayRefVar[];  // 效果相同，但不是首选方法
```
 建议使用 dataType[] arrayRefVar 的声明风格声明数组变量。 dataType arrayRefVar[] 风格是来自 C/C++ 语言 ，在Java中采用是为了让 C/C++ 程序员能够快速理解java语言。

#  创建数组

Java语言使用new操作符来创建数组
```java
arrayRefVar = new int[233];
```

# 处理数组

```java
public class TestArray {
   public static void main(String[] args) {
      double[] myList = {1.9, 2.9, 3.4, 3.5};
 
      // 打印所有数组元素
      for (int i = 0; i < myList.length; i++) {
         System.out.println(myList[i] + " ");
      }
      // 计算所有元素的总和
      double total = 0;
      for (int i = 0; i < myList.length; i++) {
         total += myList[i];
      }
      System.out.println("Total is " + total);
      // 查找最大元素
      double max = myList[0];
      for (int i = 1; i < myList.length; i++) {
         if (myList[i] > max) max = myList[i];
      }
      System.out.println("Max is " + max);
      // 使用增强型for循环
      for (int i : myList) {
          if (i > max) {
              max = i;
          }
      }
      System.out.println("Max by new for " + max);
   }
}
```


# 数组作为函数的参数

```java
public static void printArray(int[] array) {
  for (int i = 0; i < array.length; i++) {
    System.out.print(array[i] + " ");
  }
}
```

# 数组作为函数的返回值

```java
public static int[] reverse(int[] list) {
  int[] result = new int[list.length];
 
  for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
    result[j] = list[i];
  }
  return result;
}
```

# 多维数组

```java
int a[][] = new int[2][3];
// 引用 
a[0][1];
```

# Arrays 类

in java.util.Arrays

它提供的所有方法都是静态的。

具有以下功能：

1. 给数组赋值：通过 fill 方法。
2. 对数组排序：通过 sort 方法,按升序。
3. 比较数组：通过 equals 方法比较数组中元素值是否相等。
4. 查找数组元素：通过 binarySearch 方法能对排序好的数组进行二分查找法操作。

![array funcs](..\Source\ArrayFuncs.JPG)