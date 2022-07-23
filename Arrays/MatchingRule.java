package Practice;

import java.util.ArrayList;

public class MatchingRule {
    public int countMatches(ArrayList<ArrayList<String>> items, String ruleKey, String ruleValue) {
        int matchingValues = 0;
        int ruleKeyNumber = switch (ruleKey) {
            case "type" -> 0;
            case "color" -> 1;
            case "name" -> 2;
            default -> -1;
        };

        for (ArrayList<String> item : items) {

            if (ruleKeyNumber == 0) {
                if (item.get(0).equals(ruleValue)) {
                    matchingValues++;
                }
            } else if (ruleKeyNumber == 1) {
                if (item.get(1).equals(ruleValue)) {
                    matchingValues++;
                }
            } else if (ruleKeyNumber == 2) {
                if (item.get(2).equals(ruleValue)) {
                    matchingValues++;
                }
            } }

        return matchingValues;
    }
}
