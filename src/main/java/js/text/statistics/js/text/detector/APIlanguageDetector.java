package js.text.statistics.js.text.detector;

import com.detectlanguage.DetectLanguage;
import com.detectlanguage.Result;
import com.detectlanguage.errors.APIError;

import java.util.List;

public class APIlanguageDetector implements LanguageDetector{

    private String yourApiKey;

    public APIlanguageDetector(String yourApiKey) {
        this.yourApiKey = yourApiKey;
    }

    @Override
    public String detect(String text) throws APIError {

        DetectLanguage.apiKey = yourApiKey;

        List<Result> results = DetectLanguage.detect(text);

        Result result = results.get(0);

        return "Language: " + result.language + " Is reliable: " + result.isReliable + " Confidence: " + result.confidence ;
    }
}
