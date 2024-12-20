package builder;

public class Computer {

    // Required parameters.
    private final String CPU;
    private final String RAM;

    // Optional parameters.
    private final boolean hasGraphicsCard;
    private final boolean hasLiquidCooling;
    private final String storage;
    private final String powerSupply;
    private final String operatingSystem;

    // Private constructor for Builder pattern.
    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.hasGraphicsCard = builder.hasGraphicsCard;
        this.hasLiquidCooling = builder.hasLiquidCooling;
        this.storage = builder.storage;
        this.powerSupply = builder.powerSupply;
        this.operatingSystem = builder.operatingSystem;
    }

    @Override
    public String toString() {
        return "Computer [CPU=" + CPU + ", RAM=" + RAM + ", hasGraphicsCard=" + hasGraphicsCard +
                ", hasLiquidCooling=" + hasLiquidCooling + ", storage=" + storage +
                ", powerSupply=" + powerSupply + ", operatingSystem=" + operatingSystem + "]";
    }

    public static class Builder {
        // Required parameters
        private final String CPU;
        private final String RAM;

        // Optional parameters - default values
        private boolean hasGraphicsCard = false;
        private boolean hasLiquidCooling = false;
        private String storage = "1TB HDD";
        private String powerSupply = "500W";
        private String operatingSystem = "Windows 10";

        public Builder(String CPU, String RAM) {
            this.CPU = CPU;
            this.RAM = RAM;
        }

        public Builder withGraphicsCard(boolean hasGraphicsCard) {
            this.hasGraphicsCard = hasGraphicsCard;
            return this;
        }

        public Builder withLiquidCooling(boolean hasLiquidCooling) {
            this.hasLiquidCooling = hasLiquidCooling;
            return this;
        }

        public Builder withStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder withPowerSupply(String powerSupply) {
            this.powerSupply = powerSupply;
            return this;
        }

        public Builder withOperatingSystem(String operatingSystem) {
            this.operatingSystem = operatingSystem;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
