public class ClassNameTest {
    private static ClassNameExample classNameExample;
    private static final String[] validClassName = {"C4980G", "A2988H", "C0318G"};
    private static final String[] invalidClassName = {"hello", "M0318G", "P0323A"};

    public static void main(String[] args) {
        classNameExample = new ClassNameExample();
        for (String className : validClassName) {
            boolean isvalid = classNameExample.validate(className);
            System.out.println("Class name " + className + " is " + isvalid);
        }

        for (String className : invalidClassName) {
            boolean isvalid = classNameExample.validate(className);
            System.out.println("Class name " + className + " is " + isvalid);
        }
    }
}
