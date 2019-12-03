package br.com.senaigo.mobile.vouaprenderandroid.api;

import br.com.senaigo.mobile.vouaprenderandroid.entidades.Login;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface LoginResorce {

    //Envia um posts para o servidor
    @POST("auth/login")
    Call<Login> post(@Body Login login);

//    //Recuperada um posts baseado em um ID
//    @GET("posts/{id}")
//    Call<Login> get(@Path("id") Integer id);
//
//    //Tràs a lista de posts;
//    @GET("posts")
//    Call<List<Login>> get();
//
//    //Atualizada o objeto posts inteiramente
//    @PUT("posts/{id}")
//    Call<Login> put(@Path("id") Integer id, @Body Login post);
//
//    //Atualiza parcialmente um post
//    @PATCH("posts/{id}")
//    Call<Login> patch(@Path("id") Integer id, @Body Login post);
//
//    //Apaga um posts baseado em um ID
//    @DELETE("posts/{id}")
//    Call<Void> delete(@Path("id") Integer id);


}
