package now.stellar.nexus;

public class ConfigBuilder {
    // Fields are package-private so Nexus can get them
    private NexusImplementation implementation;

    public ConfigBuilder(NexusImplementation implementation) {
        this.implementation = implementation;
    }

    public NexusImplementation implementation() {
        return implementation;
    }

    public ConfigBuilder implementation(NexusImplementation implementation) {
        this.implementation = implementation;
        return this;
    }

    public Nexus build() {
        return new Nexus(this);
    }
}
