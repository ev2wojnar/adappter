import org.json.JSONObject;

public class Facebook implements Msg {
    private JSONObject jsonObject;

    Facebook(String jsonString) {
        {

            jsonObject = new JSONObject(jsonString);

        }
    }

    public Long getID() {
        return jsonObject.getJSONArray("data")
                .getJSONObject(0)
                .getLong("id");
    }

    public String getMessage() {
        return jsonObject.getJSONArray("data")
                .getJSONObject(0)
                .getString("message");
    }

    public String getDate() {/*...*/
        return jsonObject.getJSONArray("data")
                .getJSONObject(0)
                .getString("created_time");
    }
}