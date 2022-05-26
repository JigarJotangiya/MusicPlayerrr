package p443m.p444a.p447e.p448a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.WeakHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p443m.p444a.C9317b;
import p443m.p444a.p452i.C9347c;
import p443m.p444a.p452i.C9348d;

/* renamed from: m.a.e.a.f */
/* compiled from: SkinCompatUserThemeManager */
public class C9334f {

    /* renamed from: i */
    private static C9334f f36105i = new C9334f();

    /* renamed from: a */
    private final HashMap<String, C9324a> f36106a = new HashMap<>();

    /* renamed from: b */
    private final Object f36107b = new Object();

    /* renamed from: c */
    private final WeakHashMap<Integer, WeakReference<ColorStateList>> f36108c = new WeakHashMap<>();

    /* renamed from: d */
    private boolean f36109d;

    /* renamed from: e */
    private final HashMap<String, String> f36110e = new HashMap<>();

    /* renamed from: f */
    private final Object f36111f = new Object();

    /* renamed from: g */
    private final WeakHashMap<Integer, WeakReference<Drawable>> f36112g = new WeakHashMap<>();

    /* renamed from: h */
    private boolean f36113h;

    private C9334f() {
        try {
            m49440q();
        } catch (JSONException e) {
            this.f36106a.clear();
            this.f36110e.clear();
            if (C9348d.f36128a) {
                C9348d.m49503a("SkinCompatUserThemeManager", "startLoadFromSharedPreferences error: " + e);
            }
        }
    }

    /* renamed from: a */
    private void m49431a(int i, ColorStateList colorStateList) {
        if (colorStateList != null) {
            synchronized (this.f36107b) {
                this.f36108c.put(Integer.valueOf(i), new WeakReference(colorStateList));
            }
        }
    }

    /* renamed from: b */
    private void m49432b(int i, Drawable drawable) {
        if (drawable != null) {
            synchronized (this.f36111f) {
                this.f36112g.put(Integer.valueOf(i), new WeakReference(drawable));
            }
        }
    }

    /* renamed from: c */
    private static boolean m49433c(String str) {
        boolean z = !TextUtils.isEmpty(str) && new File(str).exists();
        if (C9348d.f36128a && !z) {
            C9348d.m49503a("SkinCompatUserThemeManager", "Invalid drawable path : " + str);
        }
        return z;
    }

    /* renamed from: e */
    private void m49434e() {
        synchronized (this.f36107b) {
            this.f36108c.clear();
        }
    }

    /* renamed from: f */
    private void m49435f() {
        synchronized (this.f36111f) {
            this.f36112g.clear();
        }
    }

    /* renamed from: g */
    public static C9334f m49436g() {
        return f36105i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
        return null;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.content.res.ColorStateList m49437h(int r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f36107b
            monitor-enter(r0)
            java.util.WeakHashMap<java.lang.Integer, java.lang.ref.WeakReference<android.content.res.ColorStateList>> r1 = r3.f36108c     // Catch:{ all -> 0x0027 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0027 }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x0027 }
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1     // Catch:{ all -> 0x0027 }
            if (r1 == 0) goto L_0x0024
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x0027 }
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1     // Catch:{ all -> 0x0027 }
            if (r1 == 0) goto L_0x001b
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            return r1
        L_0x001b:
            java.util.WeakHashMap<java.lang.Integer, java.lang.ref.WeakReference<android.content.res.ColorStateList>> r1 = r3.f36108c     // Catch:{ all -> 0x0027 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0027 }
            r1.remove(r4)     // Catch:{ all -> 0x0027 }
        L_0x0024:
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            r4 = 0
            return r4
        L_0x0027:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p443m.p444a.p447e.p448a.C9334f.m49437h(int):android.content.res.ColorStateList");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
        return null;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable m49438i(int r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f36111f
            monitor-enter(r0)
            java.util.WeakHashMap<java.lang.Integer, java.lang.ref.WeakReference<android.graphics.drawable.Drawable>> r1 = r3.f36112g     // Catch:{ all -> 0x0027 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0027 }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x0027 }
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1     // Catch:{ all -> 0x0027 }
            if (r1 == 0) goto L_0x0024
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x0027 }
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1     // Catch:{ all -> 0x0027 }
            if (r1 == 0) goto L_0x001b
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            return r1
        L_0x001b:
            java.util.WeakHashMap<java.lang.Integer, java.lang.ref.WeakReference<android.graphics.drawable.Drawable>> r1 = r3.f36112g     // Catch:{ all -> 0x0027 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0027 }
            r1.remove(r4)     // Catch:{ all -> 0x0027 }
        L_0x0024:
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            r4 = 0
            return r4
        L_0x0027:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p443m.p444a.p447e.p448a.C9334f.m49438i(int):android.graphics.drawable.Drawable");
    }

