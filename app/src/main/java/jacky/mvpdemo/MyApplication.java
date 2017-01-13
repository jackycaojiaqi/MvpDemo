package jacky.mvpdemo;

import android.app.Application;

import com.blankj.utilcode.utils.Utils;

/**
 * Created by 1507 on 2017/1/13.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Utils.init(getApplicationContext());
    }
}
