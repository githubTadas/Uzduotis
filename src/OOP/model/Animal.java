package OOP.model;

public class Animal implements Animals {

    private String tipas;
    private String seima;
    private String vardas;
    private float svoris;
    private float ugis;
    private String judejimas;

    public String getTipas() {
       return tipas;
    }
    public void setTipas(String tipas)
    {
        this.tipas = tipas;
    }

    public String getSeima() {
        return seima;
    }

    public void setSeima(String seima)
    {
        this.seima = seima;
    }

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas)
    {
        this.vardas = vardas;
    }


    public float getSvoris() {
        return svoris;
    }

    public void setSvoris(float svoris)
    {
        this.svoris = svoris;
    }

    public float getUgis() {
        return ugis;
    }


    public void setUgis(float ugis)
    {
        this.ugis = ugis;
    }

    public String getJudejimas() {
        return judejimas;
    }
    public void setJudejimas(String judejimas)
    {
        this.judejimas = judejimas;
    }


    public void buildAnimal() {

        System.out.println("Gyvuno tipas: + gyvuno seima + gyvuno vardas + gyvuno svoris + gyvuno ugis + gyvuno judejimas");

    }


    @Override
    public void buildAnimal(String tipas, String seima, String vardas, Float svoris, Float ugis, String judejimas) {

    }


}
