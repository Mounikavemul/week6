package vitamin ;

public class VitaminBuilder implements Builder{
    
    VitaminBuilder() {
        
    }

    @Override
    public VitaminBuilder addChemical() {
        System.out.println("Chemical added to vitamin");
        return this;
    }

    @Override
    public VitaminBuilder addWater() {
        System.out.println("Water is added to vitamin");
        return this;
    }

    @Override
    public Vitamin build() {
        Vitamin v=new Vitamin();
        System.out.println("New vitamin made!");
        return v;
    }
}
