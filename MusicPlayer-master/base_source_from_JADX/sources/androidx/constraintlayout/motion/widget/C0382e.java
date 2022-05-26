package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.C0424a;
import java.util.HashMap;
import java.util.HashSet;
import p082e.p099f.p106b.p107a.C3580c;

/* renamed from: androidx.constraintlayout.motion.widget.e */
/* compiled from: Key */
public abstract class C0382e {

    /* renamed from: f */
    public static int f1738f = -1;

    /* renamed from: a */
    int f1739a;

    /* renamed from: b */
    int f1740b;

    /* renamed from: c */
    String f1741c = null;

    /* renamed from: d */
    protected int f1742d;

    /* renamed from: e */
    HashMap<String, C0424a> f1743e;

    public C0382e() {
        int i = f1738f;
        this.f1739a = i;
        this.f1740b = i;
    }

    /* renamed from: a */
    public abstract void mo2539a(HashMap<String, C3580c> hashMap);

    /* renamed from: b */
    public abstract C0382e clone();

    /* renamed from: c */
    public C0382e mo2541c(C0382e eVar) {
        this.f1739a = eVar.f1739a;
        this.f1740b = eVar.f1740b;
        this.f1741c = eVar.f1741c;
        this.f1742d = eVar.f1742d;
        this.f1743e = eVar.f1743e;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract void mo2543d(HashSet<String> hashSet);

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract void mo2544e(Context context, AttributeSet attributeSet);

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo2545f(String str) {
        String str2 = this.f1741c;
        if (str2 == null || str == null) {
            return false;
        }
        return str.matches(str2);
    }

    /* renamed from: g */
    public void mo2546g(int i) {
        this.f1739a = i;
    }

    /* renamed from: h */
    public void mo2547h(HashMap<String, Integer> hashMap) {
    }

    /* renamed from: i */
    public C0382e mo2548i(int i) {
        this.f1740b = i;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo2549j(Object obj) {
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : Boolean.parseBoolean(obj.toString());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public float mo2550k(Object obj) {
        return obj instanceof Float ? ((Float) obj).floatValue() : Float.parseFloat(obj.toString());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public int mo2551l(Object obj) {
        return obj instanceof Integer ? ((Integer) obj).intValue() : Integer.parseInt(obj.toString());
    }
}
