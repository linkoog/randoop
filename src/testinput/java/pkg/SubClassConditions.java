package pkg;

public class SubClassConditions {

    // void pkg.SubClass.methodWithOverride(int count)
    public static boolean m0_p0(pkg.SubClass target, int count) {
        // @param count the count of things, must be positive ==> args[0]>0
        return count > 0;
    }

    // void pkg.SubClass.methodWithImplicitOverride(int count)
    public static boolean m1_p0(pkg.SubClass target, int count) {
        // @param count the object count, must be positive ==> args[0]>0
        return count > 0;
    }

    // void pkg.SuperClass.methodWithoutOverride(int count)
    public static boolean m2_p0(pkg.SuperClass target, int count) {
        // @param count the something count, must be positive ==> args[0]>0
        return count > 0;
    }
}
