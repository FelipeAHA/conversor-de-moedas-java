import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ConvertorJson {

    public ConversorDeMoedasJson converterDoJson(String json){
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).setPrettyPrinting().create();

        ConversorDeMoedasJson conversor = gson.fromJson(json, ConversorDeMoedasJson.class);

        return conversor;
    }
}
