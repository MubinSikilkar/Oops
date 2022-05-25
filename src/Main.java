
abstract class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String plot() {
        return "No plot here";
    }


}

class HarryPotter extends Movie {
    public HarryPotter() {
        super("Harry Potter");
    }

    @Override
    public String plot() {
        return "Voldemort wants to kill Harry Potter";
    }
}

class RRR extends Movie {
    public RRR() {
        super("RRR");
    }

    @Override
    public String plot() {
        return "A forest man in conquest to find a girl of his tribe";
    }
}

class Conjuring extends Movie {
    public Conjuring() {
        super("Conjuring 2");
    }

    @Override
    public String plot() {
        return " A family goes to a haunted house and everything goes upside down";
    }
}

class Forgettable extends Movie {
    public Forgettable() {
        super("Forgettable");
    }

}

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            Movie movie = randomMovie(); // *************
            System.out.println("Movie #" + i + ":" + movie.getName() + "\n" + "Plot : " + movie.plot() + "\n");
        }

    }

    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 5);
        System.out.println("Random number generated is " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new HarryPotter();
            case 2:
                return new RRR();
            case 3:
                return new Conjuring();
            case 4:
                return new Forgettable();

        }
        return null;

    }
}

