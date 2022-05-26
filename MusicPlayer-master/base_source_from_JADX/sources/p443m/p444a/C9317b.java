package p443m.p444a;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;
import p443m.p444a.p447e.p448a.C9332d;
import p443m.p444a.p450g.C9338a;
import p443m.p444a.p450g.C9339b;
import p443m.p444a.p450g.C9340c;
import p443m.p444a.p450g.C9341d;
import p443m.p444a.p451h.C9343a;
import p443m.p444a.p452i.C9347c;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;
import skin.support.app.C9703a;
import skin.support.app.C9708d;
import skin.support.app.C9709e;

/* renamed from: m.a.b */
/* compiled from: SkinCompatManager */
public class C9317b extends C9343a {

    /* renamed from: k */
    private static volatile C9317b f36027k;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f36028b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Context f36029c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f36030d = false;

    /* renamed from: e */
    private List<C9709e> f36031e = new ArrayList();

    /* renamed from: f */
    private List<C9708d> f36032f = new ArrayList();

    /* renamed from: g */
    private List<C9708d> f36033g = new ArrayList();

    /* renamed from: h */
    private SparseArray<C9320c> f36034h = new SparseArray<>();

    /* renamed from: i */
    private boolean f36035i = true;

    /* renamed from: j */
    private boolean f36036j = true;

    /* renamed from: m.a.b$a */
    /* compiled from: SkinCompatManager */
    private class C9318a extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        private final C9319b f36037a;

        /* renamed from: b */
        private final C9320c f36038b;

        C9318a(C9319b bVar, C9320c cVar) {
            this.f36037a = bVar;
            this.f36038b = cVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(String... strArr) {
            synchronized (C9317b.this.f36028b) {
                while (C9317b.this.f36030d) {
                    try {
                        C9317b.this.f36028b.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                boolean unused = C9317b.this.f36030d = true;
            }
            try {
                if (strArr.length == 1) {
                    if (!TextUtils.isEmpty(this.f36038b.mo32298e(C9317b.this.f36029c, strArr[0]))) {
                        return strArr[0];
                    }
                    C9332d.m49408e().mo32328r(this.f36038b);
                    return BuildConfig.FLAVOR;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            C9332d.m49408e().mo32327q();
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(String str) {
            synchronized (C9317b.this.f36028b) {
                if (str != null) {
                    C9347c b = C9347c.m49495b();
                    b.mo32347g(str);
                    b.mo32348h(this.f36038b.mo27297b());
                    b.mo32343a();
                    C9317b.this.mo32340c();
                    C9319b bVar = this.f36037a;
                    if (bVar != null) {
                        bVar.mo32293b();
                    }
                } else {
                    C9347c b2 = C9347c.m49495b();
                    b2.mo32347g(BuildConfig.FLAVOR);
                    b2.mo32348h(-1);
                    b2.mo32343a();
                    C9319b bVar2 = this.f36037a;
                    if (bVar2 != null) {
                        bVar2.mo32294c("皮肤资源获取失败");
                    }
                }
                boolean unused = C9317b.this.f36030d = false;
                C9317b.this.f36028b.notifyAll();
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            C9319b bVar = this.f36037a;
            if (bVar != null) {
                bVar.mo32292a();
            }
        }
    }

    /* renamed from: m.a.b$b */
    /* compiled from: SkinCompatManager */
    public interface C9319b {
        /* renamed from: a */
        void mo32292a();

        /* renamed from: b */
        void mo32293b();

        /* renamed from: c */
        void mo32294c(String str);
    }

    /* renamed from: m.a.b$c */
    /* compiled from: SkinCompatManager */
    public interface C9320c {
        /* renamed from: a */
        ColorStateList mo32295a(Context context, String str, int i);

        /* renamed from: b */
        int mo27297b();

        /* renamed from: c */
        Drawable mo32296c(Context context, String str, int i);

        /* renamed from: d */
        ColorStateList mo32297d(Context context, String str, int i);

        /* renamed from: e */
        String mo32298e(Context context, String str);

        /* renamed from: f */
        String mo32299f(Context context, String str, int i);
    }

    private C9317b(Context context) {
        this.f36029c = context.getApplicationContext();
        m49323s();
    }

    /* renamed from: A */
    public static C9317b m49316A(Application application) {
        m49322r(application);
        C9703a.m50233g(application);
        return f36027k;
    }

    /* renamed from: m */
    public static C9317b m49321m() {
        return f36027k;
    }

    /* renamed from: r */
    public static C9317b m49322r(Context context) {
        if (f36027k == null) {
            synchronized (C9317b.class) {
                if (f36027k == null) {
                    f36027k = new C9317b(context);
                }
            }
        }
        C9347c.m49496f(context);
        return f36027k;
    }

    /* renamed from: s */
    private void m49323s() {
        this.f36034h.put(-1, new C9340c());
        this.f36034h.put(0, new C9338a());
        this.f36034h.put(1, new C9339b());
        this.f36034h.put(2, new C9341d());
    }

    /* renamed from: i */
    public C9317b mo32272i(C9320c cVar) {
        this.f36034h.put(cVar.mo27297b(), cVar);
        return this;
    }

    /* renamed from: j */
    public Context mo32273j() {
        return this.f36029c;
    }

    @Deprecated
    /* renamed from: k */
    public List<C9708d> mo32274k() {
        return this.f36033g;
    }

    /* renamed from: l */
    public List<C9708d> mo32275l() {
        return this.f36032f;
    }

    /* renamed from: n */
    public String mo32276n(String str) {
        return this.f36029c.getPackageManager().getPackageArchiveInfo(str, 1).packageName;
    }

    /* renamed from: o */
    public Resources mo32277o(String str) {
        try {
            PackageInfo packageArchiveInfo = this.f36029c.getPackageManager().getPackageArchiveInfo(str, 0);
            ApplicationInfo applicationInfo = packageArchiveInfo.applicationInfo;
            applicationInfo.sourceDir = str;
            applicationInfo.publicSourceDir = str;
            Resources resourcesForApplication = this.f36029c.getPackageManager().getResourcesForApplication(packageArchiveInfo.applicationInfo);
            Resources resources = this.f36029c.getResources();
            return new Resources(resourcesForApplication.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: p */
    public SparseArray<C9320c> mo32278p() {
        return this.f36034h;
    }

    /* renamed from: q */
    public List<C9709e> mo32279q() {
        return this.f36031e;
    }

    /* renamed from: t */
    public boolean mo32280t() {
        return this.f36035i;
    }

    /* renamed from: u */
    public boolean mo32281u() {
        return this.f36036j;
    }

    /* renamed from: v */
    public AsyncTask mo32282v() {
        String c = C9347c.m49495b().mo32344c();
        int d = C9347c.m49495b().mo32345d();
        if (TextUtils.isEmpty(c) || d == -1) {
            return null;
        }
        return mo32284x(c, (C9319b) null, d);
    }

    /* renamed from: w */
    public AsyncTask mo32283w(String str, int i) {
        return mo32284x(str, (C9319b) null, i);
    }

    /* renamed from: x */
    public AsyncTask mo32284x(String str, C9319b bVar, int i) {
        C9320c cVar = this.f36034h.get(i);
        if (cVar == null) {
            return null;
        }
        return new C9318a(bVar, cVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[]{str});
    }

    @Deprecated
    /* renamed from: y */
    public C9317b mo32285y(boolean z) {
        return this;
    }

    /* renamed from: z */
    public C9317b mo32286z(boolean z) {
        this.f36036j = z;
        return this;
    }
}
