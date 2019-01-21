package a_dictionary;

import a_dictionary.controller.DictionaryEngine;
import a_dictionary.model.Dictionary;
import a_dictionary.view.DictionaryFrame;

public class DictionaryRunner {
    public static void main(String[] args) {
        Dictionary d = new Dictionary();
        d.loadFromFile("EngUkr.txt");
        DictionaryFrame frame = new DictionaryFrame(600,400);
        DictionaryEngine engine = new DictionaryEngine(frame, d);
        frame.setControllers(engine);
    }
}
