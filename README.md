# JinriKuaibao
今日快报
功能点：
1. 可以上拉下拉刷新
2. 断网处理
3. 缓存处理
4. 标记已读状态

图库使用的是阿里巴巴[国际站图标库](http://iconfont.cn/collections/detail?spm=a313x.7781069.1998910419.de12df413&cid=31)，在此感谢！
要点
1. 使用约束布局：ConstraintLayout。可以减少过度绘制
1. 使用的框架：ButterKnife、Retrofit、RxJava、MVP、Glide、EventBus
1. 热更新
1. 技术要点：
 + 基类BaseRecyclerFragment.
 + 首页的ViewPager使用享元模式