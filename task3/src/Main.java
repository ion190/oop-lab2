public class Main {
    public static void main(String[] args) {
        Display display1 = new Display(1920, 1080, 401, "Model A");
        Display display2 = new Display(2560, 1440, 529, "Model B");
        Display display3 = new Display(3840, 2160, 163, "Model C");

        Assistant assistant = new Assistant("Alex");

        assistant.assignDisplay(display1);
        assistant.assignDisplay(display2);
        assistant.assignDisplay(display3);

        assistant.assist();

        assistant.buyDisplay(display2);
    }
}
