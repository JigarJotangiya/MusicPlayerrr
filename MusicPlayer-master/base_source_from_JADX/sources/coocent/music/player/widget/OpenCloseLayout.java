package coocent.music.player.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import p342g.p343a.p344a.p346c.C7953f;

public class OpenCloseLayout extends ImageView implements View.OnClickListener {

    /* renamed from: g */
    private boolean f31615g = false;

    /* renamed from: h */
    private C7953f f31616h;

    /* renamed from: i */
    private int f31617i = 0;

    public OpenCloseLayout(Context context) {
        super(context);
    }

    /* renamed from: a */
    private void m40708a() {
        this.f31615g = false;
    }

    /* renamed from: b */
    private void m40709b() {
        setOnClickListener(this);
    }

    private void setCallBack(boolean z) {
        switch (this.f31617i) {
            case 1:
                C7953f fVar = this.f31616h;
                if (fVar != null) {
                    fVar.mo29484b(this.f31615g, z);
                    return;
                }
                return;
            case 2:
                C7953f fVar2 = this.f31616h;
                if (fVar2 != null) {
                    fVar2.mo29488f(this.f31615g, z);
                    return;
                }
                return;
            case 3:
                C7953f fVar3 = this.f31616h;
                if (fVar3 != null) {
                    fVar3.mo29487e(this.f31615g, z);
                    return;
                }
                return;
            case 4:
                C7953f fVar4 = this.f31616h;
                if (fVar4 != null) {
                    fVar4.mo29483a(this.f31615g, z);
                    return;
                }
                return;
            case 5:
                C7953f fVar5 = this.f31616h;
                if (fVar5 != null) {
                    fVar5.mo29485c(this.f31615g, z);
                    return;
                }
                return;
            case 6:
                C7953f fVar6 = this.f31616h;
                if (fVar6 != null) {
                    fVar6.mo29489g(this.f31615g, z);
                    return;
                }
                return;
            case 7:
                C7953f fVar7 = this.f31616h;
                if (fVar7 != null) {
                    fVar7.mo29486d(this.f31615g, z);
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: d */
    public boolean mo27538d() {
        return this.f31615g;
    }

    /* renamed from: f */
    public void mo27539f(boolean z, boolean z2) {
        this.f31615g = z;
        setCallBack(z2);
    }

    public void onClick(View view) {
        this.f31615g = !this.f31615g;
        setCallBack(true);
    }

    public void setOnEqSwitchCallBack(C7953f fVar) {
        this.f31616h = fVar;
    }

    public void setType(int i) {
        this.f31617i = i;
    }

    public OpenCloseLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m40708a();
        m40709b();
    }

    public OpenCloseLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
