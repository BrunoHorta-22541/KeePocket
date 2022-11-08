package pt.estig.twdm.pdm.keep_pocket.database;
import java.util.List;

import pt.estig.twdm.pdm.keep_pocket.Category;
import pt.estig.twdm.pdm.keep_pocket.Movement;
import pt.estig.twdm.pdm.keep_pocket.User;
import retrofit2.Call;
import retrofit2.http.GET;

public interface KPAPIService {
    @GET("KeePocket/category")
    Call<List<Category>> getCategory();

    @GET("KeePocket/movement")
    Call<List<Movement>> getMovements();


    /*
    @GET("")
    Call<List<User>> getUsers();
    */

}
