package com.shoucheng.jinrikuaibao.network;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by ThinKPad on 2017/8/20.
 */

public interface NewsApi {
    @GET("newsList")
    Call<String> fetchNewsLists();
}
