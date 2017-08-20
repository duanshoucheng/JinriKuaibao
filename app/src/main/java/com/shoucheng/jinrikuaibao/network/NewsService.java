package com.shoucheng.jinrikuaibao.network;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by ThinKPad on 2017/8/20.
 */

public class NewsService {
    private static NewsApi mInstance;
    public static NewsApi getInstance() {
        if (mInstance == null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(ConstansURL.baseURL)
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create()) // 使用RxJava作为回调适配器
                    .addConverterFactory(GsonConverterFactory.create()) // 使用Gson作为数据转换器
                    .build();

            mInstance = retrofit.create(NewsApi.class);
        }
        return mInstance;
    }
}
