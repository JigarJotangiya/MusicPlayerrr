package p159f.p166c.p201g.p208p;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import androidx.core.graphics.drawable.C0534a;
import androidx.core.widget.C0549e;

/* renamed from: f.c.g.p.h */
/* compiled from: TintUtils */
public class C4574h {
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        r1.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:?, code lost:
        r1 = p082e.p154x.p155a.p156a.C4247i.m18660b(r1.getResources(), r2, (android.content.res.Resources.Theme) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        if (r1 != null) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0012, code lost:
        r1.mutate();
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0016, code lost:
        r1 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0008 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.drawable.Drawable m19980a(android.content.Context r1, int r2, int r3, int r4, int r5) {
        /*
            r0 = 0
            android.graphics.drawable.Drawable r1 = androidx.core.content.C0506a.m3152d(r1, r2)     // Catch:{ NotFoundException -> 0x0008 }
            goto L_0x0017
        L_0x0006:
            r1 = move-exception
            goto L_0x0022
        L_0x0008:
            android.content.res.Resources r1 = r1.getResources()     // Catch:{ Exception -> 0x0006 }
            e.x.a.a.i r1 = p082e.p154x.p155a.p156a.C4247i.m18660b(r1, r2, r0)     // Catch:{ Exception -> 0x0006 }
            if (r1 == 0) goto L_0x0016
            r1.mutate()     // Catch:{ Exception -> 0x0006 }
            goto L_0x0017
        L_0x0016:
            r1 = r0
        L_0x0017:
            if (r1 == 0) goto L_0x0025
            r2 = 0
            r1.setBounds(r2, r2, r3, r4)     // Catch:{ Exception -> 0x0006 }
            android.graphics.drawable.Drawable r1 = m19985f(r1, r5)     // Catch:{ Exception -> 0x0006 }
            return r1
        L_0x0022:
            r1.printStackTrace()
        L_0x0025:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p201g.p208p.C4574h.m19980a(android.content.Context, int, int, int, int):android.graphics.drawable.Drawable");
    }

    /* renamed from: b */
    public static void m19981b(CompoundButton compoundButton, int i, int i2) {
        C0549e.m3395c(compoundButton, new ColorStateList(new int[][]{new int[]{-16842912}, new int[]{16842912}}, new int[]{i, i2}));
    }

    /* renamed from: c */
    public static void m19982c(SeekBar seekBar, int i) {
        m19983d(seekBar, i);
        m19984e(seekBar, i);
    }

    /* renamed from: d */
    public static void m19983d(SeekBar seekBar, int i) {
        seekBar.getProgressDrawable().setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_ATOP));
    }

    /* renamed from: e */
    public static void m19984e(SeekBar seekBar, int i) {
        seekBar.setThumb(m19985f(seekBar.getThumb(), i));
    }

    /* renamed from: f */
    public static Drawable m19985f(Drawable drawable, int i) {
        return m19986g(drawable, ColorStateList.valueOf(i));
    }

    /* renamed from: g */
    public static Drawable m19986g(Drawable drawable, ColorStateList colorStateList) {
        if (drawable == null) {
            return null;
        }
        Drawable mutate = C0534a.m3292r(drawable).mutate();
        C0534a.m3289o(mutate, colorStateList);
        return mutate;
    }
}
