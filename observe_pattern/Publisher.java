public interface Publisher {
    public abstract void addSubcriber(Subcriber subcriber);

    public abstract void removeSubcriber(Subcriber subcriber);

    public abstract void notifier();

}
