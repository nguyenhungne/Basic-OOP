public interface IFraction {
    int numPart();
    int denPart();

    IFraction add(IFraction f);
    IFraction minus(IFraction f);
    IFraction times(IFraction f);
    void simplify();
}
