import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Americano americano = new Americano(Intensity.NORMAL, 200);
        Cappuccino cappuccino = new Cappuccino(Intensity.STRONG, 150);
        PumpkinSpiceLatte pumpkinSpiceLatte = new PumpkinSpiceLatte(Intensity.NORMAL, 100, 300);
        SyrupCappuccino syrupCappuccino = new SyrupCappuccino(Intensity.LIGHT, 150, SyrupType.CHOCOLATE);

        Barista barista = new Barista();

        barista.prepareCoffees(Arrays.asList(americano, cappuccino, pumpkinSpiceLatte, syrupCappuccino));
    }
}