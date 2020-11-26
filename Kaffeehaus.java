
import processing.core.PApplet;
import processing.core.PFont;

/**
 * Klasse Kaffeehaus.
 * Beschreibung: 
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Kaffeehaus extends PApplet
{    
    int abstand=40;
    int s=10;
    int a=40;
    int[] abstaende = {0, 10, 20, 10,0,10,20,10,0,10 };
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(640,400);
    }        

    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
    @Override
    public void setup()
    {
        background(255,255,255);
        noStroke();
        strokeWeight(2);
        fill (0,0,0);
        linien();
        quadrate();

    }

    /**
     * Methode linien
     *
     */
    public void linien()
    {
        for(int f=0; f<10; f=f+1){
            stroke(150);
            line (0, abstand, 640, abstand);

            abstand=abstand+40;
        }
    }

    public void quadrate()
    {
        for(int r=0; r<10; r=r+1){

            for(int l=0; l<10; l=l+1){
                rect(s+abstaende[r]+l*a*2,r*40,a,a);

            }
            
        }
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

    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */    
    public static void main(String _args[]){ 
        PApplet.main(new String[] {Kaffeehaus.class.getName() });
    }

}
