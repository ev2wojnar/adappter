public class Main {

    public static void main(String[] args) {
        String facebookJsonString = "{  \"data\":  [\n" +
                "\t {  \"created_time\":  \"2017-12-08T01:08:57+0000\",\n" +
                "\t    \"message\":  \"Love this puzzle. One of my favorite puzzles\",\n" +
                "\t     \"id\":  \"429989313531\"\n" +
                "\t  } \n" +
                "\t]\n" +
                "}";
        Msg facebookAdapter = new Facebook(facebookJsonString);
    }

}
