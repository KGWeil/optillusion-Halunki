
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
    int rechteck1=10;
    int rechteck2=0;
    int rechteck3=40;
    int rechteck4=40;
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
        for(int r=0; r<10; r=r+1){

            for(int l=0; l<10; l=l+1){
                /*if(l>0 && l<=3){
                rect(rechteck1, rechteck2, rechteck3, rechteck4);
                rechteck2=rechteck2+40;
                rechteck1=rechteck1+10;
                }
                if (l==3){
                rechteck1=30;
                }
                if (l>3 && l<=6){
                rect(rechteck1, rechteck2, rechteck3, rechteck4);
                rechteck2=rechteck2+40;
                rechteck1=rechteck1-10;
                } 
                if(l==7){
                rect(rechteck1, rechteck2, rechteck3, rechteck4);
                rechteck1=rechteck1+10;
                rechteck2=rechteck2+40;
                }
                if(l==8){
                rect(rechteck1, rechteck2, rechteck3, rechteck4);
                rechteck1=rechteck1+10;
                rechteck2=rechteck2+40;
                }
                if(l>8 && l<=10){
                rect(rechteck1, rechteck2, rechteck3, rechteck4);
                rechteck2=rechteck2+40;
                rechteck1=rechteck1-10;
                }

                }

                rechteck1=rechteck1+80;
                }
                 */
                for(int f=0; f<10; f=f+1){
                    stroke(150);
                    line (0, abstand, 640, abstand);

                    abstand=abstand+40;
                }
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
