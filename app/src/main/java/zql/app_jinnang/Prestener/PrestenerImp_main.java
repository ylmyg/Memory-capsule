package zql.app_jinnang.Prestener;

import java.util.List;

import zql.app_jinnang.Bean.NoteBean;

/**
 * Created by 尽途 on 2018/4/4.
 */

public interface PrestenerImp_main {
    public void openAddActivity(int type);//打开添加事件的界面
    public void openAddActivityS(String path);
    public void openCalendarActivity();//打开日历界面
    public void openSearchActivity();//打开新的搜索界面
    public void openListActivity();//打开事件列表的界面
    public void openSetiongActivity();//打开用户设置界面
    public void readNotefromDatatoMain();//获取信息从数据库并展现在MainActivity上
    public void deleteNoteBean(NoteBean noteBean);//删除一个Notebean
    public void setBackgroundcolorfromSeting();//改变主题
    public int getBackgroundcolorNumfromSering();//获取
}