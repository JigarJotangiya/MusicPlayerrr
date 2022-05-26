package net.coocent.android.xmlparser.widget.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.C0674g0;
import androidx.lifecycle.C0697n;
import androidx.lifecycle.C0717u;
import androidx.lifecycle.C0718v;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import net.coocent.android.xmlparser.C9459l;
import net.coocent.android.xmlparser.C9483n;
import net.coocent.android.xmlparser.C9502v;
import net.coocent.android.xmlparser.application.AbstractApplication;
import p391j.p392a.p393a.C8612e;
import p391j.p392a.p393a.C8613f;
import p391j.p392a.p393a.C8614g;
import p391j.p392a.p393a.C8615h;
import p391j.p392a.p393a.C8618k;

public class GiftSwitchView extends FrameLayout implements C0717u {

    /* renamed from: g */
    private AppCompatImageView f36593g;

    /* renamed from: h */
    private AppCompatImageView f36594h;

    /* renamed from: i */
    private ScheduledExecutorService f36595i;

    /* renamed from: j */
    private ScheduledFuture f36596j;

    /* renamed from: k */
    private Runnable f36597k;

    /* renamed from: l */
    private ScaleAnimation f36598l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public ScaleAnimation f36599m;

    /* renamed from: n */
    private List<C9483n> f36600n;

    /* renamed from: o */
    private C9538b f36601o;

    /* renamed from: p */
    private int f36602p;

    /* renamed from: q */
    private int f36603q;

    /* renamed from: r */
    private boolean f36604r;

    /* renamed from: net.coocent.android.xmlparser.widget.view.GiftSwitchView$a */
    class C9537a implements Animation.AnimationListener {
        C9537a() {
        }

        public void onAnimationEnd(Animation animation) {
            GiftSwitchView giftSwitchView = GiftSwitchView.this;
            giftSwitchView.startAnimation(giftSwitchView.f36599m);
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: net.coocent.android.xmlparser.widget.view.GiftSwitchView$b */
    public interface C9538b {
        /* renamed from: a */
        void mo32820a(C9483n nVar);
    }

    public GiftSwitchView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: i */
    private void m50039i() {
        View inflate = LayoutInflater.from(getContext()).inflate(C8615h.layout_toolbar_switch_view, this, true);
        this.f36593g = (AppCompatImageView) inflate.findViewById(C8614g.iv_gift);
        this.f36594h = (AppCompatImageView) inflate.findViewById(C8614g.tv_ads);
        this.f36600n = new ArrayList();
        this.f36595i = Executors.newScheduledThreadPool(1);
        this.f36597k = new C9540b(this);
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 1.8f, 1.0f, 1.8f, 1, 0.5f, 1, 0.5f);
        this.f36598l = scaleAnimation;
        scaleAnimation.setDuration(200);
        this.f36598l.setFillAfter(true);
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(1.8f, 1.0f, 1.8f, 1.0f, 1, 0.5f, 1, 0.5f);
        this.f36599m = scaleAnimation2;
        scaleAnimation2.setDuration(200);
        this.f36599m.setFillAfter(true);
        this.f36598l.setAnimationListener(new C9537a());
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void mo32809l(C9483n nVar, Bitmap bitmap) {
        if (bitmap != null) {
            this.f36593g.setImageBitmap(bitmap);
            this.f36594h.setImageResource(C8613f.ic_ad);
        }
        startAnimation(this.f36598l);
        if (this.f36603q < this.f36600n.size()) {
            this.f36603q++;
        } else {
            this.f36603q = 0;
        }
        C9538b bVar = this.f36601o;
        if (bVar != null) {
            bVar.mo32820a(nVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ void mo32810n() {
        if (!this.f36600n.isEmpty()) {
            if (this.f36603q >= this.f36600n.size()) {
                this.f36603q = 0;
            }
            C9483n nVar = this.f36600n.get(this.f36603q);
            String e = nVar.mo32693e();
            C9459l.m49807b(e, C9502v.f36501e + this.f36600n.get(this.f36603q).mo32695g(), new C9539a(this, nVar));
        }
    }

    public C9483n getCurrentGift() {
        int i;
        if (this.f36600n.isEmpty() || (i = this.f36603q) <= 0) {
            return null;
        }
        return this.f36600n.get(i - 1);
    }

    /* renamed from: j */
    public boolean mo32808j() {
        ScheduledFuture scheduledFuture;
        if (this.f36595i == null || (scheduledFuture = this.f36596j) == null || scheduledFuture.isCancelled() || this.f36595i.isShutdown()) {
            return false;
        }
        return true;
    }

    /* renamed from: o */
    public void mo32811o() {
        try {
            if (!this.f36595i.isShutdown()) {
                this.f36596j = this.f36595i.scheduleAtFixedRate(this.f36597k, 0, (long) this.f36602p, TimeUnit.MILLISECONDS);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: package-private */
    @C0674g0(C0697n.C0699b.ON_DESTROY)
    public void onLifecycleDestroy(C0718v vVar) {
        if (!this.f36604r) {
            mo32814p();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(C8612e.gift_action_provider_size);
        setMeasuredDimension(FrameLayout.resolveSizeAndState(dimensionPixelSize, i, 1), FrameLayout.resolveSizeAndState(dimensionPixelSize, i2, 1));
    }

    /* renamed from: p */
    public void mo32814p() {
        this.f36604r = true;
        this.f36601o = null;
        this.f36598l.cancel();
        this.f36599m.cancel();
        ScheduledFuture scheduledFuture = this.f36596j;
        if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
            this.f36596j.cancel(true);
        }
        this.f36595i.shutdownNow();
    }

    public void setGift(List<C9483n> list) {
        if (list != null) {
            this.f36600n = list;
        }
    }

    public void setOnGiftChangedListener(C9538b bVar) {
        this.f36601o = bVar;
    }

    public GiftSwitchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GiftSwitchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f36603q = 0;
        this.f36604r = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C8618k.GiftSwitchView);
        if (obtainStyledAttributes != null) {
            this.f36602p = obtainStyledAttributes.getInt(C8618k.GiftSwitchView_switch_time, 13000);
            obtainStyledAttributes.recycle();
        }
        if (((AbstractApplication) AbstractApplication.getApplication()).mo26945h() != 0) {
            setVisibility(4);
        }
        m50039i();
    }
}
