package p443m.p444a.p447e.p448a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import java.util.ArrayList;
import java.util.List;
import p443m.p444a.C9317b;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: m.a.e.a.d */
/* compiled from: SkinCompatResources */
public class C9332d {

    /* renamed from: g */
    private static volatile C9332d f36083g;

    /* renamed from: a */
    private Resources f36084a;

    /* renamed from: b */
    private String f36085b = BuildConfig.FLAVOR;

    /* renamed from: c */
    private String f36086c = BuildConfig.FLAVOR;

    /* renamed from: d */
    private C9317b.C9320c f36087d;

    /* renamed from: e */
    private boolean f36088e = true;

    /* renamed from: f */
    private List<C9336h> f36089f = new ArrayList();

    private C9332d() {
    }

    /* renamed from: b */
    public static int m49405b(Context context, int i) {
        return m49408e().m49409f(context, i);
    }

    /* renamed from: c */
    public static ColorStateList m49406c(Context context, int i) {
        return m49408e().m49410g(context, i);
    }

    /* renamed from: d */
    public static Drawable m49407d(Context context, int i) {
        return m49408e().m49411h(context, i);
    }

    /* renamed from: e */
    public static C9332d m49408e() {
        if (f36083g == null) {
            synchronized (C9332d.class) {
                if (f36083g == null) {
                    f36083g = new C9332d();
                }
            }
        }
        return f36083g;
    }

    /* renamed from: f */
    private int m49409f(Context context, int i) {
        int m;
        ColorStateList a;
        ColorStateList k;
        if (!C9334f.m49436g().mo32334n() && (k = C9334f.m49436g().mo32332k(i)) != null) {
            return k.getDefaultColor();
        }
        C9317b.C9320c cVar = this.f36087d;
        if (cVar != null && (a = cVar.mo32295a(context, this.f36086c, i)) != null) {
            return a.getDefaultColor();
        }
        if (this.f36088e || (m = mo32325m(context, i)) == 0) {
            return context.getResources().getColor(i);
        }
        return this.f36084a.getColor(m);
    }

    /* renamed from: g */
    private ColorStateList m49410g(Context context, int i) {
        int m;
        ColorStateList d;
        ColorStateList k;
        if (!C9334f.m49436g().mo32334n() && (k = C9334f.m49436g().mo32332k(i)) != null) {
            return k;
        }
        C9317b.C9320c cVar = this.f36087d;
        if (cVar != null && (d = cVar.mo32297d(context, this.f36086c, i)) != null) {
            return d;
        }
        if (!this.f36088e && (m = mo32325m(context, i)) != 0) {
            return this.f36084a.getColorStateList(m);
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getResources().getColorStateList(i, context.getTheme());
        }
        return context.getResources().getColorStateList(i);
    }

    /* renamed from: h */
    private Drawable m49411h(Context context, int i) {
        int m;
        Drawable c;
        Drawable l;
        ColorStateList k;
        if (!C9334f.m49436g().mo32334n() && (k = C9334f.m49436g().mo32332k(i)) != null) {
            return new ColorDrawable(k.getDefaultColor());
        }
        if (!C9334f.m49436g().mo32335o() && (l = C9334f.m49436g().mo32333l(i)) != null) {
            return l;
        }
        C9317b.C9320c cVar = this.f36087d;
        if (cVar != null && (c = cVar.mo32296c(context, this.f36086c, i)) != null) {
            return c;
        }
        if (this.f36088e || (m = mo32325m(context, i)) == 0) {
            return context.getResources().getDrawable(i);
        }
        return this.f36084a.getDrawable(m);
    }

    /* renamed from: j */
    private void m49412j(Context context, int i, TypedValue typedValue, boolean z) {
        int m;
        if (this.f36088e || (m = mo32325m(context, i)) == 0) {
            context.getResources().getValue(i, typedValue, z);
        } else {
            this.f36084a.getValue(m, typedValue, z);
        }
    }

    /* renamed from: k */
    private XmlResourceParser m49413k(Context context, int i) {
        int m;
        if (this.f36088e || (m = mo32325m(context, i)) == 0) {
            return context.getResources().getXml(i);
        }
        return this.f36084a.getXml(m);
    }

    /* renamed from: n */
    public static void m49414n(Context context, int i, TypedValue typedValue, boolean z) {
        m49408e().m49412j(context, i, typedValue, z);
    }

    /* renamed from: o */
    public static XmlResourceParser m49415o(Context context, int i) {
        return m49408e().m49413k(context, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo32322a(C9336h hVar) {
        this.f36089f.add(hVar);
    }

    /* renamed from: i */
    public Resources mo32323i() {
        return this.f36084a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public Drawable mo32324l(Context context, int i) {
        C9317b.C9320c cVar = this.f36087d;
        if (cVar != null) {
            return cVar.mo32296c(context, this.f36086c, i);
        }
        return null;
    }

    /* renamed from: m */
    public int mo32325m(Context context, int i) {
        String str = null;
        try {
            C9317b.C9320c cVar = this.f36087d;
            if (cVar != null) {
                str = cVar.mo32299f(context, this.f36086c, i);
            }
            if (TextUtils.isEmpty(str)) {
                str = context.getResources().getResourceEntryName(i);
            }
            return this.f36084a.getIdentifier(str, context.getResources().getResourceTypeName(i), this.f36085b);
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: p */
    public boolean mo32326p() {
        return this.f36088e;
    }

    /* renamed from: q */
    public void mo32327q() {
        mo32328r(C9317b.m49321m().mo32278p().get(-1));
    }

    /* renamed from: r */
    public void mo32328r(C9317b.C9320c cVar) {
        this.f36084a = C9317b.m49321m().mo32273j().getResources();
        this.f36085b = BuildConfig.FLAVOR;
        this.f36086c = BuildConfig.FLAVOR;
        this.f36087d = cVar;
        this.f36088e = true;
        C9334f.m49436g().mo32330d();
        for (C9336h clear : this.f36089f) {
            clear.clear();
        }
    }

    /* renamed from: s */
    public void mo32329s(Resources resources, String str, String str2, C9317b.C9320c cVar) {
        if (resources == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            mo32328r(cVar);
            return;
        }
        this.f36084a = resources;
        this.f36085b = str;
        this.f36086c = str2;
        this.f36087d = cVar;
        this.f36088e = false;
        C9334f.m49436g().mo32330d();
        for (C9336h clear : this.f36089f) {
            clear.clear();
        }
    }
}
