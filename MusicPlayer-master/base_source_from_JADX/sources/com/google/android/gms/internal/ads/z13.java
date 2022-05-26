package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
abstract class z13 extends z03<String> {

    /* renamed from: i */
    final CharSequence f26620i;

    /* renamed from: j */
    int f26621j = 0;

    /* renamed from: k */
    int f26622k;

    protected z13(b23 b23, CharSequence charSequence) {
        f13 unused = b23.f14278a;
        this.f26622k = Integer.MAX_VALUE;
        this.f26620i = charSequence;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo22314a() {
        int i;
        int i2 = this.f26621j;
        while (true) {
            int i3 = this.f26621j;
            if (i3 != -1) {
                int e = mo21207e(i3);
                if (e == -1) {
                    e = this.f26620i.length();
                    this.f26621j = -1;
                    i = -1;
                } else {
                    i = mo21206d(e);
                    this.f26621j = i;
                }
                if (i == i2) {
                    int i4 = i + 1;
                    this.f26621j = i4;
                    if (i4 > this.f26620i.length()) {
                        this.f26621j = -1;
                    }
                } else {
                    if (i2 < e) {
                        this.f26620i.charAt(i2);
                    }
                    if (i2 < e) {
                        this.f26620i.charAt(e - 1);
                    }
                    int i5 = this.f26622k;
                    if (i5 == 1) {
                        e = this.f26620i.length();
                        this.f26621j = -1;
                        if (e > i2) {
                            this.f26620i.charAt(e - 1);
                        }
                    } else {
                        this.f26622k = i5 - 1;
                    }
                    return this.f26620i.subSequence(i2, e).toString();
                }
            } else {
                mo22315b();
                return null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract int mo21206d(int i);

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract int mo21207e(int i);
}
