/* 
    �ҶԱ����ĸ�ֵ���治�����κ�������������ˣ����ʹ�����ĸ�ֵ�᲻�Ϸ�
 */
package com.test;
public class Student
{
    public int age;
    public String name;
    public static int tmpID = 10000;
    public String ID;
    public Student(String name,String ID,int age)
    {
        this.name = name;
        this.ID = "G"+tmpID;
        tmpID++;
        this.age = age;
    }
    public String toString()
    {
        return "age" + age + "name" + name + "ID" + ID;
    }
}