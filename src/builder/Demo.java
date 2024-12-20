package builder;

public class Demo {

    public static void main(String[] args) {
        Computer basicComputer = new Computer
                .Builder("Intel i5", "8GB")
                .build();

        System.out.println("Basic Computer Config: ");
        System.out.println(basicComputer);
        System.out.println();

        // High-end configuration.
        Computer gamingComputer = new Computer
                .Builder("Intel i9", "32GB")
                .withGraphicsCard(true)
                .withLiquidCooling(true)
                .withStorage("2TB SSD")
                .withPowerSupply("750W")
                .withOperatingSystem("Ubuntu 22.04")
                .build();

        System.out.println("High-end Gaming Computer Config: ");
        System.out.println(gamingComputer);
    }
}
