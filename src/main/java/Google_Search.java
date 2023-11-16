//import java.util.HashMap;
//import java.util.Map;
//
//public class Google_Search {
//    public static void main(String[] args){
//        if(args.length != 1) {
//            System.out.println("Usage: app <secret api key>");
//            System.exit(1);
//        }
//
//        String location = "Austin,Texas";
//        System.out.println("find the first Coffee in " + location);
//
//        // parameters
//        Map<String, String> parameter = new HashMap<>();
//        parameter.put("q", "Coffee");
//        parameter.put("location", location);
//        parameter.put(GoogleSearch.SERP_API_KEY_NAME, args[0]);
//
//        // Create search
//        GoogleSearch search = new GoogleSearch(parameter);
//
//        try {
//            // Execute search
//            JsonObject data = search.getJson();
//
//            // Decode response
//            JsonArray results = (JsonArray) data.get("local_results");
//            JsonObject first_result = results.get(0).getAsJsonObject();
//            System.out.println("first coffee: " + first_result.get("title").getAsString() + " in " + location);
//        } catch (SerpApiSearchException e) {
//            System.out.println("oops exception detected!");
//            e.printStackTrace();
//        }
//    }
//}
