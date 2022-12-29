public class Country {
    public Country(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public boolean getSeaExit() {
        return seaExit;
    }

    public void setSeaExit(boolean seaExit) {
        this.seaExit = seaExit;
    }

    public String name;
    public int population;
    public double square;
    public String capital;
    public boolean seaExit;
}
