public class Country {
    private String iso;
    private String name;
    private int dimensions;
    private int population;
    private int populationDensity;

    public Country(String name, String iso, int dimensions, int population, int populationDensity){
        this.name = name;
        this.iso = iso;
        this.dimensions = dimensions;
        this.population = population;
        this.populationDensity = populationDensity;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public String getName(){
        return this.name;
    }

    public String getIso(){
        return this.iso;
    }

    public int getDimensions(){
        return this.dimensions;
    }

    public int getPopulation(){
        return this.population;
    }

    public int getPopulationDensity(){
        return this.populationDensity;
    }
}
