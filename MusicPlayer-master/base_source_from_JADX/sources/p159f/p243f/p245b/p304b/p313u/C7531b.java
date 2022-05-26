package p159f.p243f.p245b.p304b.p313u;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;
import p082e.p109h.p110h.C3621a;

/* renamed from: f.f.b.b.u.b */
/* compiled from: RippleUtils */
public class C7531b {

    /* renamed from: a */
    public static final boolean f32755a = (Build.VERSION.SDK_INT >= 21);

    /* renamed from: b */
    private static final int[] f32756b = {16842919};

    /* renamed from: c */
    private static final int[] f32757c = {16843623, 16842908};

    /* renamed from: d */
    private static final int[] f32758d = {16842908};

    /* renamed from: e */
    private static final int[] f32759e = {16843623};

    /* renamed from: f */
    private static final int[] f32760f = {16842913, 16842919};

    /* renamed from: g */
    private static final int[] f32761g = {16842913, 16843623, 16842908};

    /* renamed from: h */
    private static final int[] f32762h = {16842913, 16842908};

    /* renamed from: i */
    private static final int[] f32763i = {16842913, 16843623};

    /* renamed from: j */
    private static final int[] f32764j = {16842913};

    /* renamed from: k */
    private static final int[] f32765k = {16842910, 16842919};

    /* renamed from: l */
    static final String f32766l = C7531b.class.getSimpleName();

    private C7531b() {
    }

    /* renamed from: a */
    public static ColorStateList m42043a(ColorStateList colorStateList) {
        if (f32755a) {
            return new ColorStateList(new int[][]{f32764j, StateSet.NOTHING}, new int[]{m42045c(colorStateList, f32760f), m42045c(colorStateList, f32756b)});
        }
        int[] iArr = f32760f;
        int[] iArr2 = f32761g;
        int[] iArr3 = f32762h;
        int[] iArr4 = f32763i;
        int[] iArr5 = f32756b;
        int[] iArr6 = f32757c;
        int[] iArr7 = f32758d;
        int[] iArr8 = f32759e;
        return new ColorStateList(new int[][]{iArr, iArr2, iArr3, iArr4, f32764j, iArr5, iArr6, iArr7, iArr8, StateSet.NOTHING}, new int[]{m42045c(colorStateList, iArr), m42045c(colorStateList, iArr2), m42045c(colorStateList, iArr3), m42045c(colorStateList, iArr4), 0, m42045c(colorStateList, iArr5), m42045c(colorStateList, iArr6), m42045c(colorStateList, iArr7), m42045c(colorStateList, iArr8), 0});
    }

    @TargetApi(21)
    /* renamed from: b */
    private static int m42044b(int i) {
        return C3621a.m15595m(i, Math.min(Color.alpha(i) * 2, 255));
    }

    /* renamed from: c */
    private static int m42045c(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return f32755a ? m42044b(colorForState) : colorForState;
    }

    /* renamed from: d */
    public static ColorStateList m42046d(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 22 && i <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f32765k, 0)) != 0) {
            Log.w(f32766l, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    /* renamed from: e */
    public static boolean m42047e(int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i : iArr) {
            if (i == 16842910) {
                z = true;
            } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                z2 = true;
            }
        }
        return z && z2;
    }
}
