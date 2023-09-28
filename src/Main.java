public class Main {
    public static void main(String[] args) {
        System.out.println("the admins are not the same? boo!:(");
        System.out.println("the admins are the same? yay!:)");
        Admin c1 = Admin.getInstance("Juan");
        Admin c2 = Admin.getInstance("Ricardo");
        System.out.println(c1.getName());
        System.out.println(c2.getName());

    }
}