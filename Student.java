/* 
    我对变量的赋值方面不给予任何限制条件，因此，这会使变量的赋值会不合法
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