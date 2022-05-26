package com.p256kk.taurus.playerbase.render;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import com.p256kk.taurus.playerbase.p261e.C6640b;
import com.p256kk.taurus.playerbase.player.C6709a;
import com.p256kk.taurus.playerbase.render.C6723b;
import java.lang.ref.WeakReference;

/* renamed from: com.kk.taurus.playerbase.render.RenderSurfaceView */
public class RenderSurfaceView extends SurfaceView implements C6723b {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C6723b.C6724a f30117g;

    /* renamed from: h */
    private C6726c f30118h;

    /* renamed from: i */
    private boolean f30119i;

    /* renamed from: com.kk.taurus.playerbase.render.RenderSurfaceView$b */
    private static final class C6717b implements C6723b.C6725b {

        /* renamed from: a */
        private WeakReference<SurfaceHolder> f30120a;

        public C6717b(SurfaceHolder surfaceHolder) {
            this.f30120a = new WeakReference<>(surfaceHolder);
        }

        /* renamed from: a */
        public void mo26130a(C6709a aVar) {
            if (aVar != null && this.f30120a.get() != null) {
                aVar.setDisplay((SurfaceHolder) this.f30120a.get());
            }
        }
    }

    /* renamed from: com.kk.taurus.playerbase.render.RenderSurfaceView$c */
    private class C6718c implements SurfaceHolder.Callback {
        private C6718c() {
        }

        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            C6640b.m38216a("RenderSurfaceView", "surfaceChanged : width = " + i2 + " height = " + i3);
            if (RenderSurfaceView.this.f30117g != null) {
                RenderSurfaceView.this.f30117g.mo25885b(new C6717b(surfaceHolder), i, i2, i3);
            }
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            C6640b.m38216a("RenderSurfaceView", "<---surfaceCreated---->");
            if (RenderSurfaceView.this.f30117g != null) {
                RenderSurfaceView.this.f30117g.mo25886c(new C6717b(surfaceHolder), 0, 0);
            }
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            C6640b.m38216a("RenderSurfaceView", "***surfaceDestroyed***");
            if (RenderSurfaceView.this.f30117g != null) {
                RenderSurfaceView.this.f30117g.mo25884a(new C6717b(surfaceHolder));
            }
        }
    }

    public RenderSurfaceView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public void mo26118a() {
        this.f30119i = true;
    }

    /* renamed from: b */
    public void mo26119b(int i, int i2) {
        if (i > 0 && i2 > 0) {
            this.f30118h.mo26152f(i, i2);
            requestLayout();
        }
    }

    /* renamed from: c */
    public void mo26120c(C6722a aVar) {
        this.f30118h.mo26150d(aVar);
        requestLayout();
    }

    /* renamed from: d */
    public void mo26121d(int i, int i2) {
        this.f30118h.mo26153g(i, i2);
        mo26123g(i, i2);
        requestLayout();
    }

    /* renamed from: e */
    public boolean mo26122e() {
        return this.f30119i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo26123g(int i, int i2) {
        if (i != 0 && i2 != 0) {
            getHolder().setFixedSize(i, i2);
        }
    }

    public View getRenderView() {
        return this;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C6640b.m38216a("RenderSurfaceView", "onSurfaceViewAttachedToWindow");
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C6640b.m38216a("RenderSurfaceView", "onSurfaceViewDetachedFromWindow");
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f30118h.mo26147a(i, i2);
        setMeasuredDimension(this.f30118h.mo26149c(), this.f30118h.mo26148b());
    }

    public void setRenderCallback(C6723b.C6724a aVar) {
        this.f30117g = aVar;
    }

    public void setVideoRotation(int i) {
        C6640b.m38217b("RenderSurfaceView", "surface view not support rotation ... ");
    }

    public RenderSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30118h = new C6726c();
        getHolder().addCallback(new C6718c());
    }
}
