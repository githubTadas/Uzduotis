package OOP.model;

public class Animal{

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


    public Animal(String tipas, String seima, String vardas, float svoris, float ugis, String judejimas){
        this.tipas=tipas;
        this.seima=seima;
        this.vardas=vardas;
        this.svoris=svoris;
        this.ugis=ugis;
        this.judejimas=judejimas;
    }


}
