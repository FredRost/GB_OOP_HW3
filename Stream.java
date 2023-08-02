package Task3;

public interface Stream extends Iterable<EducationalGroup> {
    void addGroup(EducationalGroup group);
    void removeGroup(EducationalGroup group);
}
