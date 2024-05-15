
class C1 {
    public int x = 5;
    protected int y = 10;
    int z = 15;
    private int a = 20;

    /*
     * this is to show that any access modifier can be accessible
     * from, within the class, meth1 indicates that.
     */
    public void meth1() {
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);

    }
}

class C2 extends C1 {
    public void meth2() {
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}

public class AccessModifiers {
    public static void main(String[] args) {
        C1 c = new C1();
        // c.meth1();
        // output:
        // 5
        // 10
        // 15
        // 20 all are getting printed.

        // can you use all these(access all these) variables under a
        // under a single(common) package?
        // i can only use x,y,z because i am in the same package.
        // and i can't use a because it is private.
        // Eg:
        // System.out.println(c.x);
        // System.out.println(c.y);
        // System.out.println(c.z);
        // System.out.println(c.a);
        // output:
        // this is the error i got
        /*
         * AccessModifiers.java:39: error: a has private access in C1
         * System.out.println(c.a);
         * 1 error
         */
        // so you can't access a because it is private.under the same package.

        C2 c2 = new C2();

        // System.out.println(c2.x);
        // System.out.println(c2.y);
        // System.out.println(c2.z);
        // System.out.println(c2.a);
        // Output:
        /*
         * AccessModifiers.java:56: error: a has private access in C1
         * System.out.println(c2.a);
         * ^
         * 1 error
         */

        c2.meth2();
    }

}