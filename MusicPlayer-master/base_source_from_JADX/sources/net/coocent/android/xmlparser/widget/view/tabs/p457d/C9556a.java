package net.coocent.android.xmlparser.widget.view.tabs.p457d;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.StateSet;
import p082e.p109h.p110h.C3621a;

/* renamed from: net.coocent.android.xmlparser.widget.view.tabs.d.a */
/* compiled from: RippleUtils */
public class C9556a {

    /* renamed from: a */
    public static final boolean f36700a = (Build.VERSION.SDK_INT >= 21);

    /* renamed from: b */
    private static final int[] f36701b = {16842919};

    /* renamed from: c */
    private static final int[] f36702c = {16843623, 16842908};

    /* renamed from: d */
    private static final int[] f36703d = {16842908};

    /* renamed from: e */
    private static final int[] f36704e = {16843623};

    /* renamed from: f */
    private static final int[] f36705f = {16842913, 16842919};

    /* renamed from: g */
    private static final int[] f36706g = {16842913, 16843623, 16842908};

    /* renamed from: h */
    private static final int[] f36707h = {16842913, 16842908};

    /* renamed from: i */
    private static final int[] f36708i = {16842913, 16843623};

    /* renamed from: j */
    private static final int[] f36709j = {16842913};

    /* renamed from: a */
    public static ColorStateList m50153a(ColorStateList colorStateList) {
        if (f36700a) {
            return new ColorStateList(new int[][]{f36709j, StateSet.NOTHING}, new int[]{m50155c(colorStateList, f36705f), m50155c(colorStateList, f36701b)});
        }
        int[] iArr = f36705f;
        int[] iArr2 = f36706g;
        int[] iArr3 = f36707h;
        int[] iArr4 = f36708i;
        int[] iArr5 = f36701b;
        int[] iArr6 = f36702c;
        int[] iArr7 = f36703d;
        int[] iArr8 = f36704e;
        return new ColorStateList(new int[][]{iArr, iArr2, iArr3, iArr4, f36709j, iArr5, iArr6, iArr7, iArr8, StateSet.NOTHING}, new int[]{m50155c(colorStateList, iArr), m50155c(colorStateList, iArr2), m50155c(colorStateList, iArr3), m50155c(colorStateList, iArr4), 0, m50155c(colorStateList, iArr5), m50155c(colorStateList, iArr6), m50155c(colorStateList, iArr7), m50155c(colorStateList, iArr8), 0});
    }

    @TargetApi(21)
    /* renamed from: b */
    private static int m50154b(int i) {
        return C3621a.m15595m(i, Math.min(Color.alpha(i) * 2, 255));
    }

    /* renamed from: c */
    private static int m50155c(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return f36700a ? m50154b(colorForState) : colorForState;
    }
}
