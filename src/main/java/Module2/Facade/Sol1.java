package Module2.Facade;

class Amplifier {
    public void on() {
        System.out.println("Amplifier is on");
    }

    public void off() {
        System.out.println("Amplifier is off");
    }
}

class DVDPlayer {
    public void play(String movie) {
        System.out.println("Playing movie: " + movie);
    }

    public void stop() {
        System.out.println("Stopping DVD player");
    }
}

class Projector {
    public void on() {
        System.out.println("Projector is on");
    }

    public void off() {
        System.out.println("Projector is off");
    }
}

class Screen {
    public void down() {
        System.out.println("Screen is down");
    }

    public void up() {
        System.out.println("Screen is up");
    }
}

class Light {
    public void dim() {
        System.out.println("Lights are dimmed");
    }

    public void bright() {
        System.out.println("Lights are brightened");
    }
}

class PopcornPopper {
    public void pop() {
        System.out.println("Popcorn is popping");
    }

    public void stop() {
        System.out.println("Popcorn is stopped");
    }
}

public class Sol1 {
    public static void main(String[] args) {
         Projector proj = new Projector();
         Amplifier amp = new Amplifier();
         DVDPlayer dvd = new DVDPlayer();
         Light light = new Light();
         Screen screen = new Screen();
         PopcornPopper pop = new PopcornPopper();

        // Simulating a movie night
        proj.on();
        amp.on();
        light.dim();
        screen.down();
        pop.pop();
        dvd.play("Inception");

    }
}


// Cons :
// Client needs to know about all the components
// If client messes up the order of operations, it can lead to issues
// Tight coupling between client and components
// Any change to components requires changes in the client code
// Very hard to maintain and scale