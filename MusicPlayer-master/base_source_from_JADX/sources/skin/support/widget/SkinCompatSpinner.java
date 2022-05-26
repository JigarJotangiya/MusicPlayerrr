package skin.support.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatSpinner;
import p443m.p444a.p446d.C9322a;
import p443m.p444a.p447e.p448a.C9335g;

public class SkinCompatSpinner extends AppCompatSpinner implements C9716g {

    /* renamed from: r */
    private static final String f36787r = SkinCompatSpinner.class.getSimpleName();

    /* renamed from: s */
    private static final int[] f36788s = {16843505};

    /* renamed from: p */
    private C9710a f36789p;

    /* renamed from: q */
    private int f36790q;

    public SkinCompatSpinner(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: c */
    private void m50272c() {
        int a = C9712c.m50287a(this.f36790q);
        this.f36790q = a;
        if (a != 0) {
            setPopupBackgroundDrawable(C9335g.m49448a(getContext(), this.f36790q));
        }
    }

    /* renamed from: f */
    public void mo33834f() {
        C9710a aVar = this.f36789p;
        if (aVar != null) {
            aVar.mo33869b();
        }
        m50272c();
    }

    public void setPopupBackgroundResource(int i) {
        super.setPopupBackgroundResource(i);
        this.f36790q = i;
        m50272c();
    }

    public SkinCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C9322a.spinnerStyle);
    }

    public SkinCompatSpinner(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    public SkinCompatSpinner(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, (Resources.Theme) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002d, code lost:
        if (r1 != null) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002f, code lost:
        r1.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003d, code lost:
        if (r1 == null) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SkinCompatSpinner(android.content.Context r6, android.util.AttributeSet r7, int r8, int r9, android.content.res.Resources.Theme r10) {
        /*
            r5 = this;
            r5.<init>(r6, r7, r8, r9, r10)
            r10 = 0
            r5.f36790q = r10
            int[] r0 = p443m.p444a.p446d.C9323b.Spinner
            android.content.res.TypedArray r0 = r6.obtainStyledAttributes(r7, r0, r8, r10)
            android.content.Context r1 = r5.getPopupContext()
            if (r1 == 0) goto L_0x005e
            r1 = -1
            r2 = 1
            if (r9 != r1) goto L_0x0047
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 11
            if (r1 < r3) goto L_0x0046
            r1 = 0
            int[] r3 = f36788s     // Catch:{ Exception -> 0x0035 }
            android.content.res.TypedArray r1 = r6.obtainStyledAttributes(r7, r3, r8, r10)     // Catch:{ Exception -> 0x0035 }
            boolean r6 = r1.hasValue(r10)     // Catch:{ Exception -> 0x0035 }
            if (r6 == 0) goto L_0x002d
            int r9 = r1.getInt(r10, r10)     // Catch:{ Exception -> 0x0035 }
        L_0x002d:
            if (r1 == 0) goto L_0x0047
        L_0x002f:
            r1.recycle()
            goto L_0x0047
        L_0x0033:
            r6 = move-exception
            goto L_0x0040
        L_0x0035:
            r6 = move-exception
            java.lang.String r3 = f36787r     // Catch:{ all -> 0x0033 }
            java.lang.String r4 = "Could not read android:spinnerMode"
            android.util.Log.i(r3, r4, r6)     // Catch:{ all -> 0x0033 }
            if (r1 == 0) goto L_0x0047
            goto L_0x002f
        L_0x0040:
            if (r1 == 0) goto L_0x0045
            r1.recycle()
        L_0x0045:
            throw r6
        L_0x0046:
            r9 = 1
        L_0x0047:
            if (r9 != r2) goto L_0x005e
            android.content.Context r6 = r5.getPopupContext()
            int[] r9 = p443m.p444a.p446d.C9323b.Spinner
            android.content.res.TypedArray r6 = r6.obtainStyledAttributes(r7, r9, r8, r10)
            int r9 = p443m.p444a.p446d.C9323b.Spinner_android_popupBackground
            int r9 = r6.getResourceId(r9, r10)
            r5.f36790q = r9
            r6.recycle()
        L_0x005e:
            r0.recycle()
            skin.support.widget.a r6 = new skin.support.widget.a
            r6.<init>(r5)
            r5.f36789p = r6
            r6.mo33870c(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: skin.support.widget.SkinCompatSpinner.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }
}
