package Module2.Facade;

class Amplifier2 {
    public void on() {
        System.out.println("Amplifier is on");
    }

    public void off() {
        System.out.println("Amplifier is off");
    }
}

class DVDPlayer2 {
    public void play(String movie) {
        System.out.println("Playing movie: " + movie);
    }

    public void stop() {
        System.out.println("Stopping DVD player");
    }
}

class Projector2 {
    public void on() {
        System.out.println("Projector is on");
    }

    public void off() {
        System.out.println("Projector is off");
    }
}

class Screen2 {
    public void down() {
        System.out.println("Screen is down");
    }

    public void up() {
        System.out.println("Screen is up");
    }
}

class Light2 {
    public void dim() {
        System.out.println("Lights are dimmed");
    }

    public void bright() {
        System.out.println("Lights are brightened");
    }
}

class PopcornPopper2 {
    public void pop() {
        System.out.println("Popcorn is popping");
    }

    public void stop() {
        System.out.println("Popcorn is stopped");
    }
}

class Helper{
    public static void watchMovie(String movie) {
        Amplifier2 amplifier = new Amplifier2();
        DVDPlayer2 dvdPlayer = new DVDPlayer2();
        Projector2 projector = new Projector2();
        Screen2 screen = new Screen2();
        Light2 light = new Light2();
        PopcornPopper2 popcornPopper = new PopcornPopper2();

        // Turn on the components
        amplifier.on();
        projector.on();
        screen.down();
        light.dim();
        popcornPopper.pop();
        dvdPlayer.play(movie);
    }
}

public class Sol2 {
    public static void main(String[] args) {
        // Example usage
        Helper.watchMovie("Inception");
    }
}


// Pros :
// Client code is cleaner and easier to read.
// Client does not need to know about all the components.
// Client would not need to change code if a new component is added.

// Cons :
// Don't have fine grained control over individual components.
// Not truely object oriented as it uses static methods.