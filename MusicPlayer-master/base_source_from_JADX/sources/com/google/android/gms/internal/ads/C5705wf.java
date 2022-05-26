package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.wf */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5705wf implements C4927bf {

    /* renamed from: b */
    private int f25374b = -1;

    /* renamed from: c */
    private int f25375c = -1;

    /* renamed from: d */
    private int[] f25376d;

    /* renamed from: e */
    private boolean f25377e;

    /* renamed from: f */
    private int[] f25378f;

    /* renamed from: g */
    private ByteBuffer f25379g;

    /* renamed from: h */
    private ByteBuffer f25380h;

    /* renamed from: i */
    private boolean f25381i;

    public C5705wf() {
        ByteBuffer byteBuffer = C4927bf.f14427a;
        this.f25379g = byteBuffer;
        this.f25380h = byteBuffer;
    }

    /* renamed from: a */
    public final int mo15771a() {
        return 2;
    }

    /* renamed from: b */
    public final ByteBuffer mo15772b() {
        ByteBuffer byteBuffer = this.f25380h;
        this.f25380h = C4927bf.f14427a;
        return byteBuffer;
    }

    /* renamed from: c */
    public final void mo15773c(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = this.f25374b;
        int length = ((limit - position) / (i + i)) * this.f25378f.length;
        int i2 = length + length;
        if (this.f25379g.capacity() < i2) {
            this.f25379g = ByteBuffer.allocateDirect(i2).order(ByteOrder.nativeOrder());
        } else {
            this.f25379g.clear();
        }
        while (position < limit) {
            for (int i3 : this.f25378f) {
                this.f25379g.putShort(byteBuffer.getShort(i3 + i3 + position));
            }
            int i4 = this.f25374b;
            position += i4 + i4;
        }
        byteBuffer.position(limit);
        this.f25379g.flip();
        this.f25380h = this.f25379g;
    }

    /* renamed from: d */
    public final void mo15774d() {
        mo15776f();
        this.f25379g = C4927bf.f14427a;
        this.f25374b = -1;
        this.f25375c = -1;
        this.f25378f = null;
        this.f25377e = false;
    }

    /* renamed from: e */
    public final boolean mo15775e(int i, int i2, int i3) throws C4890af {
        boolean z = !Arrays.equals(this.f25376d, this.f25378f);
        int[] iArr = this.f25376d;
        this.f25378f = iArr;
        if (iArr == null) {
            this.f25377e = false;
            return z;
        } else if (i3 != 2) {
            throw new C4890af(i, i2, i3);
        } else if (!z && this.f25375c == i && this.f25374b == i2) {
            return false;
        } else {
            this.f25375c = i;
            this.f25374b = i2;
            this.f25377e = i2 != iArr.length;
            int i4 = 0;
            while (true) {
                int[] iArr2 = this.f25378f;
                if (i4 >= iArr2.length) {
                    return true;
                }
                int i5 = iArr2[i4];
                if (i5 < i2) {
                    this.f25377e = (i5 != i4) | this.f25377e;
                    i4++;
                } else {
                    throw new C4890af(i, i2, 2);
                }
            }
        }
    }

    /* renamed from: f */
    public final void mo15776f() {
        this.f25380h = C4927bf.f14427a;
        this.f25381i = false;
    }

    /* renamed from: g */
    public final boolean mo15777g() {
        return this.f25377e;
    }

    /* renamed from: h */
    public final boolean mo15778h() {
        return this.f25381i && this.f25380h == C4927bf.f14427a;
    }

    /* renamed from: i */
    public final void mo21811i(int[] iArr) {
        this.f25376d = iArr;
    }

    public final int zza() {
        int[] iArr = this.f25378f;
        return iArr == null ? this.f25374b : iArr.length;
    }

    public final void zze() {
        this.f25381i = true;
    }
}
