public class Movie {
    private String title;
    public Movie(String title) {
        this.title = title;
    }
    public void watchMovie() {

        String instanceType = this.getClass().getSimpleName();
        System.out.println(title + " = " + instanceType);
    }
    public static Movie getMovie(String type, String title){// This type of method is called FACTORY METHOD
         return switch (type.toUpperCase().charAt(0)){ //type ko pakdo, use uppercase
             //banao aur fir bas first character ko pakdo. Therefore Adventure becomes
             // Switch ('A')
             case 'A'-> new Adventure(title);
             case 'C'->new Comedy(title);
             default -> new Movie(title);
         };
    }

}
class Adventure extends Movie {

    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),
                "Pleasant Scene",
                "Scary Music",
                "Something Bad Happens");
    }
}

class Comedy extends Movie{

    public Comedy(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),
                "Somethng Funny Happens",
                "Joke is cracked",
                "Everybody Laughes");
    }
}