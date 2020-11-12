
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
    int rechteck1=0;
    int rechteck2=40;
    int rechteck3=10;
    int rechteck4=50;
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
        for (int f=0; f<10; f++){
            fill (0, 0, 0);
            for (int l=0; l<10; l++){
                
            for (int r=0; r<10; r++){
                rect (rechteck3,rechteck1,rechteck4,rechteck2);
                rechteck1=rechteck1+40;
                rechteck2=rechteck2+40;
            }
            rechteck3=rechteck3+40;
            rechteck4=rechteck4+40;
        }
            stroke(150);
            line (0, abstand, 640, abstand);

            abstand=abstand+40;
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
