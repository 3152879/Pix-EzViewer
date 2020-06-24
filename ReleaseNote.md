# TODO
- [ ] 用户页FAB位置移动至顶栏
- [ ] 用户页顶栏图片不隐藏/详情页显示
- [ ] 下载管理增加：全部暂停
- [ ] 加入下载队列 Toast 开关
- [ ] 详情页面控件着色及主题
- [ ] 详情页面背景高斯模糊（可选）
- [ ] blocktags 独立view
- [ ] 新的布局极简布局，save、like 按钮合并为点击+长按
- [ ] pixiv画廊（登陆页面背景）
- [ ] 顶栏等尺寸细节调整
- [-] 瀑布流间距调整
- [ ] 瀑布流性能优化
- [ ] 更多图标（可开关）
- [ ] 画师TAB栏改为顶部展示卡片+详情
- [!] 允许用户使用pixivc等中转站api
- [ ] R18单独文件夹；
- [ ] 下载管理修复：restart后UI更新只移除任务，需要重新进入
- [ ] 搜索记录tag长按删除卡顿优化-后台线程

# 更新日志：
## 1.5.6R:
- [x] fix&update: 启动加载优化，解决部分环境下首页持续刷新中问题，首页加载速度X2+
- [x] fix&update: 图片详情横栏在部分复杂情况下的正确隐藏
- [x] feature: 自定义图片保存格式模板（覆盖旧设置，有改动的需要重设）
- [x] feature: 新顶栏banner点击后变色
- [x] update: 阴影调整
- [x] update: 画师详情页面相关过渡动画优化
- [x] update: 用户头像缓存策略优化
- [x] fix: 参数、可读性、性能及安全优化
- [x] update: 使用DataHolder代替intent在activity传递图片数据，尽量减少查看时重新请求数据
## 1.5.5W:
- [x] update #1, 返回时直接退出搜索
- [x] fix&update: 暗黑模式优化：图标颜色修正#2, 占位图颜色修正，layout颜色修正#4
- [x] fix: 图片详情左右划动正确处理fragment状态避免加载失败
- [x] feature: 新的滑动式 pixivision 顶栏banner，减少交互层级（可设置切换），动画调整中，欢迎交流反馈or贡献代码
- [x] feature: 下载列表支持下拉刷新
- [x] feature: 新的中等尺寸图像展示卡片布局：仅保留作者小头像+简化标题，推荐用于首页、用户收藏、搜索结果
- [x] feature: 新布局长按用户头像关注
- [x] feature: gif允许下载首图
- [x] update: 图片加载性能优化
- [x] update: 查看图片过程过渡动画调整，更加流畅
- [x] fix: 正确处理gif加载过渡动画
- [x] update: 阴影效果调整
- [x] update: 使用对象传递避免查看时重新请求数据，减少卡顿(类似@4ed6740d8532f013ab40ab046cf47b530478cf4e,@132f882b9fc4bf6fbfa0fb9ecc9e48a862d64017)
- [x] fix: 参数及空指针安全优化
## 1.5.5R:
- [x] feature&fix: #1 由tag进入搜索界面后可点击顶部文字跳转至修改框
- [x] feature: 首页、用户收藏、搜索结果使用中等尺寸图像展示卡片布局：作者头像+作者昵称+标题（可在设置页面关闭）
- [x] feature: 图像展示卡片、图片下载按钮 长按显示更多详细信息
- [x] feature&fix: 在自己的用户页，不隐藏已收藏图片
- [x] update: 删除已完成任务卡顿优化-后台线程
- [x] update: 多任务下载卡顿优化-后台线程
- [x] feature: 下载管理增加：线程设置
- [x] update: 图片详情页面下载图标尺寸增大方便点击
- [x] feature: 新增命名格式改为：id(user)_title,（与MIUI相册兼容）
- [x] feature&fix: 标题中的"\t" 字符视为illegal
- [x] update: 高亮黄色调整：稍降亮度提高饱和度，不再刺眼
- [x] update: 图片详情未展开底栏同样使用黄色圆环标记已关注
- [x] update&fix: （部分）类重命名及代码可读性优化
- [x] update&fix: AS4.0 DataBinding 设置更新
## 1.5.4Y:
- [x] feature: 排行页未展开底栏同样使用黄色圆环标记已关注 ~~（首页推荐要不要加呢）~~
- [x] feature: 图片详情页面下载图标长按显示更多详情
- [x] feature: 命名格式新增： ~~id@user_title~~ （1.5.5R修改）, 与 id_title 格式下载文件已存在判断兼容
- [x] feature&fix: 下载页面resume尝试恢复异常型fail任务
- update&fix: 细节调整及其他优化

##1.5.4B
- [x] feature: 启动 app 时恢复先前未完成任务（可在设置页关闭）
- [x] update: 更新 aria2 框架
- [x] fix: 解决部分场景下网络异常切换时恢复任务失败而无限 wait 的问题
- update&fix: 其他优化
##1.5.4W
- [x] feature: 避免使用 windows 下禁用的 ascii 特殊字符（如 *，?）命名文件，使用 Unicode 类似字符替代
- [x] feature: 分别保存搜索页面与用户页面下隐藏已收藏图片功能的选择
- [x] feature: 下载管理器菜单 增加 移除已完成任务
- [x] feature: 启动 app 时仅移除已完成任务
- [x] update:更换 Bugly ID