    /* renamed from: m */
    private String m49439m(int i, String str) {
        Context j = C9317b.m49321m().mo32273j();
        if (str.equalsIgnoreCase(j.getResources().getResourceTypeName(i))) {
            return j.getResources().getResourceEntryName(i);
        }
        return null;
    }

    /* renamed from: q */
    private void m49440q() throws JSONException {
        String e = C9347c.m49495b().mo32346e();
        if (!TextUtils.isEmpty(e)) {
            JSONArray jSONArray = new JSONArray(e);
            if (C9348d.f36128a) {
                C9348d.m49503a("SkinCompatUserThemeManager", "startLoadFromSharedPreferences: " + jSONArray.toString());
            }
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject.has("type")) {
                    String string = jSONObject.getString("type");
                    if ("color".equals(string)) {
                        C9324a b = C9324a.m49351b(jSONObject);
                        if (b != null) {
                            this.f36106a.put(b.f36041b, b);
                        }
                    } else if ("drawable".equals(string)) {
                        String string2 = jSONObject.getString("drawableName");
                        String string3 = jSONObject.getString("drawablePathAndAngle");
                        if (!TextUtils.isEmpty(string2) && !TextUtils.isEmpty(string3)) {
                            this.f36110e.put(string2, string3);
                        }
                    }
                }
            }
            this.f36109d = this.f36106a.isEmpty();
            this.f36113h = this.f36110e.isEmpty();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo32330d() {
        m49434e();
        m49435f();
    }

    /* renamed from: j */
    public C9324a mo32331j(String str) {
        return this.f36106a.get(str);
    }

    /* renamed from: k */
    public ColorStateList mo32332k(int i) {
        C9324a aVar;
        ColorStateList h = m49437h(i);
        if (h == null) {
            String m = m49439m(i, "color");
            if (!(TextUtils.isEmpty(m) || (aVar = this.f36106a.get(m)) == null || (h = aVar.mo32301e()) == null)) {
                m49431a(i, h);
            }
        }
        return h;
    }

    /* renamed from: l */
    public Drawable mo32333l(int i) {
        Drawable i2 = m49438i(i);
        if (i2 == null) {
            String m = m49439m(i, "drawable");
            if (!TextUtils.isEmpty(m)) {
                String str = this.f36110e.get(m);
                if (!TextUtils.isEmpty(str)) {
                    String[] split = str.split(":");
                    int i3 = 0;
                    String str2 = split[0];
                    if (split.length == 2) {
                        i3 = Integer.valueOf(split[1]).intValue();
                    }
                    if (m49433c(str2)) {
                        if (i3 == 0) {
                            i2 = Drawable.createFromPath(str2);
                        } else {
                            Matrix matrix = new Matrix();
                            matrix.postRotate((float) i3);
                            Bitmap decodeFile = BitmapFactory.decodeFile(str2);
                            i2 = new BitmapDrawable((Resources) null, Bitmap.createBitmap(decodeFile, 0, 0, decodeFile.getWidth(), decodeFile.getHeight(), matrix, true));
                        }
                        if (i2 != null) {
                            m49432b(i, i2);
                        }
                    }
                }
            }
        }
        return i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean mo32334n() {
        return this.f36109d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean mo32335o() {
        return this.f36113h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo32336p(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f36106a.remove(str);
            this.f36109d = this.f36106a.isEmpty();
        }
    }
}
