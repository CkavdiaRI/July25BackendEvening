package Module2.Facade;

// Facade design pattern provides a simplified interface to a complex subsystem.

class HomeTheaterFacade {
    private Amplifier amplifier;
    private DVDPlayer dvdPlayer;
    private Projector projector;
    private Screen screen;
    private Light light;
    private PopcornPopper popcornPopper;

    public HomeTheaterFacade(){
        this.amplifier = new Amplifier();
        this.dvdPlayer = new DVDPlayer();
        this.projector = new Projector();
        this.screen = new Screen();
        this.light = new Light();
        this.popcornPopper = new PopcornPopper();
    }

    // Method with simplified interface to watch a movie
    public void watchMovie(String movie) {
        popcornPopper.pop();
        light.dim();
        screen.down();
        projector.on();
        amplifier.on();
        dvdPlayer.play(movie);
    }

    public void endMovie() {
        dvdPlayer.stop();
        projector.off();
        screen.up();
        light.bright();
        popcornPopper.stop();
        amplifier.off();
    }
}

public class Sol3 {
    public static void main(String[] args) {
        HomeTheaterFacade facade = new HomeTheaterFacade();
        facade.watchMovie("Inception");
    }
}

// Pros :
// 1. Simplifies complex subsystem interactions by providing a unified interface.
// 2. Reduces dependencies between subsystems, promoting loose coupling.
// 3. Enhances code readability and maintainability by hiding implementation details.


// When to use facade design pattern:
// 1. When you want to provide a simple interface to a complex subsystem.
// 2. When you want to decouple a client from a complex subsystem.
// 3. When you want to provide a unified entry point to a group of serivces.