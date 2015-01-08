package metricscat.net.sdk;

import android.app.Application;

/**
 * Created by User on 20.12.2014.
 */
public class App extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        MCat.start(this);
    }

    @Override
    public void onTerminate() {
        MCat.stop(this);
        super.onTerminate();
    }
}
