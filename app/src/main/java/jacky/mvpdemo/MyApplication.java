package jacky.mvpdemo;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;

import com.blankj.utilcode.utils.Utils;
import com.yuan.leopardkit.db.dao.DaoMaster;
import com.yuan.leopardkit.db.dao.DaoSession;

import jacky.mvpdemo.bean.Shop;

/**
 * Created by 1507 on 2017/1/13.
 */

public class MyApplication extends Application {
    private static DaoSession daoSession;

    @Override
    public void onCreate() {
        super.onCreate();
        Utils.init(getApplicationContext());
        setupDatabase();
    }

    /**
     * 配置数据库
     */
    private void setupDatabase() {
        //创建数据库shop.db"
        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(this, "user.db", null);
        //获取可写数据库
        SQLiteDatabase db = helper.getWritableDatabase();
        //获取数据库对象
        DaoMaster daoMaster = new DaoMaster(db);
        //获取Dao对象管理者
        daoSession = daoMaster.newSession();

    }

    public static DaoSession getDaoInstant() {
        return daoSession;
    }
}
