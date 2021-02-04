
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
    int s=75;
    int a=10;
    int l;
    int farbe2;

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

        zeichneQuadrate(1,2,3);
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
        for (l=0; l<4; l=l+1){
            if(l%2==0){

            }

            if (l%2==1){

            }
            for (int w=0; w<8; w=w+1){ 

                strokeWeight(1);
                if(w%2==0){
                    zeichneQuadrat(w*75,75*l,255, true);
                }
                if (w%2==1){
                    zeichneQuadrat(w*75,75*l,0,true);
                }

            }
            stroke(9, 250, 78);
            strokeWeight(5);
            line (x+a,l*75+a,x+600,l*75+a);

        }
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
        
        if (l%2==1){

            if (farbe==255){
                farbe2=0;
                stroke(0);
            }else{
                farbe2=255;
                stroke(255);
            }    
        }
        if (l%2==1){

            if (farbe==255){
                farbe2=255;
                stroke(255);
            }else{
                farbe2=0;
                stroke(0);
            }  
        }
        fill(farbe2);
        rect(x+a, y+a, s,s);
        fill (farbe);
        circle(x+s/4+a,y+(s/4)+a,s/4);
        println(y+(s/3));
        println(s);
        println(s*(2/3));
        circle (x+s/4+a,y+56+a,s/4);

    }

    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */    
    public static void main(String _args[]){ 
        PApplet.main(new String[] {wellen1.class.getName() });
    }

}
