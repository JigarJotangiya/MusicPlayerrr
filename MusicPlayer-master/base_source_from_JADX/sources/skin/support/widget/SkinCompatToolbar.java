package skin.support.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.Toolbar;
import p443m.p444a.p446d.C9322a;
import p443m.p444a.p446d.C9323b;
import p443m.p444a.p447e.p448a.C9332d;
import p443m.p444a.p447e.p448a.C9335g;

public class SkinCompatToolbar extends Toolbar implements C9716g {

    /* renamed from: V */
    private int f36793V;

    /* renamed from: W */
    private int f36794W;

    /* renamed from: a0 */
    private int f36795a0;

    /* renamed from: b0 */
    private C9710a f36796b0;

    public SkinCompatToolbar(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: Q */
    private void m50275Q() {
        int a = C9712c.m50287a(this.f36795a0);
        this.f36795a0 = a;
        if (a != 0) {
            setNavigationIcon(C9335g.m49448a(getContext(), this.f36795a0));
        }
    }

    /* renamed from: R */
    private void m50276R() {
        int a = C9712c.m50287a(this.f36794W);
        this.f36794W = a;
        if (a != 0) {
            setSubtitleTextColor(C9332d.m49405b(getContext(), this.f36794W));
        }
    }

    /* renamed from: S */
    private void m50277S() {
        int a = C9712c.m50287a(this.f36793V);
        this.f36793V = a;
        if (a != 0) {
            setTitleTextColor(C9332d.m49405b(getContext(), this.f36793V));
        }
    }

    /* renamed from: f */
    public void mo33834f() {
        C9710a aVar = this.f36796b0;
        if (aVar != null) {
            aVar.mo33869b();
        }
        m50277S();
        m50276R();
        m50275Q();
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C9710a aVar = this.f36796b0;
        if (aVar != null) {
            aVar.mo33871d(i);
        }
    }

    public void setNavigationIcon(int i) {
        super.setNavigationIcon(i);
        this.f36795a0 = i;
        m50275Q();
    }

    public SkinCompatToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C9322a.toolbarStyle);
    }

    public SkinCompatToolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f36793V = 0;
        this.f36794W = 0;
        this.f36795a0 = 0;
        C9710a aVar = new C9710a(this);
        this.f36796b0 = aVar;
        aVar.mo33870c(attributeSet, i);
        int[] iArr = C9323b.Toolbar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        this.f36795a0 = obtainStyledAttributes.getResourceId(C9323b.Toolbar_navigationIcon, 0);
        int resourceId = obtainStyledAttributes.getResourceId(C9323b.Toolbar_titleTextAppearance, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(C9323b.Toolbar_subtitleTextAppearance, 0);
        obtainStyledAttributes.recycle();
        if (resourceId != 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, C9323b.SkinTextAppearance);
            this.f36793V = obtainStyledAttributes2.getResourceId(C9323b.SkinTextAppearance_android_textColor, 0);
            obtainStyledAttributes2.recycle();
        }
        if (resourceId2 != 0) {
            TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(resourceId2, C9323b.SkinTextAppearance);
            this.f36794W = obtainStyledAttributes3.getResourceId(C9323b.SkinTextAppearance_android_textColor, 0);
            obtainStyledAttributes3.recycle();
        }
        TypedArray obtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        int i2 = C9323b.Toolbar_titleTextColor;
        if (obtainStyledAttributes4.hasValue(i2)) {
            this.f36793V = obtainStyledAttributes4.getResourceId(i2, 0);
        }
        int i3 = C9323b.Toolbar_subtitleTextColor;
        if (obtainStyledAttributes4.hasValue(i3)) {
            this.f36794W = obtainStyledAttributes4.getResourceId(i3, 0);
        }
        obtainStyledAttributes4.recycle();
        m50277S();
        m50276R();
        m50275Q();
    }
}
