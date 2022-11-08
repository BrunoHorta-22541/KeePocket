package pt.estig.twdm.pdm.keep_pocket.database;
import pt.estig.twdm.pdm.keep_pocket.Category;
import pt.estig.twdm.pdm.keep_pocket.Movements;
import pt.estig.twdm.pdm.keep_pocket.User;
import retrofit2.Call;
import retrofit2.http.GET;

public interface KPAPIService<C> {
    @GET("")
    Call<KPAPIService<Category>> getPersons();

    @GET("")
    Call<KPAPIService<Movements>> getPlanets();

    @GET("")
    Call<KPAPIService<User>> getUsers();
}
