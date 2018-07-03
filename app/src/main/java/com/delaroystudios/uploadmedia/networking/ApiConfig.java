package com.delaroystudios.uploadmedia.networking;

/**
 * Created by delaroystudios on 10/5/2016.
 */
import java.util.Map;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PartMap;


public interface ApiConfig {

    @Multipart
    @POST("images/upload_image.php")
    Call<ServerResponse> upload(
            @Header("Authorization") String authorization,
            @PartMap Map<String, RequestBody> map
    );


    //Chnges in master branch


    //TODO: Add your own commits
    //Write your own method to call specific php server endpoints  Commit#3
    //This is 2nd line of commit#3

    //This is 3rd line of commit#3


    //this is commit#4

    //this is undo commit then making commit#5


    //---------- fresh start --------------
    //This is only commit#6 from studio

}