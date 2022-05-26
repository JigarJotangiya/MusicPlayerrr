package androidx.core.app;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.core.content.C0506a;
import java.util.Arrays;

/* renamed from: androidx.core.app.a */
/* compiled from: ActivityCompat */
public class C0466a extends C0506a {

    /* renamed from: c */
    private static C0470d f2548c;

    /* renamed from: androidx.core.app.a$a */
    /* compiled from: ActivityCompat */
    class C0467a implements Runnable {

        /* renamed from: g */
        final /* synthetic */ String[] f2549g;

        /* renamed from: h */
        final /* synthetic */ Activity f2550h;

        /* renamed from: i */
        final /* synthetic */ int f2551i;

        C0467a(String[] strArr, Activity activity, int i) {
            this.f2549g = strArr;
            this.f2550h = activity;
            this.f2551i = i;
        }

        public void run() {
            int[] iArr = new int[this.f2549g.length];
            PackageManager packageManager = this.f2550h.getPackageManager();
            String packageName = this.f2550h.getPackageName();
            int length = this.f2549g.length;
            for (int i = 0; i < length; i++) {
                iArr[i] = packageManager.checkPermission(this.f2549g[i], packageName);
            }
            ((C0469c) this.f2550h).onRequestPermissionsResult(this.f2551i, this.f2549g, iArr);
        }
    }

    /* renamed from: androidx.core.app.a$b */
    /* compiled from: ActivityCompat */
    class C0468b implements Runnable {

        /* renamed from: g */
        final /* synthetic */ Activity f2552g;

        C0468b(Activity activity) {
            this.f2552g = activity;
        }

        public void run() {
            if (!this.f2552g.isFinishing() && !C0472b.m3001i(this.f2552g)) {
                this.f2552g.recreate();
            }
        }
    }

    /* renamed from: androidx.core.app.a$c */
    /* compiled from: ActivityCompat */
    public interface C0469c {
        void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);
    }

    /* renamed from: androidx.core.app.a$d */
    /* compiled from: ActivityCompat */
    public interface C0470d {
        /* renamed from: a */
        boolean mo3156a(Activity activity, int i, int i2, Intent intent);

        /* renamed from: b */
        boolean mo3157b(Activity activity, String[] strArr, int i);
    }

    /* renamed from: androidx.core.app.a$e */
    /* compiled from: ActivityCompat */
    public interface C0471e {
        /* renamed from: y */
        void mo3158y(int i);
    }

    /* renamed from: j */
    public static void m2983j(Activity activity) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.finishAffinity();
        } else {
            activity.finish();
        }
    }

    /* renamed from: k */
    public static C0470d m2984k() {
        return f2548c;
    }

    /* renamed from: l */
    public static void m2985l(Activity activity) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            activity.recreate();
        } else if (i <= 23) {
            new Handler(activity.getMainLooper()).post(new C0468b(activity));
        } else if (!C0472b.m3001i(activity)) {
            activity.recreate();
        }
    }

    /* renamed from: m */
    public static void m2986m(Activity activity, String[] strArr, int i) {
        C0470d dVar = f2548c;
        if (dVar == null || !dVar.mo3157b(activity, strArr, i)) {
            int length = strArr.length;
            int i2 = 0;
            while (i2 < length) {
                if (!TextUtils.isEmpty(strArr[i2])) {
                    i2++;
                } else {
                    throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
                }
            }
            if (Build.VERSION.SDK_INT >= 23) {
                if (activity instanceof C0471e) {
                    ((C0471e) activity).mo3158y(i);
                }
                activity.requestPermissions(strArr, i);
            } else if (activity instanceof C0469c) {
                new Handler(Looper.getMainLooper()).post(new C0467a(strArr, activity, i));
            }
        }
    }

    /* renamed from: n */
    public static boolean m2987n(Activity activity, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
        return false;
    }

    /* renamed from: o */
    public static void m2988o(Activity activity, Intent intent, int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.startActivityForResult(intent, i, bundle);
        } else {
            activity.startActivityForResult(intent, i);
        }
    }

    /* renamed from: p */
    public static void m2989p(Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        } else {
            activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
        }
    }
}
