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

    //THis is only commit#7 then followed by push from studio

    //-----Another case commit..then undo commit...makes chnges same line...commit then push
    //1.only commit#8 whch will b undo then ....this line modified at same ...where previous line was..

    //2. after undo commit#8...this is changelist with this new line.....commit then push check whats the push shows in parent


    //------3rd case for same use case :) ......
    //A] cOMmit#10 ......this line has now been modified ....only commit then undo it...
    //B] comMit#11.....this is new commit followed by push all together including chngelist got
    //      from undo cOMmit#10.......but while commiting you have to select that chngelist instead of default to able to commit

}