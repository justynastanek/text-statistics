package js.text.statistics.js.text.detector;

import com.detectlanguage.DetectLanguage;
import com.detectlanguage.Result;
import com.detectlanguage.errors.APIError;

import java.util.ArrayList;
import java.util.List;

public class APIlanguageDetector implements LanguageDetector{

    private String yourApiKey;

    public APIlanguageDetector(String yourApiKey) {
        this.yourApiKey = yourApiKey;
    }

    @Override
    public String detect(String text)  {

        DetectLanguage.apiKey = yourApiKey;

        List<Result> results = new ArrayList<>();

        try {

            results = DetectLanguage.detect(text);

        }catch(APIError ex){
            ex.toString();
        }

        Result result = results.get(0);

        return "Language: " + result.language + " Is reliable: " + result.isReliable + " Confidence: " + result.confidence ;


    }
}
