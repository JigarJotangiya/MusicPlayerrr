package androidx.core.content.p003d;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Shader;
import android.util.Log;

/* renamed from: androidx.core.content.d.b */
/* compiled from: ComplexColorCompat */
public final class C0515b {

    /* renamed from: a */
    private final Shader f2695a;

    /* renamed from: b */
    private final ColorStateList f2696b;

    /* renamed from: c */
    private int f2697c;

    private C0515b(Shader shader, ColorStateList colorStateList, int i) {
        this.f2695a = shader;
        this.f2696b = colorStateList;
        this.f2697c = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0015  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static androidx.core.content.p003d.C0515b m3182a(android.content.res.Resources r4, int r5, android.content.res.Resources.Theme r6) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        /*
            android.content.res.XmlResourceParser r5 = r4.getXml(r5)
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r5)
        L_0x0008:
            int r1 = r5.next()
            r2 = 2
            if (r1 == r2) goto L_0x0013
            r3 = 1
            if (r1 == r3) goto L_0x0013
            goto L_0x0008
        L_0x0013:
            if (r1 != r2) goto L_0x005c
            java.lang.String r1 = r5.getName()
            r1.hashCode()
            java.lang.String r2 = "gradient"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0053
            java.lang.String r2 = "selector"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0035
            android.content.res.ColorStateList r4 = androidx.core.content.p003d.C0514a.m3175b(r4, r5, r0, r6)
            androidx.core.content.d.b r4 = m3184c(r4)
            return r4
        L_0x0035:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r5 = r5.getPositionDescription()
            r6.append(r5)
            java.lang.String r5 = ": unsupported complex color tag "
            r6.append(r5)
            r6.append(r1)
            java.lang.String r5 = r6.toString()
            r4.<init>(r5)
            throw r4
        L_0x0053:
            android.graphics.Shader r4 = androidx.core.content.p003d.C0521d.m3214b(r4, r5, r0, r6)
            androidx.core.content.d.b r4 = m3185d(r4)
            return r4
        L_0x005c:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r5 = "No start tag found"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.p003d.C0515b.m3182a(android.content.res.Resources, int, android.content.res.Resources$Theme):androidx.core.content.d.b");
    }

    /* renamed from: b */
    static C0515b m3183b(int i) {
        return new C0515b((Shader) null, (ColorStateList) null, i);
    }

    /* renamed from: c */
    static C0515b m3184c(ColorStateList colorStateList) {
        return new C0515b((Shader) null, colorStateList, colorStateList.getDefaultColor());
    }

    /* renamed from: d */
    static C0515b m3185d(Shader shader) {
        return new C0515b(shader, (ColorStateList) null, 0);
    }

    /* renamed from: g */
    public static C0515b m3186g(Resources resources, int i, Resources.Theme theme) {
        try {
            return m3182a(resources, i, theme);
        } catch (Exception e) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
            return null;
        }
    }

    /* renamed from: e */
    public int mo3269e() {
        return this.f2697c;
    }

    /* renamed from: f */
    public Shader mo3270f() {
        return this.f2695a;
    }

    /* renamed from: h */
    public boolean mo3271h() {
        return this.f2695a != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f2696b;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo3272i() {
        /*
            r1 = this;
            android.graphics.Shader r0 = r1.f2695a
            if (r0 != 0) goto L_0x0010
            android.content.res.ColorStateList r0 = r1.f2696b
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.p003d.C0515b.mo3272i():boolean");
    }

    /* renamed from: j */
    public boolean mo3273j(int[] iArr) {
        if (mo3272i()) {
            ColorStateList colorStateList = this.f2696b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f2697c) {
                this.f2697c = colorForState;
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public void mo3274k(int i) {
        this.f2697c = i;
    }

    /* renamed from: l */
    public boolean mo3275l() {
        return mo3271h() || this.f2697c != 0;
    }
}
