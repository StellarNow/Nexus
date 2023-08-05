package now.stellar.nexus;

public abstract class NexusImplementation {
    public abstract void start() throws RuntimeException;
    public abstract void stop();
    public abstract NexusTable[] registerTables();
}
