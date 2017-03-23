package module7.offline;

/**
 * Created by citsym on 23.03.17.
 */
public class MakeCoctails {

    public static void main(String[] args) {

        Blender<Omlet> omletBlender = new Blender<>();



        Omlet omlet =omletBlender.makeCoctail(new Egg());



        Blender<GreenCoctail> greenBlender = new Blender<>();


        GreenCoctail greenCoctail=  greenBlender.makeCoctail(new Grass());



    }
}
