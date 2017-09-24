class A {
int ivar = 7;
void m1() {
System.out.print("Aʼs m1he,  ");
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
class Name {
public static void main(String [] args) {
A a = new A();
B b = new B();
C c = new C();
A a2 = new C();
a2.m1();
a2.m2();
a2.m3();
}
}