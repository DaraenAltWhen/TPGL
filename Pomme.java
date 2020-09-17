/**
 *
 * @author lb853849
 */
public class Pomme {
    private double prix;
    private String origine;
	
    public Pomme() 
    {
        this.prix = 0.5;  //prix en euros
        this.origine="France";
    }
    
    public Pomme(double prix, String origine) 
    {
	if(prix < 0)
	    this.prix = -prix;  //une solution possible pour interdire les prix negatifs
	else
	    this.prix = prix;

	if(origine.equals(""))
            this.origine = "France";  //France par défaut
	else
            this.origine = origine;   
    }

    public double getPrix(){
	return prix;
    }

    public void setPrix(double prix){
	this.prix=prix;
    }

    public String getOrigine(){
	return origine;
    }
 
    public void setOrigine(String origine){
	this.origine=origine;
    }

    @Override
    public String toString(){
        return "Pomme de " + origine + " a " + prix + " euros";
    }

    @Override
    public boolean equals(Object o){  //predicat pour tester si 2 pommes sont equivalentes
        if(o != null && getClass() == o.getClass()){
            Pomme po = (Pomme) o;
            return (prix == or.prix && origine.equals(or.origine));
        }
        return false;
    }

    public boolean isSeedless() {  //predicat indiquant qu'une pomme a des pepins
        return false;
    }


    public static void main (String[] args){
        
   }
}
