class A {
int ivar = 7;
void m1() {
System.out.print("Aʼs m1,  ");
}
void m2() {
System.out.print("Aʼs m2, " );
}
void m3() {
System.out.print("Aʼs m3, ");
}
}
class B extends A {
void m1() {
System.out.print("Bʼs m1, ");
}
}
class C extends B {
void m3() {
System.out.print("Cʼs m3, "+(ivar + 6));
}
}
public class Mixed2 {
public static void main(String [] args) {
A a = new A();
B b = new B();
C c = new C();
A a2 = new C();
}
}