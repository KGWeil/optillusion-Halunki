
import processing.core.PApplet;
import processing.core.PFont;

/**
 * Klasse wellen1.
 * Beschreibung: 
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class wellen1 extends PApplet
{    
    int a=75;
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(650,500);

    }        

    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
    @Override
    public void setup()
    {
        //orange 250, 163, 23
        // grün 9, 250, 78
        background (250, 163, 23);
        zeichneQuadrate(1,2,1);
        
        
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

    public void zeichneQuadrate(int x, int y, int farbe){
        for (y=y;y<=0; y=y-1){
            for(x=x;x<=0; x=x-1){
                rect(x*a+20,y*a+20,a,a);
            }
        }
    }

    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */    
    public static void main(String _args[]){ 
        PApplet.main(new String[] {wellen1.class.getName() });
    }

}
