/*
    这是远程库上的http地址
    https://github.com/JEB-him/StudentSystem.git
    用git取了一个名字叫做
    bidaothu

*/
/* 

1.增加学生
    变量：
        局部变量 int x   用于检测数组是否已满
    方法：
        返回值  Student
        检测储存实例的数组的元素是否为空
        调用构造器
        如果满了，那么就将第一个元素设为null
2.所有学生
    方法：
        返回值 无
        遍历所有数组元素
        同时若数组元素为空，则不输出
    
3.修改学生
    返回值 Student
    进行实例ID的搜索
    采取添加学生方法中的语句即可
    若无，则输出错误语句
    并返回 null
    若有，则输出要求
    然后进行修改
    可以同过重新构造一个实例来修改
    
4.查找学生
    返回值 Student
    需要进行单个特征的检索
    同样可以采取添加学生中的方法
    若无，则输出错误语句
    并返回 null
    若有，则返回实例
5.删除学生
    返回值 无
    通过修改学生的方法在进行修改即可
 */
package com.test;
import java.util.Scanner;
import java.util.Student;
public StuSystem
{
    public static Scanner sc =new Scanner();
    public static Student[] students;
    static{
        students = new Student[50];
    }
    public static void main(String[] args)
    {
        
    }
    public Student setStudent()
    {
        
    }
    
}