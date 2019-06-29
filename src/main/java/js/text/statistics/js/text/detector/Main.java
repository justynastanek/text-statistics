package js.text.statistics.js.text.detector;

import com.detectlanguage.errors.APIError;

public class Main {
    public static void main(String[] args) {
        APIlanguageDetector api = new APIlanguageDetector("e337d6cffacd9559694a59fb131b7fec");
        try{
            api.detect("Jaki to jezyk?");
        }catch(APIError ex){
            System.out.println("Błąd API key");
        }
    }
}
