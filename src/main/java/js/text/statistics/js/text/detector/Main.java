package js.text.statistics.js.text.detector;

public class Main {
    public static void main(String[] args) {

        APIlanguageDetector api = new APIlanguageDetector("75f60058f46324837e576ecd46d525e3");

        System.out.println(api.detect("The United States and China have agreed to resume trade negotiations, easing a protracted row that has fuelled a global economic slowdown"));

    }
}
