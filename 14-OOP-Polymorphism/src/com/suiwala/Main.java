package com.suiwala;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No Plot Here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }

    public String plot() {
        return "A Shark eats lot of People";
    }
}

class IndependenceDay extends Movie {
    public IndependenceDay() {
        super("Independence Day");
    }

    public String plot() {
        return "Aliens attempt to take planet earth";
    }
}

class MazeRunner extends Movie {
    public MazeRunner() {
        super("Maze Runner");
    }

    public String plot() {
        return "Kids try to escape a Maze";
    }
}

class StarWars extends Movie {
    public StarWars() {
        super("Star Wars");
    }

    public String plot() {
        return "Imperial Forces try to take over";
    }
}


class Forgetable extends Movie {
    public Forgetable() {
        super("Forgetable");
    }

    //no plot
}

public class Main {

    public static void main(String[] args) {
        for(int i=0;i<11;i++)
        {
            Movie movie = RandomMovie();
            System.out.println("Movie # "+i+" "+movie.getName()+ "\n"+
                    "Plot: "+ movie.plot()+ "\n"
                    );

        }
    }

    public static Movie RandomMovie(){
        int randomnum = (int)(Math.random()*5)+1;
        System.out.println("Random Number: "+ randomnum);
        switch (randomnum){
            case 1:
                return new Jaws();

            case 2:
                return new IndependenceDay();

            case 3:
                return  new MazeRunner();

            case 4:
                return new StarWars();

            case 5:
                return new Forgetable();

        }
        return null;
    }
}
