package vitamin;

public interface Builder {
    Builder addChemical();
    Builder addWater();
    Vitamin build();
}
