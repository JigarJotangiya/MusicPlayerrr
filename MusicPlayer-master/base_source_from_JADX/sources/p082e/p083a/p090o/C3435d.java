package p082e.p083a.p090o;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import p082e.p083a.C3408i;

/* renamed from: e.a.o.d */
/* compiled from: ContextThemeWrapper */
public class C3435d extends ContextWrapper {

    /* renamed from: a */
    private int f10901a;

    /* renamed from: b */
    private Resources.Theme f10902b;

    /* renamed from: c */
    private LayoutInflater f10903c;

    /* renamed from: d */
    private Configuration f10904d;

    /* renamed from: e */
    private Resources f10905e;

    public C3435d() {
        super((Context) null);
    }

    /* renamed from: b */
    private Resources m14666b() {
        if (this.f10905e == null) {
            Configuration configuration = this.f10904d;
            if (configuration == null) {
                this.f10905e = super.getResources();
            } else if (Build.VERSION.SDK_INT >= 17) {
                this.f10905e = createConfigurationContext(configuration).getResources();
            } else {
                Resources resources = super.getResources();
                Configuration configuration2 = new Configuration(resources.getConfiguration());
                configuration2.updateFrom(this.f10904d);
                this.f10905e = new Resources(resources.getAssets(), resources.getDisplayMetrics(), configuration2);
            }
        }
        return this.f10905e;
    }

    /* renamed from: d */
    private void m14667d() {
        boolean z = this.f10902b == null;
        if (z) {
            this.f10902b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f10902b.setTo(theme);
            }
        }
        mo12171e(this.f10902b, this.f10901a, z);
    }

    /* renamed from: a */
    public void mo12168a(Configuration configuration) {
        if (this.f10905e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        } else if (this.f10904d == null) {
            this.f10904d = new Configuration(configuration);
        } else {
            throw new IllegalStateException("Override configuration has already been set");
        }
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    /* renamed from: c */
    public int mo12170c() {
        return this.f10901a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo12171e(Resources.Theme theme, int i, boolean z) {
        theme.applyStyle(i, true);
    }

    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    public Resources getResources() {
        return m14666b();
    }

    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f10903c == null) {
            this.f10903c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f10903c;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f10902b;
        if (theme != null) {
            return theme;
        }
        if (this.f10901a == 0) {
            this.f10901a = C3408i.Theme_AppCompat_Light;
        }
        m14667d();
        return this.f10902b;
    }

    public void setTheme(int i) {
        if (this.f10901a != i) {
            this.f10901a = i;
            m14667d();
        }
    }

    public C3435d(Context context, int i) {
        super(context);
        this.f10901a = i;
    }

    public C3435d(Context context, Resources.Theme theme) {
        super(context);
        this.f10902b = theme;
    }
}
