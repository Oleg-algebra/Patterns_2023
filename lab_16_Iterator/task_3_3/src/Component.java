public interface Component {
    void execute();
    boolean hasChildren();
    void setParent(Box box);
    Box getParent();
}
