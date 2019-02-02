public class Lesson1 {
    public static void main(String[] args) {
        String givenName = null;
        if( args.length > 0) {
            givenName = args[0];
        }
        Lesson1 newLesson1 = new Lesson1(givenName);
        if( newLesson1.getName() != null) {
            System.out.println(String.format("Hello %s!", newLesson1.getName()));
        } else {
            System.out.println("Hello World!");
        }
    }

    private String name;

    public Lesson1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}