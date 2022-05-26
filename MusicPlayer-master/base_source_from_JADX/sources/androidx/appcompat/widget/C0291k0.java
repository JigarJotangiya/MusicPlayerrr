package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import p082e.p083a.C3403d;
import p082e.p083a.C3405f;
import p082e.p083a.C3406g;
import p082e.p083a.C3408i;

/* renamed from: androidx.appcompat.widget.k0 */
/* compiled from: TooltipPopup */
class C0291k0 {

    /* renamed from: a */
    private final Context f1346a;

    /* renamed from: b */
    private final View f1347b;

    /* renamed from: c */
    private final TextView f1348c;

    /* renamed from: d */
    private final WindowManager.LayoutParams f1349d;

    /* renamed from: e */
    private final Rect f1350e = new Rect();

    /* renamed from: f */
    private final int[] f1351f = new int[2];

    /* renamed from: g */
    private final int[] f1352g = new int[2];

    C0291k0(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f1349d = layoutParams;
        this.f1346a = context;
        View inflate = LayoutInflater.from(context).inflate(C3406g.abc_tooltip, (ViewGroup) null);
        this.f1347b = inflate;
        this.f1348c = (TextView) inflate.findViewById(C3405f.message);
        layoutParams.setTitle(C0291k0.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = C3408i.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    /* renamed from: a */
    private void m1717a(View view, int i, int i2, boolean z, WindowManager.LayoutParams layoutParams) {
        int i3;
        int i4;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f1346a.getResources().getDimensionPixelOffset(C3403d.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f1346a.getResources().getDimensionPixelOffset(C3403d.tooltip_precise_anchor_extra_offset);
            i4 = i2 + dimensionPixelOffset2;
            i3 = i2 - dimensionPixelOffset2;
        } else {
            i4 = view.getHeight();
            i3 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f1346a.getResources().getDimensionPixelOffset(z ? C3403d.tooltip_y_offset_touch : C3403d.tooltip_y_offset_non_touch);
        View b = m1718b(view);
        if (b == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        b.getWindowVisibleDisplayFrame(this.f1350e);
        Rect rect = this.f1350e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f1346a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f1350e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        b.getLocationOnScreen(this.f1352g);
        view.getLocationOnScreen(this.f1351f);
        int[] iArr = this.f1351f;
        int i5 = iArr[0];
        int[] iArr2 = this.f1352g;
        iArr[0] = i5 - iArr2[0];
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (iArr[0] + i) - (b.getWidth() / 2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f1347b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = this.f1347b.getMeasuredHeight();
        int[] iArr3 = this.f1351f;
        int i6 = ((iArr3[1] + i3) - dimensionPixelOffset3) - measuredHeight;
        int i7 = iArr3[1] + i4 + dimensionPixelOffset3;
        if (z) {
            if (i6 >= 0) {
                layoutParams.y = i6;
            } else {
                layoutParams.y = i7;
            }
        } else if (measuredHeight + i7 <= this.f1350e.height()) {
            layoutParams.y = i7;
        } else {
            layoutParams.y = i6;
        }
    }

    /* renamed from: b */
    private static View m1718b(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo2059c() {
        if (mo2060d()) {
            ((WindowManager) this.f1346a.getSystemService("window")).removeView(this.f1347b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo2060d() {
        return this.f1347b.getParent() != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo2061e(View view, int i, int i2, boolean z, CharSequence charSequence) {
        if (mo2060d()) {
            mo2059c();
        }
        this.f1348c.setText(charSequence);
        m1717a(view, i, i2, z, this.f1349d);
        ((WindowManager) this.f1346a.getSystemService("window")).addView(this.f1347b, this.f1349d);
    }
}
