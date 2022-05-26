package com.p256kk.taurus.playerbase.render;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import com.p256kk.taurus.playerbase.p261e.C6640b;
import com.p256kk.taurus.playerbase.player.C6709a;
import com.p256kk.taurus.playerbase.render.C6723b;
import java.lang.ref.WeakReference;

/* renamed from: com.kk.taurus.playerbase.render.RenderTextureView */
public class RenderTextureView extends TextureView implements C6723b {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C6723b.C6724a f30122g;

    /* renamed from: h */
    private C6726c f30123h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public SurfaceTexture f30124i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f30125j;

    /* renamed from: k */
    private boolean f30126k;

    /* renamed from: l */
    private Surface f30127l;

    /* renamed from: com.kk.taurus.playerbase.render.RenderTextureView$b */
    private static final class C6720b implements C6723b.C6725b {

        /* renamed from: a */
        private WeakReference<Surface> f30128a;

        /* renamed from: b */
        private WeakReference<RenderTextureView> f30129b;

        public C6720b(RenderTextureView renderTextureView, SurfaceTexture surfaceTexture) {
            this.f30129b = new WeakReference<>(renderTextureView);
            this.f30128a = new WeakReference<>(new Surface(surfaceTexture));
        }

        /* renamed from: a */
        public void mo26130a(C6709a aVar) {
            RenderTextureView b = mo26142b();
            if (aVar != null && this.f30128a != null && b != null) {
                SurfaceTexture ownSurfaceTexture = b.getOwnSurfaceTexture();
                SurfaceTexture surfaceTexture = b.getSurfaceTexture();
                boolean z = false;
                boolean isReleased = (ownSurfaceTexture == null || Build.VERSION.SDK_INT < 26) ? false : ownSurfaceTexture.isReleased();
                if (ownSurfaceTexture != null && !isReleased) {
                    z = true;
                }
                if (!b.mo26136i() || !z || Build.VERSION.SDK_INT < 16) {
                    Surface surface = (Surface) this.f30128a.get();
                    if (surface != null) {
                        aVar.setSurface(surface);
                        b.setSurface(surface);
                        C6640b.m38216a("RenderTextureView", "****bindSurface****");
                    }
                } else if (!ownSurfaceTexture.equals(surfaceTexture)) {
                    b.setSurfaceTexture(ownSurfaceTexture);
                    C6640b.m38216a("RenderTextureView", "****setSurfaceTexture****");
                } else {
                    Surface surface2 = b.getSurface();
                    if (surface2 != null) {
                        surface2.release();
                    }
                    Surface surface3 = new Surface(ownSurfaceTexture);
                    aVar.setSurface(surface3);
                    b.setSurface(surface3);
                    C6640b.m38216a("RenderTextureView", "****bindSurface****");
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public RenderTextureView mo26142b() {
            WeakReference<RenderTextureView> weakReference = this.f30129b;
            if (weakReference != null) {
                return (RenderTextureView) weakReference.get();
            }
            return null;
        }
    }

    /* renamed from: com.kk.taurus.playerbase.render.RenderTextureView$c */
    private class C6721c implements TextureView.SurfaceTextureListener {
        private C6721c() {
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            C6640b.m38216a("RenderTextureView", "<---onSurfaceTextureAvailable---> : width = " + i + " height = " + i2);
            if (RenderTextureView.this.f30122g != null) {
                RenderTextureView.this.f30122g.mo25886c(new C6720b(RenderTextureView.this, surfaceTexture), i, i2);
            }
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            C6640b.m38216a("RenderTextureView", "***onSurfaceTextureDestroyed***");
            if (RenderTextureView.this.f30122g != null) {
                RenderTextureView.this.f30122g.mo25884a(new C6720b(RenderTextureView.this, surfaceTexture));
            }
            if (RenderTextureView.this.f30125j) {
                SurfaceTexture unused = RenderTextureView.this.f30124i = surfaceTexture;
            }
            if (Build.VERSION.SDK_INT <= 19) {
                return false;
            }
            return !RenderTextureView.this.f30125j;
        }

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            C6640b.m38216a("RenderTextureView", "onSurfaceTextureSizeChanged : width = " + i + " height = " + i2);
            if (RenderTextureView.this.f30122g != null) {
                RenderTextureView.this.f30122g.mo25885b(new C6720b(RenderTextureView.this, surfaceTexture), 0, i, i2);
            }
        }

        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    public RenderTextureView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public void mo26118a() {
        SurfaceTexture surfaceTexture = this.f30124i;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.f30124i = null;
        }
        Surface surface = this.f30127l;
        if (surface != null) {
            surface.release();
            this.f30127l = null;
        }
        setSurfaceTextureListener((TextureView.SurfaceTextureListener) null);
        this.f30126k = true;
    }

    /* renamed from: b */
    public void mo26119b(int i, int i2) {
        if (i > 0 && i2 > 0) {
            this.f30123h.mo26152f(i, i2);
            requestLayout();
        }
    }

    /* renamed from: c */
    public void mo26120c(C6722a aVar) {
        this.f30123h.mo26150d(aVar);
        requestLayout();
    }

    /* renamed from: d */
    public void mo26121d(int i, int i2) {
        C6640b.m38216a("RenderTextureView", "onUpdateVideoSize : videoWidth = " + i + " videoHeight = " + i2);
        this.f30123h.mo26153g(i, i2);
        requestLayout();
    }

    /* renamed from: e */
    public boolean mo26122e() {
        return this.f30126k;
    }

    /* access modifiers changed from: package-private */
    public SurfaceTexture getOwnSurfaceTexture() {
        return this.f30124i;
    }

    public View getRenderView() {
        return this;
    }

    /* access modifiers changed from: package-private */
    public Surface getSurface() {
        return this.f30127l;
    }

    /* renamed from: i */
    public boolean mo26136i() {
        return this.f30125j;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C6640b.m38216a("RenderTextureView", "onTextureViewAttachedToWindow");
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C6640b.m38216a("RenderTextureView", "onTextureViewDetachedFromWindow");
        if (Build.VERSION.SDK_INT <= 19) {
            mo26118a();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        this.f30123h.mo26147a(i, i2);
        setMeasuredDimension(this.f30123h.mo26149c(), this.f30123h.mo26148b());
    }

    public void setRenderCallback(C6723b.C6724a aVar) {
        this.f30122g = aVar;
    }

    /* access modifiers changed from: package-private */
    public void setSurface(Surface surface) {
        this.f30127l = surface;
    }

    public void setTakeOverSurfaceTexture(boolean z) {
        this.f30125j = z;
    }

    public void setVideoRotation(int i) {
        this.f30123h.mo26151e(i);
        setRotation((float) i);
    }

    public RenderTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30123h = new C6726c();
        setSurfaceTextureListener(new C6721c());
    }
}
