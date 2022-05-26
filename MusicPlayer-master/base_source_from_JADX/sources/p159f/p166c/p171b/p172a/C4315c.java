package p159f.p166c.p171b.p172a;

import java.util.Arrays;
import p159f.p166c.p171b.p175d.C4324a;
import p369i.p387z.p389d.C8594l;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: f.c.b.a.c */
/* compiled from: PresetEqualizer.kt */
public final class C4315c {

    /* renamed from: a */
    private int f12900a;

    /* renamed from: b */
    private String f12901b = BuildConfig.FLAVOR;

    /* renamed from: c */
    private final int[] f12902c;

    /* renamed from: d */
    private int[] f12903d;

    /* renamed from: e */
    private int f12904e;

    /* renamed from: f */
    private int f12905f;

    public C4315c() {
        C4324a.C4325a aVar = C4324a.f12916c;
        this.f12902c = new int[aVar.mo14747a()];
        this.f12903d = new int[aVar.mo14747a()];
        this.f12905f = -1;
    }

    /* renamed from: a */
    public final int mo14712a() {
        return this.f12905f;
    }

    /* renamed from: b */
    public final int mo14713b() {
        return this.f12900a;
    }

    /* renamed from: c */
    public final String mo14714c() {
        return this.f12901b;
    }

    /* renamed from: d */
    public final int mo14715d() {
        return this.f12904e;
    }

    /* renamed from: e */
    public final int[] mo14716e() {
        return this.f12903d;
    }

    /* renamed from: f */
    public final int mo14717f(int i) {
        return this.f12902c[i];
    }

    /* renamed from: g */
    public final int[] mo14718g() {
        return this.f12902c;
    }

    /* renamed from: h */
    public final void mo14719h(int i) {
        this.f12905f = i;
    }

    /* renamed from: i */
    public final void mo14720i(int i) {
        this.f12900a = i;
    }

    /* renamed from: j */
    public final void mo14721j(String str) {
        C8594l.m46771e(str, "<set-?>");
        this.f12901b = str;
    }

    /* renamed from: k */
    public final void mo14722k(int i) {
        this.f12904e = i;
    }

    /* renamed from: l */
    public final void mo14723l(int[] iArr) {
        C8594l.m46771e(iArr, "toggles");
        System.arraycopy(iArr, 0, this.f12903d, 0, iArr.length);
    }

    /* renamed from: m */
    public final void mo14724m(int[] iArr) {
        C8594l.m46771e(iArr, "value");
        System.arraycopy(iArr, 0, this.f12902c, 0, iArr.length);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PresetEqualizer{ID=");
        sb.append(this.f12900a);
        sb.append(", name='");
        sb.append(this.f12901b);
        sb.append('\'');
        sb.append(", value=");
        String arrays = Arrays.toString(this.f12902c);
        C8594l.m46770d(arrays, "java.util.Arrays.toString(this)");
        sb.append(arrays);
        sb.append('}');
        return sb.toString();
    }
}
