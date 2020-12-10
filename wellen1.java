
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
        zeichneQuadrat(1,1,0,true);
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
     * Methode zeichneQuadrate
     *
     * @param x die x Koordinate der Quadrate
     * @param y die y Koordinate der Quadrate
     * @param farbe bestimmt die Farbe der Quadrate
     */ 
    public void zeichneQuadrate(int x, int y, int farbe){
        for (int l=0; l<4; l=l+1){
            for(int r=0; r<8; r=r+1){

                if (farbe==1){
                    fill(0);
                }
                if (farbe==0){
                    fill(255);
                }

                rect(r*a+20,l*a+20,a,a);
            }
        }
        circle(x*40,y*40,25);
        circle (x*40, y*80,25);
    }

    /**
     * Zeichnet ein Quadrat der optischen Illusion
     * @param    x    x-Koordinate
     * @param    y    y-Koordinate
     * @param    farbe    Füllfarbe des Quadrats
     * @param    links     Falls links true ist: Kreise links; falls links false ist: Kreise rechts
     */
    public void zeichneQuadrat( int x, int y, int farbe, boolean links )
    {
        fill(farbe);
        rect(x, y, a,a);
        fill (255-farbe);
        circle(x+a/3,y,a/3);
        circle (x+a/3, y+a*(2/3),a/3);
    }

    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */    
    public static void main(String _args[]){ 
        PApplet.main(new String[] {wellen1.class.getName() });
    }

}
