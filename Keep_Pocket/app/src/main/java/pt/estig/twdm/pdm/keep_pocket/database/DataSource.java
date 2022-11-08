package pt.estig.twdm.pdm.keep_pocket.database;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class DataSource {

    private static final String endpoint = "https://my-json-server.typicode.com/BrunoHorta-22541/";

    private static Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(endpoint)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    private static KPAPIService kpapiService = retrofit.create(KPAPIService.class);

    public static KPAPIService getService() {
        return kpapiService;
    }
}
