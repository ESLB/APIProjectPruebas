package strauss.levano.eduardo.apiproject;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

//Interfaz obligatoria para utilizar Retrofit, aquí hay un ejemplo de cómo funciona

public interface GitHubClient {

    @GET("/users/{user}/repos")
    Call<List<GitHubRepo>> reposForUser(@Path("user") String user);


}
