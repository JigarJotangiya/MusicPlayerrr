package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.TextureView;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class ru3 implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, x74, wx3, b44, h14, p63, m23, wu3, f60, jj3 {

    /* renamed from: g */
    final /* synthetic */ uu3 f23211g;

    /* synthetic */ ru3(uu3 uu3, qu3 qu3) {
        this.f23211g = uu3;
    }

    /* renamed from: C */
    public final void mo17379C(C5689w wVar, eb3 eb3) {
        this.f23211g.f24459m = wVar;
        this.f23211g.f24455i.mo17379C(wVar, eb3);
    }

    /* renamed from: E */
    public final void mo17380E(String str) {
        this.f23211g.f24455i.mo17380E(str);
    }

    /* renamed from: H */
    public final /* synthetic */ void mo17383H(int i) {
    }

    /* renamed from: L */
    public final void mo17386L(int i) {
        uu3.m32014C(this.f23211g);
    }

    /* renamed from: M */
    public final void mo17387M(String str) {
        this.f23211g.f24455i.mo17387M(str);
    }

    /* renamed from: S */
    public final void mo17393S(boolean z) {
    }

    /* renamed from: V */
    public final /* synthetic */ void mo17395V(i10 i10) {
    }

    /* renamed from: W */
    public final /* synthetic */ void mo17396W(s80 s80, s80 s802, int i) {
    }

    /* renamed from: X */
    public final /* synthetic */ void mo17397X(boolean z, int i) {
    }

    /* renamed from: Y */
    public final /* synthetic */ void mo17398Y(e50 e50) {
    }

    /* renamed from: Z */
    public final /* synthetic */ void mo17399Z(boolean z) {
    }

    /* renamed from: a */
    public final void mo17400a(boolean z) {
        if (this.f23211g.f24471y != z) {
            this.f23211g.f24471y = z;
            uu3.m32039x(this.f23211g);
        }
    }

    /* renamed from: a0 */
    public final void mo17401a0(boolean z, int i) {
        uu3.m32014C(this.f23211g);
    }

    /* renamed from: b */
    public final void mo17402b(cw0 cw0) {
        this.f23211g.f24447D = cw0;
        this.f23211g.f24455i.mo17402b(cw0);
        Iterator it = this.f23211g.f24454h.iterator();
        while (it.hasNext()) {
            ((w60) it.next()).mo17402b(cw0);
        }
    }

    /* renamed from: b0 */
    public final /* synthetic */ void mo17403b0(bg0 bg0, int i) {
    }

    /* renamed from: c */
    public final /* synthetic */ void mo18642c(boolean z) {
    }

    /* renamed from: c0 */
    public final /* synthetic */ void mo17405c0(au0 au0) {
    }

    /* renamed from: d */
    public final void mo17406d(da3 da3) {
        this.f23211g.f24466t = da3;
        this.f23211g.f24455i.mo17406d(da3);
    }

    /* renamed from: d0 */
    public final /* synthetic */ void mo17407d0(C5755xs xsVar) {
    }

    /* renamed from: e0 */
    public final /* synthetic */ void mo17409e0(C5825zn znVar, int i) {
    }

    /* renamed from: f */
    public final void mo17410f(Exception exc) {
        this.f23211g.f24455i.mo17410f(exc);
    }

    /* renamed from: f0 */
    public final /* synthetic */ void mo17411f0(uj0 uj0, uk0 uk0) {
    }

    /* renamed from: g */
    public final void mo17412g(String str, long j, long j2) {
        this.f23211g.f24455i.mo17412g(str, j, j2);
    }

    /* renamed from: g0 */
    public final /* synthetic */ void mo17413g0(C5133gz gzVar) {
    }

    /* renamed from: i */
    public final void mo17415i(int i, long j, long j2) {
        this.f23211g.f24455i.mo17415i(i, j, j2);
    }

    /* renamed from: j */
    public final void mo17416j(da3 da3) {
        this.f23211g.f24455i.mo17416j(da3);
        this.f23211g.f24458l = null;
        this.f23211g.f24466t = null;
    }

    /* renamed from: k */
    public final void mo17417k(Object obj, long j) {
        this.f23211g.f24455i.mo17417k(obj, j);
        if (this.f23211g.f24461o == obj) {
            Iterator it = this.f23211g.f24454h.iterator();
            while (it.hasNext()) {
                ((w60) it.next()).mo17414h();
            }
        }
    }

    /* renamed from: m */
    public final /* synthetic */ void mo17419m() {
    }

    /* renamed from: n */
    public final void mo17420n(Exception exc) {
        this.f23211g.f24455i.mo17420n(exc);
    }

    /* renamed from: o */
    public final void mo17421o(long j) {
        this.f23211g.f24455i.mo17421o(j);
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        uu3.m32041z(this.f23211g, surfaceTexture);
        this.f23211g.m32018R(i, i2);
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f23211g.m32021U((Object) null);
        this.f23211g.m32018R(0, 0);
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f23211g.m32018R(i, i2);
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    /* renamed from: p */
    public final void mo18643p(boolean z) {
        uu3.m32014C(this.f23211g);
    }

    /* renamed from: q */
    public final void mo17422q(C5689w wVar, eb3 eb3) {
        this.f23211g.f24458l = wVar;
        this.f23211g.f24455i.mo17422q(wVar, eb3);
    }

    /* renamed from: r */
    public final void mo17423r(long j, int i) {
        this.f23211g.f24455i.mo17423r(j, i);
    }

    /* renamed from: s */
    public final void mo17424s(da3 da3) {
        this.f23211g.f24467u = da3;
        this.f23211g.f24455i.mo17424s(da3);
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.f23211g.m32018R(i2, i3);
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f23211g.m32018R(0, 0);
    }

    /* renamed from: u */
    public final void mo17425u(int i, long j) {
        this.f23211g.f24455i.mo17425u(i, j);
    }

    /* renamed from: v */
    public final void mo17426v(Exception exc) {
        this.f23211g.f24455i.mo17426v(exc);
    }

    /* renamed from: w */
    public final void mo17427w(da3 da3) {
        this.f23211g.f24455i.mo17427w(da3);
        this.f23211g.f24459m = null;
        this.f23211g.f24467u = null;
    }

    /* renamed from: y */
    public final void mo17428y(String str, long j, long j2) {
        this.f23211g.f24455i.mo17428y(str, j, j2);
    }
}
