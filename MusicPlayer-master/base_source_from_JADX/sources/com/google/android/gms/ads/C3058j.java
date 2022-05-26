package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.ads.admanager.C2889b;
import com.google.android.gms.internal.ads.C5497qt;
import com.google.android.gms.internal.ads.C5760xx;
import com.google.android.gms.internal.ads.ul0;

/* renamed from: com.google.android.gms.ads.j */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class C3058j extends ViewGroup {

    /* renamed from: g */
    protected final C5760xx f10146g;

    protected C3058j(@RecentlyNonNull Context context, int i) {
        super(context);
        this.f10146g = new C5760xx(this, i);
    }

    /* renamed from: a */
    public void mo11151a() {
        this.f10146g.mo22101n();
    }

    /* renamed from: b */
    public void mo11152b(@RecentlyNonNull C2903f fVar) {
        this.f10146g.mo22102o(fVar.mo10733a());
    }

    /* renamed from: c */
    public void mo11153c() {
        this.f10146g.mo22103p();
    }

    /* renamed from: d */
    public void mo11154d() {
        this.f10146g.mo22104q();
    }

    @RecentlyNonNull
    public C2894c getAdListener() {
        return this.f10146g.mo22092d();
    }

    @RecentlyNullable
    public C2921g getAdSize() {
        return this.f10146g.mo22093e();
    }

    @RecentlyNonNull
    public String getAdUnitId() {
        return this.f10146g.mo22100m();
    }

    @RecentlyNullable
    public C3107o getOnPaidEventListener() {
        return this.f10146g.mo22094f();
    }

    @RecentlyNullable
    public C3112s getResponseInfo() {
        return this.f10146g.mo22095g();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null && childAt.getVisibility() != 8) {
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i5 = ((i3 - i) - measuredWidth) / 2;
            int i6 = ((i4 - i2) - measuredHeight) / 2;
            childAt.layout(i5, i6, measuredWidth + i5, measuredHeight + i6);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        C2921g gVar;
        int i4 = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            try {
                gVar = getAdSize();
            } catch (NullPointerException e) {
                ul0.m31860e("Unable to retrieve ad size.", e);
                gVar = null;
            }
            if (gVar != null) {
                Context context = getContext();
                int e2 = gVar.mo10797e(context);
                i3 = gVar.mo10795c(context);
                i4 = e2;
            } else {
                i3 = 0;
            }
        } else {
            measureChild(childAt, i, i2);
            i4 = childAt.getMeasuredWidth();
            i3 = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(i4, getSuggestedMinimumWidth()), i), View.resolveSize(Math.max(i3, getSuggestedMinimumHeight()), i2));
    }

    public void setAdListener(@RecentlyNonNull C2894c cVar) {
        this.f10146g.mo22106s(cVar);
        if (cVar == null) {
            this.f10146g.mo22105r((C5497qt) null);
            return;
        }
        if (cVar instanceof C5497qt) {
            this.f10146g.mo22105r((C5497qt) cVar);
        }
        if (cVar instanceof C2889b) {
            this.f10146g.mo22110w((C2889b) cVar);
        }
    }

    public void setAdSize(@RecentlyNonNull C2921g gVar) {
        this.f10146g.mo22107t(gVar);
    }

    public void setAdUnitId(@RecentlyNonNull String str) {
        this.f10146g.mo22109v(str);
    }

    public void setOnPaidEventListener(C3107o oVar) {
        this.f10146g.mo22112y(oVar);
    }

    protected C3058j(@RecentlyNonNull Context context, @RecentlyNonNull AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.f10146g = new C5760xx(this, attributeSet, false, i);
    }

    protected C3058j(@RecentlyNonNull Context context, @RecentlyNonNull AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.f10146g = new C5760xx(this, attributeSet, false, i2);
    }

    protected C3058j(@RecentlyNonNull Context context, @RecentlyNonNull AttributeSet attributeSet, int i, int i2, boolean z) {
        super(context, attributeSet, i);
        this.f10146g = new C5760xx(this, attributeSet, z, i2);
    }

    protected C3058j(@RecentlyNonNull Context context, @RecentlyNonNull AttributeSet attributeSet, boolean z) {
        super(context, attributeSet);
        this.f10146g = new C5760xx(this, attributeSet, z);
    }
}
