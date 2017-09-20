package com.shoucheng.jinrikuaibao;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

import com.shoucheng.jinrikuaibao.network.NewsService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.BindView;

public class MainActivity extends BaseActivity {
    @BindView(R.id.personalCenter)
    ImageView personalCenter;
    @BindView(R.id.mRecycler)
    RecyclerView mRecycler;

    private List<String> mList = new ArrayList<>();

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }


    @Override
    public void initView() {
        super.initView();
        fetchNewsData();

        initReccler();
    }

    private void fetchNewsData() {
        for (int i = 0; i < 100; i++) {
            mList.add("title: ===="+i);
        }

        NewsService.getInstance().fetchNewsLists();
        String host = "http://ali-news.showapi.com";
        String path = "/newsList";
        String method = "GET";
        String appcode = "你自己的AppCode";
        Map<String, String> headers = new HashMap<String, String>();
        //最后在header中的格式(中间是英文空格)为Authorization:APPCODE 83359fd73fe94948385f570e3c139105
        headers.put("Authorization", "APPCODE " + appcode);
        Map<String, String> querys = new HashMap<String, String>();
        querys.put("channelId", "5572a108b3cdc86cf39001cd");
        querys.put("channelName", "channelName");
        querys.put("maxResult", "20");
        querys.put("needAllList", "1");
        querys.put("needContent", "0");
        querys.put("needHtml", "0");
        querys.put("page", "1");
        querys.put("title", "title");
//        try {
//            /**
//             * 重要提示如下:
//             * HttpUtils请从
//             * https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/src/main/java/com/aliyun/api/gateway/demo/util/HttpUtils.java
//             * 下载
//             *
//             * 相应的依赖请参照
//             * https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/pom.xml
//             */
//            HttpResponse response = HttpUtils.doGet(host, path, method, headers, querys);
//            System.out.println(response.toString());
//            //获取response的body
//            //System.out.println(EntityUtils.toString(response.getEntity()));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }

    private void initReccler() {
        LinearLayoutManager manager = new LinearLayoutManager(this);
        mRecycler.setLayoutManager(manager);
        ListNewsAdapter adapter = new ListNewsAdapter(this, mList);
        mRecycler.setAdapter(adapter);
    }

}
