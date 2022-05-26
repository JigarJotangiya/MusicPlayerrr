package net.coocent.android.xmlparser.application;

import android.app.Activity;
import android.app.Application;
import androidx.annotation.Keep;
import java.util.Collections;
import java.util.List;
import net.coocent.android.xmlparser.C9502v;
import net.coocent.android.xmlparser.ads.AppOpenAdManager;
import net.coocent.android.xmlparser.p461z.C9564d;
import p159f.p237d.p238a.C4824b;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

public abstract class AbstractApplication extends Application {

    /* renamed from: h */
    protected static Application f36257h;

    /* renamed from: g */
    private AppOpenAdManager f36258g;

    public static native String get(int i);

    @Keep
    public static Application getApplication() {
        return f36257h;
    }

    public static native boolean onActivityCreated();

    /* renamed from: a */
    public abstract String mo26940a();

    /* renamed from: b */
    public List<Class<? extends Activity>> mo26942b() {
        return Collections.emptyList();
    }

    /* renamed from: c */
    public AppOpenAdManager mo32493c() {
        return this.f36258g;
    }

    /* renamed from: d */
    public void mo32494d(Application application) {
        if (this.f36258g == null && !C9502v.m49952w(application) && !C9502v.m49954y(application)) {
            this.f36258g = new AppOpenAdManager(application);
        }
    }

    /* renamed from: e */
    public boolean mo26943e() {
        return false;
    }

    /* renamed from: f */
    public abstract boolean mo26944f();

    /* renamed from: g */
    public String mo32495g() {
        return BuildConfig.FLAVOR;
    }

    /* renamed from: h */
    public int mo26945h() {
        return 0;
    }

    /* renamed from: i */
    public String mo32496i() {
        return BuildConfig.FLAVOR;
    }

    public void onCreate() {
        f36257h = this;
        super.onCreate();
        try {
            onActivityCreated();
        } catch (C4824b unused) {
            C9564d.m50188n(this);
        } catch (UnsatisfiedLinkError unused2) {
            C9564d.m50188n(this);
        }
    }
}
