package now.stellar.nexus;

public final class Nexus {
    private final NexusImplementation implementation;

    public static ConfigBuilder init(NexusImplementation implementation) {
        return new ConfigBuilder(implementation);
    }

    Nexus(ConfigBuilder builder) {
        this.implementation = builder.implementation();
    }
}
