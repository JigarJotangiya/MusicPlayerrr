package com.bumptech.glide;

import com.bumptech.glide.C1743l;
import com.bumptech.glide.p047q.p049m.C2170a;
import com.bumptech.glide.p047q.p049m.C2174c;

/* renamed from: com.bumptech.glide.l */
/* compiled from: TransitionOptions */
public abstract class C1743l<CHILD extends C1743l<CHILD, TranscodeType>, TranscodeType> implements Cloneable {

    /* renamed from: g */
    private C2174c<? super TranscodeType> f6515g = C2170a.m10221b();

    /* renamed from: a */
    public final CHILD clone() {
        try {
            return (C1743l) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C2174c<? super TranscodeType> mo7674b() {
        return this.f6515g;
    }
}
