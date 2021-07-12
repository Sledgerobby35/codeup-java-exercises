public class ServerNameGenerator {
    public static void main(String[] args) {
        String adjective = randomElement(adjectives);
        String noun = randomElement(nouns);
        System.out.printf("Here is your server name:\n%s-%s", adjective, noun);
    }
    public static String[] adjectives = {
            "adorable", "aggressive", "alert", "amused", "annoyed", "anxious",
            "ashamed", "average", "bad", "better", "black", "blue", "blushing",
            "brainy", "breakable", "busy", "careful", "charming", "clean", "colorful"
    };

    public static String[] nouns = {
            "people", "history", "way", "art", "world", "information", "map",
            "family", "government", "health", "system", "computer", "meat", "year",
            "thanks", "music", "person", "reading", "method", "data"
    };

    public static String randomElement(String[] array){
        int i = (int) (Math.random() * array.length);
        return array[i];
    }
}
