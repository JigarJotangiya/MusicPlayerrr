package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.C0171g;
import com.google.android.material.navigation.C6116a;
import com.google.android.material.navigation.C6119c;
import p082e.p109h.p119p.C3774v;
import p159f.p243f.p245b.p304b.C7492d;

/* renamed from: com.google.android.material.bottomnavigation.b */
/* compiled from: BottomNavigationMenuView */
public class C5931b extends C6119c {

    /* renamed from: B */
    private final int f27817B;

    /* renamed from: C */
    private final int f27818C;

    /* renamed from: D */
    private final int f27819D;

    /* renamed from: E */
    private final int f27820E;

    /* renamed from: F */
    private final int f27821F;

    /* renamed from: G */
    private boolean f27822G;

    /* renamed from: H */
    private int[] f27823H = new int[5];

    public C5931b(Context context) {
        super(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.f27817B = resources.getDimensionPixelSize(C7492d.design_bottom_navigation_item_max_width);
        this.f27818C = resources.getDimensionPixelSize(C7492d.design_bottom_navigation_item_min_width);
        this.f27819D = resources.getDimensionPixelSize(C7492d.design_bottom_navigation_active_item_max_width);
        this.f27820E = resources.getDimensionPixelSize(C7492d.design_bottom_navigation_active_item_min_width);
        this.f27821F = resources.getDimensionPixelSize(C7492d.design_bottom_navigation_height);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public C6116a mo23041f(Context context) {
        return new C5930a(context);
    }

    /* renamed from: l */
    public boolean mo23042l() {
        return this.f27822G;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                if (C3774v.m16151B(this) == 1) {
                    int i9 = i5 - i7;
                    childAt.layout(i9 - childAt.getMeasuredWidth(), 0, i9, i6);
                } else {
                    childAt.layout(i7, 0, childAt.getMeasuredWidth() + i7, i6);
                }
                i7 += childAt.getMeasuredWidth();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        C0171g menu = getMenu();
        int size = View.MeasureSpec.getSize(i);
        int size2 = menu.mo887G().size();
        int childCount = getChildCount();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f27821F, 1073741824);
        if (!mo24354g(getLabelVisibilityMode(), size2) || !mo23042l()) {
            int min = Math.min(size / (size2 == 0 ? 1 : size2), this.f27819D);
            int i3 = size - (size2 * min);
            for (int i4 = 0; i4 < childCount; i4++) {
                if (getChildAt(i4).getVisibility() != 8) {
                    int[] iArr = this.f27823H;
                    iArr[i4] = min;
                    if (i3 > 0) {
                        iArr[i4] = iArr[i4] + 1;
                        i3--;
                    }
                } else {
                    this.f27823H[i4] = 0;
                }
            }
        } else {
            View childAt = getChildAt(getSelectedItemPosition());
            int i5 = this.f27820E;
            if (childAt.getVisibility() != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(this.f27819D, Integer.MIN_VALUE), makeMeasureSpec);
                i5 = Math.max(i5, childAt.getMeasuredWidth());
            }
            int i6 = size2 - (childAt.getVisibility() != 8 ? 1 : 0);
            int min2 = Math.min(size - (this.f27818C * i6), Math.min(i5, this.f27819D));
            int i7 = size - min2;
            int min3 = Math.min(i7 / (i6 == 0 ? 1 : i6), this.f27817B);
            int i8 = i7 - (i6 * min3);
            int i9 = 0;
            while (i9 < childCount) {
                if (getChildAt(i9).getVisibility() != 8) {
                    this.f27823H[i9] = i9 == getSelectedItemPosition() ? min2 : min3;
                    if (i8 > 0) {
                        int[] iArr2 = this.f27823H;
                        iArr2[i9] = iArr2[i9] + 1;
                        i8--;
                    }
                } else {
                    this.f27823H[i9] = 0;
                }
                i9++;
            }
        }
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt2 = getChildAt(i11);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(this.f27823H[i11], 1073741824), makeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                i10 += childAt2.getMeasuredWidth();
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(i10, View.MeasureSpec.makeMeasureSpec(i10, 1073741824), 0), View.resolveSizeAndState(this.f27821F, makeMeasureSpec, 0));
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        this.f27822G = z;
    }
}
