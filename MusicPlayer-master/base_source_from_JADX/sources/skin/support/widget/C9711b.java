package skin.support.widget;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import androidx.core.widget.C0549e;
import p443m.p444a.p446d.C9323b;
import p443m.p444a.p447e.p448a.C9332d;
import p443m.p444a.p447e.p448a.C9335g;

/* renamed from: skin.support.widget.b */
/* compiled from: SkinCompatCompoundButtonHelper */
public class C9711b extends C9712c {

    /* renamed from: a */
    private final CompoundButton f36801a;

    /* renamed from: b */
    private int f36802b = 0;

    /* renamed from: c */
    private int f36803c = 0;

    public C9711b(CompoundButton compoundButton) {
        this.f36801a = compoundButton;
    }

    /* renamed from: b */
    public void mo33872b() {
        int a = C9712c.m50287a(this.f36802b);
        this.f36802b = a;
        if (a != 0) {
            CompoundButton compoundButton = this.f36801a;
            compoundButton.setButtonDrawable(C9335g.m49448a(compoundButton.getContext(), this.f36802b));
        }
        int a2 = C9712c.m50287a(this.f36803c);
        this.f36803c = a2;
        if (a2 != 0) {
            CompoundButton compoundButton2 = this.f36801a;
            C0549e.m3395c(compoundButton2, C9332d.m49406c(compoundButton2.getContext(), this.f36803c));
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo33873c(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f36801a.getContext().obtainStyledAttributes(attributeSet, C9323b.CompoundButton, i, 0);
        try {
            int i2 = C9323b.CompoundButton_android_button;
            if (obtainStyledAttributes.hasValue(i2)) {
                this.f36802b = obtainStyledAttributes.getResourceId(i2, 0);
            }
            int i3 = C9323b.CompoundButton_buttonTint;
            if (obtainStyledAttributes.hasValue(i3)) {
                this.f36803c = obtainStyledAttributes.getResourceId(i3, 0);
            }
            obtainStyledAttributes.recycle();
            mo33872b();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* renamed from: d */
    public void mo33874d(int i) {
        this.f36802b = i;
        mo33872b();
    }
}
