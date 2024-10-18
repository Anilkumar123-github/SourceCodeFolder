 //super keyword
class A
{
int p=20;
void show()
{
System.out.println(p);
}
}
class B extends A
{
//from class A p=20,show()
int q=50;
int p=90;
void show()
{
System.out.println(super.p);
System.out.println(p);
}
}
class Super
{
public static void main(String x[])
{
B o = new B();
o.show();//it gets value from subclass
}
}