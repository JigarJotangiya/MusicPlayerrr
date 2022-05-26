package p159f.p166c.p176c;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.util.Log;
import java.lang.ref.WeakReference;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: f.c.c.a */
/* compiled from: FloatWindowManager */
public class C4326a {

    /* renamed from: a */
    private static volatile C4326a f12917a;

    /* renamed from: f.c.c.a$a */
    /* compiled from: FloatWindowManager */
    class C4327a implements C4334h {

        /* renamed from: a */
        final /* synthetic */ WeakReference f12918a;

        C4327a(C4326a aVar, WeakReference weakReference) {
            this.f12918a = weakReference;
        }

        /* renamed from: a */
        public void mo14750a(boolean z) {
            if (z) {
                C4338e.m18941a((Activity) this.f12918a.get());
            } else {
                Log.e("FloatWindowManager", "ROM:360, user manually refuse OVERLAY_PERMISSION");
            }
        }
    }

    /* renamed from: f.c.c.a$b */
    /* compiled from: FloatWindowManager */
    class C4328b implements C4334h {

        /* renamed from: a */
        final /* synthetic */ WeakReference f12919a;

        C4328b(C4326a aVar, WeakReference weakReference) {
            this.f12919a = weakReference;
        }

        /* renamed from: a */
        public void mo14750a(boolean z) {
            if (z) {
                C4335b.m18926a((Activity) this.f12919a.get());
            } else {
                Log.e("FloatWindowManager", "ROM:huawei, user manually refuse OVERLAY_PERMISSION");
            }
        }
    }

    /* renamed from: f.c.c.a$c */
    /* compiled from: FloatWindowManager */
    class C4329c implements C4334h {

        /* renamed from: a */
        final /* synthetic */ WeakReference f12920a;

        C4329c(C4326a aVar, WeakReference weakReference) {
            this.f12920a = weakReference;
        }

        /* renamed from: a */
        public void mo14750a(boolean z) {
            if (z) {
                C4336c.m18929a((Activity) this.f12920a.get());
            } else {
                Log.e("FloatWindowManager", "ROM:meizu, user manually refuse OVERLAY_PERMISSION");
            }
        }
    }

    /* renamed from: f.c.c.a$d */
    /* compiled from: FloatWindowManager */
    class C4330d implements C4334h {

        /* renamed from: a */
        final /* synthetic */ WeakReference f12921a;

        C4330d(C4326a aVar, WeakReference weakReference) {
            this.f12921a = weakReference;
        }

        /* renamed from: a */
        public void mo14750a(boolean z) {
            if (z) {
                C4337d.m18932a((Activity) this.f12921a.get());
            } else {
                Log.e("FloatWindowManager", "ROM:miui, user manually refuse OVERLAY_PERMISSION");
            }
        }
    }

    /* renamed from: f.c.c.a$e */
    /* compiled from: FloatWindowManager */
    class C4331e implements C4334h {

        /* renamed from: a */
        final /* synthetic */ WeakReference f12922a;

        C4331e(C4326a aVar, WeakReference weakReference) {
            this.f12922a = weakReference;
        }

        /* renamed from: a */
        public void mo14750a(boolean z) {
            if (z) {
                try {
                    Intent intent = new Intent(Settings.class.getDeclaredField("ACTION_MANAGE_OVERLAY_PERMISSION").get((Object) null).toString());
                    intent.setData(Uri.parse("package:" + ((Activity) this.f12922a.get()).getPackageName()));
                    ((Activity) this.f12922a.get()).startActivityForResult(intent, 1);
                } catch (Exception e) {
                    Log.e("FloatWindowManager", Log.getStackTraceString(e));
                }
            } else {
                Log.d("FloatWindowManager", "user manually refuse OVERLAY_PERMISSION");
            }
        }
    }

    /* renamed from: f.c.c.a$f */
    /* compiled from: FloatWindowManager */
    class C4332f implements DialogInterface.OnClickListener {

        /* renamed from: g */
        final /* synthetic */ C4334h f12923g;

        C4332f(C4326a aVar, C4334h hVar) {
            this.f12923g = hVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f12923g.mo14750a(false);
            dialogInterface.dismiss();
        }
    }

    /* renamed from: f.c.c.a$g */
    /* compiled from: FloatWindowManager */
    class C4333g implements DialogInterface.OnClickListener {

        /* renamed from: g */
        final /* synthetic */ C4334h f12924g;

