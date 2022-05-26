package p443m.p444a.p452i;

import android.content.Context;
import android.content.SharedPreferences;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: m.a.i.c */
/* compiled from: SkinPreference */
public class C9347c {

    /* renamed from: d */
    private static C9347c f36124d;

    /* renamed from: a */
    private final Context f36125a;

    /* renamed from: b */
    private final SharedPreferences f36126b;

    /* renamed from: c */
    private final SharedPreferences.Editor f36127c;

    private C9347c(Context context) {
        this.f36125a = context;
        SharedPreferences sharedPreferences = context.getSharedPreferences("meta-data", 0);
        this.f36126b = sharedPreferences;
        this.f36127c = sharedPreferences.edit();
    }

    /* renamed from: b */
    public static C9347c m49495b() {
        return f36124d;
    }

    /* renamed from: f */
    public static void m49496f(Context context) {
        if (f36124d == null) {
            synchronized (C9347c.class) {
                if (f36124d == null) {
                    f36124d = new C9347c(context.getApplicationContext());
                }
            }
        }
    }

    /* renamed from: a */
    public void mo32343a() {
        this.f36127c.apply();
    }

    /* renamed from: c */
    public String mo32344c() {
        return this.f36126b.getString("skin-name", BuildConfig.FLAVOR);
    }

    /* renamed from: d */
    public int mo32345d() {
        return this.f36126b.getInt("skin-strategy", -1);
    }

    /* renamed from: e */
    public String mo32346e() {
        return this.f36126b.getString("skin-user-theme-json", BuildConfig.FLAVOR);
    }

    /* renamed from: g */
    public C9347c mo32347g(String str) {
        this.f36127c.putString("skin-name", str);
        return this;
    }

    /* renamed from: h */
    public C9347c mo32348h(int i) {
        this.f36127c.putInt("skin-strategy", i);
        return this;
    }
}
