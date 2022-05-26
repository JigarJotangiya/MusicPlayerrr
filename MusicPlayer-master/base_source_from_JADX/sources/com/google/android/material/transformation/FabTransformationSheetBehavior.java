package com.google.android.material.transformation;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.transformation.FabTransformationBehavior;
import java.util.HashMap;
import java.util.Map;
import p082e.p109h.p119p.C3774v;
import p159f.p243f.p245b.p304b.C7489a;
import p159f.p243f.p245b.p304b.p305m.C7508h;
import p159f.p243f.p245b.p304b.p305m.C7510j;

@Deprecated
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: i */
    private Map<View, Integer> f29268i;

    public FabTransformationSheetBehavior() {
    }

    /* renamed from: g0 */
    private void m37476g0(View view, boolean z) {
        ViewParent parent = view.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (Build.VERSION.SDK_INT >= 16 && z) {
                this.f29268i = new HashMap(childCount);
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                boolean z2 = (childAt.getLayoutParams() instanceof CoordinatorLayout.C0450e) && (((CoordinatorLayout.C0450e) childAt.getLayoutParams()).mo3092f() instanceof FabTransformationScrimBehavior);
                if (childAt != view && !z2) {
                    if (!z) {
                        Map<View, Integer> map = this.f29268i;
                        if (map != null && map.containsKey(childAt)) {
                            C3774v.m16237y0(childAt, this.f29268i.get(childAt).intValue());
                        }
                    } else {
                        if (Build.VERSION.SDK_INT >= 16) {
                            this.f29268i.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        }
                        C3774v.m16237y0(childAt, 4);
                    }
                }
            }
            if (!z) {
                this.f29268i = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public boolean mo25130H(View view, View view2, boolean z, boolean z2) {
        m37476g0(view2, z);
        return super.mo25130H(view, view2, z, z2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e0 */
    public FabTransformationBehavior.C6284e mo25134e0(Context context, boolean z) {
        int i;
        if (z) {
            i = C7489a.mtrl_fab_transformation_sheet_expand_spec;
        } else {
            i = C7489a.mtrl_fab_transformation_sheet_collapse_spec;
        }
        FabTransformationBehavior.C6284e eVar = new FabTransformationBehavior.C6284e();
        eVar.f29262a = C7508h.m41956d(context, i);
        eVar.f29263b = new C7510j(17, 0.0f, 0.0f);
        return eVar;
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