        C4333g(C4326a aVar, C4334h hVar) {
            this.f12924g = hVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f12924g.mo14750a(true);
            dialogInterface.dismiss();
        }
    }

    /* renamed from: f.c.c.a$h */
    /* compiled from: FloatWindowManager */
    private interface C4334h {
        /* renamed from: a */
        void mo14750a(boolean z);
    }

    /* renamed from: a */
    private void m18904a(WeakReference<Activity> weakReference, int i) {
        m18916o(weakReference, i, new C4327a(this, weakReference));
    }

    /* renamed from: d */
    private void m18905d(WeakReference<Activity> weakReference, int i) {
        if (C4340g.m18947c()) {
            m18911j(weakReference);
        } else if (Build.VERSION.SDK_INT >= 23) {
            m18916o(weakReference, i, new C4331e(this, weakReference));
        }
    }

    /* renamed from: e */
    private boolean m18906e(Context context) {
        if (C4340g.m18947c()) {
            return m18910i(context);
        }
        Boolean bool = Boolean.TRUE;
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                bool = (Boolean) Settings.class.getDeclaredMethod("canDrawOverlays", new Class[]{Context.class}).invoke((Object) null, new Object[]{context});
            } catch (Exception e) {
                Log.e("FloatWindowManager", Log.getStackTraceString(e));
            }
        }
        return bool.booleanValue();
    }

    /* renamed from: f */
    public static C4326a m18907f() {
        if (f12917a == null) {
            synchronized (C4326a.class) {
                if (f12917a == null) {
                    f12917a = new C4326a();
                }
            }
        }
        return f12917a;
    }

    /* renamed from: g */
    private boolean m18908g(Context context) {
        return C4335b.m18927b(context);
    }

    /* renamed from: h */
    private void m18909h(WeakReference<Activity> weakReference, int i) {
        m18916o(weakReference, i, new C4328b(this, weakReference));
    }

    /* renamed from: i */
    private boolean m18910i(Context context) {
        return C4336c.m18930b(context);
    }

    /* renamed from: j */
    private void m18911j(WeakReference<Activity> weakReference) {
        m18912k(weakReference, 0);
    }

    /* renamed from: k */
    private void m18912k(WeakReference<Activity> weakReference, int i) {
        m18916o(weakReference, i, new C4329c(this, weakReference));
    }

    /* renamed from: l */
    private boolean m18913l(Context context) {
        return C4337d.m18933b(context);
    }

    /* renamed from: m */
    private void m18914m(WeakReference<Activity> weakReference, int i) {
        m18916o(weakReference, i, new C4330d(this, weakReference));
    }

    /* renamed from: n */
    private boolean m18915n(Context context) {
        return C4338e.m18942b(context);
    }

    /* renamed from: o */
    private void m18916o(WeakReference<Activity> weakReference, int i, C4334h hVar) {
        m18917p(weakReference, i, ((Activity) weakReference.get()).getString(C4339f.float_window_permission), hVar);
    }

    /* renamed from: p */
    private void m18917p(WeakReference<Activity> weakReference, int i, String str, C4334h hVar) {
        new AlertDialog.Builder((Context) weakReference.get(), i).setCancelable(true).setTitle(BuildConfig.FLAVOR).setMessage(str).setPositiveButton(C4339f.open_float_window, new C4333g(this, hVar)).setNegativeButton(C4339f.don_not_open_float_window, new C4332f(this, hVar)).create().show();
    }

    /* renamed from: b */
    public void mo14748b(Activity activity, int i) {
        WeakReference weakReference = new WeakReference(activity);
        if (Build.VERSION.SDK_INT < 23) {
            if (C4340g.m18948d()) {
                m18914m(weakReference, i);
            } else if (C4340g.m18947c()) {
                m18912k(weakReference, i);
            } else if (C4340g.m18946b()) {
                m18909h(weakReference, i);
            } else if (C4340g.m18945a()) {
                m18904a(weakReference, i);
            }
        }
        m18905d(weakReference, i);
    }

    /* renamed from: c */
    public boolean mo14749c(Context context) {
        if (Build.VERSION.SDK_INT < 23) {
            if (C4340g.m18948d()) {
                return m18913l(context);
            }
            if (C4340g.m18947c()) {
                return m18910i(context);
            }
            if (C4340g.m18946b()) {
                return m18908g(context);
            }
            if (C4340g.m18945a()) {
                return m18915n(context);
            }
        }
        return m18906e(context);
    }
}
