package generic_types.ex4;

import java.util.ArrayList;

class MultimediaLibrary <T extends Multimedia>{

    public ArrayList<T> multimediaArrayList;

    public MultimediaLibrary(ArrayList<T> multimediaArrayList) {
        this.multimediaArrayList = multimediaArrayList;
    }
}
