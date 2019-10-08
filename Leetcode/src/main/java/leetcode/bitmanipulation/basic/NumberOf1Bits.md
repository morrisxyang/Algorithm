`191. Number of 1 Bits`  

<https://leetcode.com/problems/number-of-1-bits/>

`191. 位1的个数`  

<https://leetcode-cn.com/problems/number-of-1-bits/>

## 描述
编写一个函数，输入是一个无符号整数，返回其二进制表达式中数字位数为 ‘1’ 的个数（也被称为汉明重量）。


示例 1：
```
输入：00000000000000000000000000001011
输出：3
解释：输入的二进制串 00000000000000000000000000001011 中，共有三位为 '1'。
```
示例 2：
```
输入：00000000000000000000000010000000
输出：1
解释：输入的二进制串 00000000000000000000000010000000 中，共有一位为 '1'。
```

## 思路

```java
 public int hammingWeight(int n) {
        int sum =0;
        for(int i=0;i<32;i++){
            sum +=(n>>i&1);
        }
        return sum;
    }
```