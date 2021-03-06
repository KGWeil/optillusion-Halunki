
import processing.core.PApplet;
import processing.core.PFont;

/**
 * Klasse Hermanngitter2.
 * Beschreibung: 
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Hermanngitter2 extends PApplet
{   
    int l=0;
    int r=0;
    int a=50;
    int di=15; // Abstand Quadrate innen
    int da=30; // Abstand Quadrate außen
    int kd=15; // Durchmesser Kreis
    float f=87.5f;
    float s=87.5f;
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(500,500);

    }        

    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
    @Override
    public void setup()
    {
        background(66, 165, 250);
        quadrate();
        stroke(255);
        kreis();
    }

    /**
     * Die draw() Methode wird nach der setup() Methode aufgerufen
     * und führt den Code innerhalb ihres Blocks fortlaufend aus,
     * bis das Programm gestoppt oder noLoop() aufgerufen wird.
     */
    @Override
    public void draw()
    {

    }

    public void quadrate()
    {

        fill (0,0,0);
        for(int l=0; l<7; l=l+1){

            for(int r=0; r<7; r=r+1){// macht zeilen
                rect(r*(a+di)+da,l*(a+di)+da,a,a); 

            }
        }
    }

    public void kreis (){
    fill (255,255,255);
    for(int l=1; l<7; l=l+1){

            for(int r=1; r<7; r=r+1){// macht zeilen
                circle(r*(a+di)+da-di/2,l*(a+di)+da-di/2,di); 

            }
        }
    
    
    
    }

    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */    
    public static void main(String _args[]){ 
        PApplet.main(new String[] {Hermanngitter2.class.getName() });
    }

}
