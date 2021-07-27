/**
 * Facade class
 */

public class Game {
    private InputSystem input = new InputSystem();
    private GameObjects objects = new GameObjects();
    private GameConsole screen = new GameConsole();

    public void update() {
        // Input
        input.getInput();

        // Update game object
        objects.update(input);

        // Draw game object to the screen
        screen.draw(objects);
    }
}
